package org.example.test_practice;

public class User {

    public String getPassword() {
        return password;
    }

    private String password;

    public void initPassword(PasswordGenerator passwordGenerator) {
        String password = passwordGenerator.generatePassword();
        /**
         * 비밀번호가 최소 8자 이상 12자 이하여야 한다.
         */
        if (password.length() >= 8 && password.length() <= 12) {
            this.password = password;
        }

    }
}
