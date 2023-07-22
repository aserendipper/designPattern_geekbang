package com.part04.day33.code.one;

import java.util.Calendar;
import java.util.Date;

/**
 * @author aserendipper
 * @date 2023/7/21
 * @desc
 */
public class Test {
    /**
     * 重构前的代码
     */
    public void invest(long userId, long financialProductId) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.DATE, calendar.get(Calendar.DATE) + 1);
        if (calendar.get(Calendar.DAY_OF_MONTH) == 1) {
            return;
        }
    }
    
    /**
     * 重构后的代码
     */
    public void invest2(long userId, long financialProductId) {
        if (isLastDayOfTheMonth(new Date())) {
            return;
        }
    }

    private boolean isLastDayOfTheMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DATE, calendar.get(Calendar.DATE) + 1);
        return calendar.get(Calendar.DAY_OF_MONTH) == 1;
    }
}
