package com.itheima.pojo;

/**
 * @ClassName User
 * @Description TODO:
 * @Author 阿毛
 * @Date 10:29 2019/7/18
 * @Version 2.1
 **/
public class User {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }


    // mdh git 03
}
