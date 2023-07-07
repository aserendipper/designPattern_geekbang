package com.part03.day18.code.two;

import com.part03.day18.code.one.UserInfo;
import com.part03.day18.code.one.UserService;

/**
 * @author aserendipper
 * @date 2023/7/5
 * @desc
 */
public class UserServiceImpl implements UserService, RestrictedUserService {

    @Override
    public boolean register(String cellphone, String password) {
        return false;
    }

    @Override
    public boolean login(String cellphone, String password) {
        return false;
    }

    @Override
    public UserInfo getUserInfoById(long id) {
        return null;
    }

    @Override
    public UserInfo getUserInfoByCellphone(String cellphone) {
        return null;
    }

    @Override
    public boolean deleteUserByCellphone(String cellphone) {
        return false;
    }

    @Override
    public boolean deleteUserById(long id) {
        return false;
    }
}
