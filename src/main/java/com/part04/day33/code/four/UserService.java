package com.part04.day33.code.four;

/**
 * @author aserendipper
 * @date 2023/7/22
 * @desc
 */
public interface UserService {
    // 重构前的代码
    
    public User selectUserByTelephone(String telephone);
    public User selectUserByUsername(String username);
    public User selectUserByEmail(String email);
    
    // 重构后的代码
    
    public boolean checkUserIfExistingByTelephone(String telephone);
    public boolean checkUserIfExistingByUsername(String username);
    public boolean checkUserIfExistingByEmail(String email);
}
