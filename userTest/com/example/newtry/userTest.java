package com.example.newtry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class userTest {
    @Test
    public void checkEmail(){
        assertFalse(com.example.newtry.user.checkEmail("notemail"));

    }
    @Test
    public void checkEmail2(){
        assertFalse(com.example.newtry.user.checkEmail("email@gmail.com"));
    }
}