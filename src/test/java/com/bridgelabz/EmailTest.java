package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

public class EmailTest {


    @RunWith(Parameterized.class)
    public class EmailTestCase {
        boolean exp;
        String input;

        public EmailTestCase(boolean exp, String input){
            super();
            this.exp = exp;
            this.input = input;
        }

        @Test
        public void emailIDTest() {
            UserRegistration userRegistration = new UserRegistration();
            Assert.assertEquals(exp,userRegistration.verifyEmail(input));
        }

        @Parameters
        public static Object emailIDs() {
            return Arrays.asList(
                    new Object[][]{
                            {true, "abc@gmail.com"},
                            {true, "abc_def@gmail.com"},
                            {true, "abc@gmail.co.in"},
                            {true, "abc@def.com"},
                            {true, "abc@xyz.org"},
                            {true, "abc@gov.in"},
                    }
            );
        }
    }

}
