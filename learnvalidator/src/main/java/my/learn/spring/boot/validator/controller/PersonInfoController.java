package my.learn.spring.boot.validator.controller;

import my.learn.spring.boot.validator.entity.Person;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PersonInfoController {
   /* @GetMapping("/info")
    public String getPersonInfo(@Validated Person person, BindingResult bindingResult)
    {

        String errorMsg = "";
        if(bindingResult.hasErrors())
        {
            errorMsg = bindingResult.getFieldError().getDefaultMessage();
            System.out.println("*********************");
        }
        return "hello"+person.getName()+errorMsg;
    }*/
   @GetMapping("/info")
   public String getPersonInfo(@Validated Person person)
   {

       String errorMsg = "";

       return "hello"+person.getName()+errorMsg;
   }
}
