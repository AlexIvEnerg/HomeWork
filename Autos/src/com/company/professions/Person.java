package com.company.professions;

public class Person extends Driver {
    int age;

    public Person(int experience, String fullName, int age) {
        super(experience, fullName);
        this.age = age;
    }

}
