package com.example.newtry;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public  class user{
    public String email;
    public String pword;



public user(String email,String pword){
    this.email=email;
    this.pword=pword;

}

public static boolean checkEmail(String email) {
    Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
    Matcher mat = pattern.matcher(email);
    if (mat.matches()) {
        return true;
    }
    else
    {
        return false;
    }
    }

    public static boolean passwordLength(String pword) {
        if (pword.length() < 7) {
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean passwordLetter(String pword) {
        if (pword.matches("(?=.*[a-zA-Z]).*")){
            return true;
        }
        else{
            return false;
        }
    }
}