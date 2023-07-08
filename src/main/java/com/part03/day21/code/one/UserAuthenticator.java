package com.part03.day21.code.one;

import org.apache.commons.lang3.StringUtils;
/**
 * @author aserendipper
 * @date 2023/7/7
 * @desc
 */
public class UserAuthenticator {
    public void authenticate(String username, String password) {
        if (!isValidUsername(username)) {
            // ...
        }
        if (!isValidPassword(password)) {
            // ...
        }
        // ...
    }
    
    private boolean isValidUsername(String username) {
        if (StringUtils.isBlank(username)) {
            return false;
        }
        int length = username.length();
        if (length < 4 || length > 64) {
            return false;
        }
        if (!StringUtils.isAllLowerCase(username)) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char c = username.charAt(i);
            if (!(c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '.') {
                return false;
            }
        }
        return true;
    }

    private boolean isValidPassword(String password) {
        if (StringUtils.isBlank(password)) {
            return false;
        }
        int length = password.length();
        if (length < 4 || length > 64) {
            return false;
        }
        if (!StringUtils.isAllLowerCase(password)) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char c = password.charAt(i);
            if (!(c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '.') {
                return false;
            }
        }
        return true;
    }
}
