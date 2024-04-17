package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class EmailTest {
    private Email emailObject;

    @BeforeEach
    void setUp() {
        emailObject = new Email();
    }

    @ParameterizedTest
    @ValueSource (strings = {"julyadoroshenko@ukr.site.com", "julyadoroshenko0205@ukr.site.com"})
    void validEmail(String email) {
        Assertions.assertTrue(emailObject.checkEmail(email));
    }

    @ParameterizedTest
    @ValueSource (strings = {"1julyadoroshenko0205@ukr.site.com", "julyadoroshenko0205-@ukr.site.com",
            "julyadoroshenko0205@gmail.com", "julyadoroshenko0205@gmail.c", "julyadoroshenko0205ukr.site.com"})
    void invalidEmail(String email) {
        Assertions.assertFalse(emailObject.checkEmail(email));
    }
}
