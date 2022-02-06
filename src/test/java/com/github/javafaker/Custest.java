package com.github.javafaker;

import java.util.Locale;

public class Custest {
    public static void main(String[] args) {
        Faker faker = new Faker(Locale.CHINA);
        String state = faker.address().state();
        System.out.println(state);
        System.out.println(faker.address().city());
        System.out.println(faker.address().fullAddress());
    }
}
