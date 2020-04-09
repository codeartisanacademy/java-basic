package com.company;

import java.util.Scanner;

public class EmailValidation {

    static Boolean validateEmail(String email){
        Boolean isValid = false;

        if(email.contains("@")){
            int atSignPosition = email.indexOf("@");
            String domainName = email.substring(atSignPosition+1);
            if(domainName!=""){
                System.out.println(domainName);
                System.out.println(domainName.substring(domainName.indexOf(".")+1));
                if(domainName.contains(".")){
                    return true;
                }
            }

        }

        return false;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String email;

        System.out.print("Enter your email: ");

        email = input.nextLine();

        if(validateEmail(email)){
            System.out.println("Email is valid");
        }else{
            System.out.println("Email invalid");
        }

    }
}
