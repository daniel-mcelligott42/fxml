package com.example.newtry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class userTest {
    @Test
    public void checkEmail(){
        assertFalse(user.checkEmail("notemail"));
    }
}