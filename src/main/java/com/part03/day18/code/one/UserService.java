package com.part03.day18.code.one;

/**
 * @author aserendipper
 * @date 2023/7/5
 * @desc
 */
public interface UserService {
    boolean register(String cellphone, String password);
    boolean login(String cellphone, String password);
    UserInfo getUserInfoById(long id);
    UserInfo getUserInfoByCellphone(String cellphone);
}
