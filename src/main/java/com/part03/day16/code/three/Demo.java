package com.part03.day16.code.three;

import com.part03.day16.code.one.AlertRule;

/**
 * @author aserendipper
 * @date 2023/7/2
 * @desc
 */
public class Demo {

    public static void main(String[] args) {
        ApiStatInfo apiStatInfo = new ApiStatInfo();
        // ...省略设置apiStatInfo数据值的代码
        //改动四：设置timeoutCount值
        apiStatInfo.setTimeoutCount(289);

        ApplicationContext.getInstance().getAlert().check(apiStatInfo);
    }
}
