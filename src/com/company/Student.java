package com.company;

public class Student {

    private String name;
    private String surname;
    private String mail;
    private int age;

    void setName(String name){
        if (name.isEmpty()){
            System.out.println("нужно вписать свое имя!");

        }else
        this.name=name;

    }
    String getName (){
        return name;
    }
    void setSurname(String surname){
        this.surname=surname;

    }
    String getSurname(){
        return surname;
    }
    void setMail(String mail){
        this.mail=mail;

    }
    String getMail(){
        return mail;
    }
    void setAge(int age){
        this.age=age;
        if (age<1){
            System.out.println("возраст должен быть положительным");
        }

    }
    int getAge(){
        return age;
    }




}
