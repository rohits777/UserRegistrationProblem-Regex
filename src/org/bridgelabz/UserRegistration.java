package org.bridgelabz;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner sc=new Scanner(System.in);

    public void checkFirstName(){
        System.out.println("Enter first name: ");
        String firstName=sc.next();
        if(Pattern.matches("^[A-Z]{1}[a-z]{3,}",firstName)){
            System.out.println("First name is valid...");
        }else {
            System.out.println("First name is invalid-!!");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to user registration program");
        UserRegistration validate= new UserRegistration();
        validate.checkFirstName();
    }
}
