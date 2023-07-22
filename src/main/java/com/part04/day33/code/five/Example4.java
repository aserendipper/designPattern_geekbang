package com.part04.day33.code.five;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aserendipper
 * @date 2023/7/22
 * @desc
 */
public class Example4 {
    public List<String> test1(List<String> passwords) {
        if (passwords == null || passwords.isEmpty()) {
            return null;
        }
        List<String> passwordsWithSalt = new ArrayList<>();
        for (String password : passwords) {
            if (password == null) {
                continue;
            }
            if (password.length() < 8) {
                // 此处省略业务代码
            } else {
                // 此处省略业务代码
            }
        }
        return passwordsWithSalt;
    }

    /**
     * 重构后的代码: 将部分逻辑抽成函数
     */
    public List<String> test2(List<String> passwords) {
        if (passwords == null || passwords.isEmpty()) {
            return null;
        }
        List<String> passwordsWithSalt = new ArrayList<>();
        for (String password : passwords) {
            if (password == null) {
                continue;
            }
            passwordsWithSalt.add(appendSalt(password));
        }
        return passwordsWithSalt;
    }

    private String appendSalt(String password) {
        String passwordWithSalt = password;
        if (password.length() < 8) {
            // 此处省略业务代码
        } else {
            // 此处省略业务代码
        }
        return passwordWithSalt;
    }
}
