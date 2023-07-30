package com.part06.day41.code.one;

/**
 * @author aserendipper
 * @date 2023/7/29
 * @desc
 */
public class UserController {
    private Logger logger = new Logger();
    
    public void login(String username, String password) {
        // ...省略业务逻辑代码...
        logger.log(username + " logined!");
    }
}
