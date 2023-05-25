package org.example.test_practice;

import org.example.test_practice.PasswordGenerator;

public class WrongFixedPasswordGenerator implements PasswordGenerator {
    @Override
    public String generatePassword() {
        return "ab"; // 2글자
    }
}
