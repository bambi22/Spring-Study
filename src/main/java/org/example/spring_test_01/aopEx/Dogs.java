package org.example.spring_test_01.aopEx;

public class Dogs {
    private String breed;
    private int age;
    private String color;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getDogsInfo(){
        System.out.println("품종 : " + getBreed());
        System.out.println("나이 : " + getAge());
        System.out.println("색상 : " + getColor());
    }
}
