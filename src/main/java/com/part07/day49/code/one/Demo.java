package com.part07.day49.code.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author aserendipper
 * @date 2023/8/9
 * @desc
 */
public class Demo {
    public void test() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/test?user=root&password=123456&useUnicode=true&characterEncoding=UTF8";
        Connection conn = DriverManager.getConnection(url);
        Statement stmt = conn.createStatement();
        String query = "select * from user";
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            System.out.println(rs.getString(1));
        }
    }
}
