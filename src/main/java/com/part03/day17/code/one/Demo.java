package com.part03.day17.code.one;

/**
 * @author aserendipper
 * @date 2023/7/4
 * @desc
 */
public class Demo {

    public void demoFunction(Transporter transporter) {
        Request request = new Request();
        // ...省略设置request中数据值的代码...
        Response response = transporter.sendRequest(request);
        // ...省略其他逻辑...
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.demoFunction(new Transporter(new HttpClient()));
        demo.demoFunction(new SecurityTransporter(new HttpClient(), "appId:1001", "token:xxx"));
    }
}
