package org.example.test_practice;

import org.example.test_practice.PasswordGenerator;

public class CorrectFixedPasswordGenerator implements PasswordGenerator {
    @Override
    public String generatePassword() {
        return "abcdefgh"; // 8글자
    }
}
