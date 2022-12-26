package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    public static boolean verifyFirstName(String firstName){
        boolean verify = (Pattern.matches("^[A-Z][a-z]{2,}$", firstName));
        if (verify){
            System.out.println("Welcome :: "+ firstName);
            return true;
        }else {
            System.out.println("Please enter the valid input...");
            return false;
        }
    }
    public static boolean verifyLastName(String LastName){
        boolean verify = (Pattern.matches("^[A-Z][a-z]{2,}$", LastName));
        if (verify){
            System.out.println("Welcome :: "+ LastName);
            return true;
        }else {
            System.out.println("Please enter the valid input...");
            return false;
        }
    }
    public static boolean verifyEmail(String email){
        boolean verify = (Pattern.matches("^[A-za-z]+([_+-.][a-zA-Z])*[@][a-zA-Z]+[.][a-z]{2,3}([.][a-z]{2})*$", email));
        if (verify){
            System.out.println("Entered email is :: "+ email + " valid...!!!");
            return true;
        }else {
            System.out.println("Please enter the valid input...");
            return false;
        }
    }

    public static boolean verifyPhoneNumber(String phnum){
        boolean verify = Pattern.matches("^[+](91)[6-9][0-9]{9}$", phnum);
        if (verify){
            System.out.println("Entered phone number is :: "+ phnum + " valid...!!!");
            return true;
        }else {
            System.out.println("Please enter the valid input...");
            return false;
        }
    }

    public static boolean verifyPassword(String pwd){
        boolean verify = Pattern.matches("^[A-Z]+[0-9]+[_+-.][A-Za-z0-9]{6,}$", pwd);
        if (verify){
            System.out.println("Entered Password is :: "+ pwd + " valid...!!!");
            return true;
        }else {
            System.out.println("Please enter the valid input...");
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the User Registration Problem...!!!");
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the First Name :: ");
        String firstName = sc.next();

        verifyFirstName(firstName);

        System.out.print("Please enter the Last Name :: ");
        String lastName = sc.next();

        verifyLastName(lastName);

        System.out.print("Please enter the Email :: ");
        String email = sc.next();

        verifyEmail(email);

        System.out.print("Please enter the Phone number :: ");
        String phnum = sc.next();

        verifyPhoneNumber(phnum);

        System.out.print("Please enter the Password :: ");
        String pwd = sc.next();

        verifyPassword(pwd);

    }
}
