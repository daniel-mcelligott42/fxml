package com.example.newtry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class userTest {
    //check that email is valid,takes param email//
    @Test
    public void checkEmail() {
        assertFalse(com.example.newtry.user.checkEmail("notemail"));

    }

    @Test
    public void checkEmail2() {
        assertFalse(com.example.newtry.user.checkEmail("email@gmail.com"));
    }

    //checks that password is long enough//
    @Test
    public void checkPlength() {
        assertFalse(com.example.newtry.user.passwordLength("sevenl"));
    }

    @Test
    public void checkPlength1() {
        assertFalse(com.example.newtry.user.passwordLength("eightlet"));
    }

    @Test
    public void checkPletter() {
        assertFalse(com.example.newtry.user.passwordLetter("12345678"));
    }
    @Test
    public void checkPletter2() {
        assertFalse(com.example.newtry.user.passwordLetter("12345678a"));
    }
    @Test
    public void checkPnumber() {
        assertFalse(com.example.newtry.user.passwordNumber("allletters"));
    }
    @Test
    public void checkPnumber1() {
        assertFalse(com.example.newtry.user.passwordNumber("lettersand9"));
    }
    @Test
    public void checkSymbol() {
        assertFalse(com.example.newtry.user.passworsymbol("nosymbols1"));
    }
    @Test
    public void checkSymbol1() {
        assertFalse(com.example.newtry.user.passworsymbol("symbols1@"));
    }

}