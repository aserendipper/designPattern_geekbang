package com.part02.day11.code.one;

/**
 * @author aserendipper
 * @date 2023/6/26
 * @desc repository+entity
 */
public class UserRepository {
    public UserEntity getUserById(Long userId) {
        //省略查询数据库的代码
        return new UserEntity();
    }
}
