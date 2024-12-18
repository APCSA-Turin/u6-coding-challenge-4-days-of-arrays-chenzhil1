package com.example.project;
import java.util.Random;
public class Day1{
    private static String[] elf_names = {"Glitter", "Chocolate","Tiny","Snowflake","Frosty"};

    public static String generateElfName(String name){
        if(name.equals("") || name == null) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        String random = elf_names[(int) Math.random() * 5];
        String out = random + " " + name;
        return out;  
    }

    public static void main(String[] args) {
        String name = "Nina";
        String elfName = Day1.generateElfName(name);
        System.out.println(elfName);
    }


}