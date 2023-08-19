package com.part08.day57.code.one;

import com.part08.day56.code.two.RegObserver;
import com.part08.day56.code.two.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/**
 * @author aserendipper
 * @date 2023/8/18
 * @desc 异步非阻塞第二种实现方式
 */
public class UserController {
    private UserService userService;
    private List<RegObserver> regObservers = new ArrayList<>();
    private Executor executor;

    public UserController(Executor executor) {
        this.executor = executor;
    }

    public void setRegObservers(List<RegObserver> regObservers) {
        this.regObservers = regObservers;
    }
    
    public Long registry(String telephone, String password) {
        long userId = userService.register(telephone, password);
        for (RegObserver regObserver : regObservers) {
            executor.execute(() -> regObserver.handleRegSuccess(userId));
        }
        return userId;
    }
}
