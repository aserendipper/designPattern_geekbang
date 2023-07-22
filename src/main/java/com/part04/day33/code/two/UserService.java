package com.part04.day33.code.two;

/**
 * @author aserendipper
 * @date 2023/7/22
 * @desc
 */
public interface UserService {
    // 重构前的代码
    
    public void getUser(String username, String telephone, String email);
    
    // 重构后的代码
    
    public void getUserByUsername(String username);
    public void getUserByTelephone(String telephone);
    public void getUserByEmail(String email);
}
