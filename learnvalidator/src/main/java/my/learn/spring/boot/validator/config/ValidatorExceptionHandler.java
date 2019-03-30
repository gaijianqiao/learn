package my.learn.spring.boot.validator.config;

import my.learn.spring.boot.validator.common.BaseResponse;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@ControllerAdvice
public class ValidatorExceptionHandler {
    @ExceptionHandler(BindException.class)
    @ResponseBody
    BaseResponse handleControllerException(HttpServletRequest request, Throwable ex) {
        BaseResponse baseResponse = new BaseResponse();
        if (ex instanceof BindException) {
            BindException bindException = BindException.class.cast(ex);
            List<ObjectError> errors = bindException.getBindingResult().getAllErrors();

            baseResponse.setCode(String.valueOf(400));
            baseResponse.setMsg("参数错误：" + errors.get(0).getDefaultMessage());
        }
        return baseResponse;


}
}
