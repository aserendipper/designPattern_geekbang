package com.part03.day21.code.two;

/**
 * @author aserendipper
 * @date 2023/7/7
 * @desc
 */
public class UserService {
    private UserRepo userRepo;
    
    public User login(String email, String password) {
        boolean existed = userRepo.checkIfUserExisted(email, password);
        if (!existed) {
            throw new RuntimeException("user not exist");
        }
        User user = userRepo.getUserByEmail(email);
        return user;
    }
}
