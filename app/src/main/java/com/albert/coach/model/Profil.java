package com.albert.coach.model;

public class Profil {
    //Proprieties
    private Integer weight ;
    private Integer size ;
    private Integer age ;
    private Integer sex ;
    private float bmi ;
    private String message ;

    private static final Integer minWoman = 15 ;
    private static final Integer maxWoman = 30 ;
    private static final Integer minMan = 10 ;
    private static final Integer maxMan = 20 ;

    public Integer getWeight() {
        return weight;
    }

    public Integer getSize() {
        return size;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSex() {
        return sex;
    }

    public float getBmi() {
        return bmi;
    }

    public String getMessage() {
        return message;
    }

    public Profil(Integer weight, Integer size, Integer age, Integer sex) {
        this.weight = weight;
        this.size = size;
        this.age = age;
        this.sex = sex;
    }
}
