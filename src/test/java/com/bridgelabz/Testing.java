package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;

public class Testing {
    UserRegistration userRegistration = new UserRegistration();
    @Test
    public void FirstNameTest(){
        Assert.assertEquals(true, userRegistration.verifyFirstName("Rohit"));
    }
    @Test
    public void LastNameTest(){
        Assert.assertEquals(true, userRegistration.verifyLastName("Shinde"));
    }
    @Test
    public void PhoneNumTest(){
        Assert.assertEquals(true, userRegistration.verifyPhoneNumber("+918799554433"));
    }
    @Test
    public void PasswordTest(){
        Assert.assertEquals(true, userRegistration.verifyPassword("A1+abcdefgh"));
    }
}
