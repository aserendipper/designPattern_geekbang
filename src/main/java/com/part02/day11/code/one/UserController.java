package com.part02.day11.code.one;

/**
 * @author aserendipper
 * @date 2023/6/26
 * @desc
 */
public class UserController {
    /**
     * 通过构造函数或者IOC框架注入
     */
    private UserService userService;
    public UserVo getUserById(Long userId) {
        UserBo userBo = userService.getUserById(userId);
        return convertToUserVo(userBo);
    }

    private UserVo convertToUserVo(UserBo userBo) {
        return new UserVo();
    }
}
