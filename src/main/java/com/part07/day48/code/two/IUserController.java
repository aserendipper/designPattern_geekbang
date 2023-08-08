package com.part07.day48.code.two;

import com.part02.day11.code.one.UserVo;

/**
 * @author aserendipper
 * @date 2023/8/8
 * @desc
 */
public interface IUserController {
    UserVo login(String telephone, String password);
    UserVo register(String telephone, String password);
}
