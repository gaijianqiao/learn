package learn.t.concurrent.blocking;

/*
 * Class: Product
 * Description: TODO
 * Version: 0.0.1
 * author: gaichao || Creation date: 2019/6/24 13:16
 * All rights reserved.
 */
public class Product {
    private String name;
    private int age;

    public Product(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Product() {
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

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
