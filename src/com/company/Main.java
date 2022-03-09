package com.company;

public class Main {

    public static void main(String[] args) {
        Student programmer = new Student();
        programmer.setName("");
        programmer.setSurname("Курбанбаев");
        programmer.setAge(-30);
        programmer.setMail("kurbanbaev@mail.com");

        System.out.println(programmer.getAge());
        System.out.println("менин атым: "+programmer.getName());
        System.out.println(programmer.getSurname());
        System.out.println(programmer.getMail());

    }
}
