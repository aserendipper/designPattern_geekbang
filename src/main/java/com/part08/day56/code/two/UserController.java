package com.part08.day56.code.two;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aserendipper
 * @date 2023/8/18
 * @desc
 */
public class UserController {
    private UserService userService;
    private List<RegObserver> regObservers = new ArrayList<>();

    public void setRegObservers(List<RegObserver> regObservers) {
        this.regObservers = regObservers;
    }

    public Long register(String telephone, String password) {
        long userId = userService.register(telephone, password);
        for (RegObserver regObserver : regObservers) {
            regObserver.handleRegSuccess(userId);
        }
        return userId;
    }
}
