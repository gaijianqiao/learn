package my.learn.spring.boot.validator.entity;


import javax.validation.constraints.Size;

public class Person {
    @Size(max = 10,message = "长度大于10")
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
