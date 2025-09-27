package com.example;

public class Greeting {
    public String getMessage() {
        return "Hey Barani, you will become a DevOps Engineer";
    }

    public static void main(String[] args) {
        System.out.println(new Greeting().getMessage());
    }
}
