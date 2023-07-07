package com.part03.day18.code.two;

/**
 * @author aserendipper
 * @date 2023/7/5
 * @desc
 */
public interface RestrictedUserService {
    boolean deleteUserByCellphone(String cellphone);
    boolean deleteUserById(long id);
}
