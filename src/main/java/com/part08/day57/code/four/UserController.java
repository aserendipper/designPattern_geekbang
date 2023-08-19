package com.part08.day57.code.four;

import com.part08.day56.code.two.UserService;
import com.part08.day57.code.three.AsyncEventBus;
import com.part08.day57.code.three.EventBus;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

/**
 * @author aserendipper
 * @date 2023/8/18
 * @desc 使用EventBus实现代码
 */
public class UserController {
    private UserService userService;
    private EventBus eventBus;
    private static final int DEFAULT_EVENTBUS_THREAD_POOL_SIZE = 20;

    public UserController() {
        // 同步阻塞模式
        //this.eventBus = new EventBus();
        // 异步非阻塞模式
        this.eventBus = new AsyncEventBus(Executors.newFixedThreadPool(DEFAULT_EVENTBUS_THREAD_POOL_SIZE));
    }

    public void setRegObservers(List<Object> regObservers) {
        for (Object regObserver : regObservers) {
            eventBus.register(regObserver);
        }
    }
    
    public Long registry(String telephone, String password) {
        Long userId = 1L;
        eventBus.post(userId);
        return userId;
    }

    public static void main(String[] args) {
        UserController userController = new UserController();
        List<Object> regObservers = new ArrayList<>();
        regObservers.add(new RegNotificationObserver());
        regObservers.add(new RegPromotionObserver());
        userController.setRegObservers(regObservers);
        userController.registry("123456789", "123456");
    }
}
