package com.part02.day11.code.one;

/**
 * @author aserendipper
 * @date 2023/6/26
 * @desc
 */
public class UserService {
    /**
     * 通过构造函数或者IOC框架注入
     */
    private UserRepository userRepository;
    
    public UserBo getUserById(Long userId) {
        UserEntity userEntity = userRepository.getUserById(userId);
        return convertToUserBo(userEntity);
    }

    private UserBo convertToUserBo(UserEntity userEntity) {
        return new UserBo();
    }
}
