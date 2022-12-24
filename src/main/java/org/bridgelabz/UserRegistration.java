package main.java.org.bridgelabz;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner sc=new Scanner(System.in);
    public void checkFirstName(){
        System.out.print("Enter first name:-- ");
        String firstName=sc.nextLine();
        if(Pattern.matches("^[A-Z]{1}[a-z]{3,}",firstName)){
            System.out.println("First name is valid...");
        }else {
            System.out.println("*** First name is invalid-***");
        }
    }
    public void checkLastName(){
        System.out.println("------------------------------");
        System.out.print("Enter Last name:--");
        String lastName=sc.next();
        if(Pattern.matches("^[A-Z]{1}[a-z]{3,}",lastName)){
            System.out.println("Last name is valid....." );
    }else{
            System.out.println("****last name is Invalid..****");
        }
    }
    public void checkEmail() {
        System.out.println("----------------------------");
        System.out.print("Enter Email ID:-- ");
        String email = sc.next();
        if (Pattern.matches("^[a-zA-Z]{3,}[.]?[A-za-z0-9]{3,}[.]?[a-zA-Z]+[@]{1}[a-z]+[.]?[a-z]*", email)) {
            System.out.println("Email is Valid---!!");
        } else {
            System.out.println("*** Email is Invalid -***");
        }
    }
    public void checkPhoneNumber() {
        System.out.println("--------------------------");
        System.out.print("Enter PhoneNumber :-- ");
        String phoneNumber  = sc.nextLine();
        if (Pattern.matches("^[0-9]+\s[0-9]{10}", phoneNumber)) {
            System.out.println("PhoneNumber is Valid-----");
        } else {
            System.out.println("*** PhoneNumber is Invalid. ***");

         }
    }
    public void checkPasswordRule1() {
        System.out.println("-------------------");
        System.out.println("Enter Password :-  ");
        String password  = sc.nextLine();
        if (Pattern.matches("^[a-zA-z]{8,}",password)) {
            System.out.println("Password is Valid---!!");
        } else {
            System.out.println("**** Password is Invalid--****");
            checkPasswordRule1();
        }
    }
    public void checkPasswordRule2() {
        System.out.println("-------------------");
        System.out.println("Enter Password :-  ");
        String password  = sc.nextLine();
        if (Pattern.matches("^[A-z]+[A-Za-z]{8,}",password)) {
            System.out.println("Password is Valid---!!");
        } else {
            System.out.println("**** Password is Invalid--****");
        }
    }
    public void checkPasswordRule3() {
        System.out.println("-----------------");
        System.out.println("Enter Password : ");
        String password  = sc.nextLine();
        if (Pattern.matches("^[A-Z0-9]+[A-Za-z0-9]{8,}",password)) {
            System.out.println("Password is Valid---!!");
        } else {
            System.out.println("Password is Invalid--!!");
            checkPasswordRule1();
        }
    }
    public void checkPasswordRule4() {
        System.out.println("-----------------");
        System.out.println("Enter Password : ");
        String password  = sc.nextLine();
        if (Pattern.matches("^[A-Z]+[A-Za-z0-9]{7,}[!@#$%^&*()=]+",password)) {
            System.out.println("Password is Valid---!!");
        } else {
            System.out.println("Password is Invalid--!!");
            checkPasswordRule4();
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to user registration program");
        UserRegistration validate= new UserRegistration();
  //         validate.checkFirstName();
 //          validate.checkLastName();
 //          validate.checkEmail();
 //          validate.checkPhoneNumber();
 //          validate.checkPasswordRule1();
         //    validate.checkPasswordRule2();
        //  validate.checkPasswordRule3();
        validate.checkPasswordRule4();

    }
}
