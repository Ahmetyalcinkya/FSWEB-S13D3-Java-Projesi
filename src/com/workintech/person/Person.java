package com.workintech.person;

public class Person {

    String firstName;
    String lastName;
    int age ;
    String hairColor;
    double height;
    double weight;


    // constructor

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int age, String hairColor){
        this(firstName, lastName);
        this.age = age;
        this.hairColor = hairColor;
    }

    public Person(String firstName, String lastName, int age, String hairColor, double height, double weight){
        this(firstName, lastName, age, hairColor);
        this.height = height;
        this.weight = weight;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }

    public String getFullName(){
        return getFirstName() + " " + getLastName();
    }
    public  int getAge(){
        return this.age;
    }

    public boolean isTeen(){
        return this.age >= 13 && this.age <= 19;
    }

    public double calcBodyMassIndex(){
        double square = 2;
        return weight / Math.pow( height, square);
    }

    @Override
    public  String toString(){
        return "Person : " + "firstname : "+ firstName + " lastname :" + lastName + " age : " + age + " haircolor : " + hairColor + " height : " + height + " weight : "+weight;
    }
}
