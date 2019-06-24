package learn.t.concurrent.tatomic;

/*
 * Class: Person
 * Description: TODO
 * Version: 0.0.1
 * author: gaichao || Creation date: 2019/6/24 16:06
 * All rights reserved.
 */
public class  Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    public String toString() {
        return "[name: " + this.name + ", age: " + this.age + "]";
    }
}