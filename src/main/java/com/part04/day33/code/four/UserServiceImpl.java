package com.part04.day33.code.four;

import org.apache.commons.lang3.StringUtils;

/**
 * @author aserendipper
 * @date 2023/7/22
 * @desc 不想重写方法，因此用abstract修饰
 */
public abstract class UserServiceImpl implements UserService {
    public boolean checkUserIfExisting(String telephone, String username, String email) {
        if (!StringUtils.isBlank(telephone)) {
            User user = selectUserByTelephone(telephone);
            return user != null;
        }
        if (!StringUtils.isBlank(username)) {
            User user = selectUserByUsername(username);
            return user != null;
        }
        if (!StringUtils.isBlank(email)) {
            User user = selectUserByEmail(email);
            return user != null;
        }
        return false;
    }
}
