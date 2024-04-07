package com.no10;

public class Cat {
    private int id;
    private String name;

    private String sex;
    private Integer age;


    public Cat(int id, String name, String sex, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public Integer getAge() {
        return age;
    }
    
}
