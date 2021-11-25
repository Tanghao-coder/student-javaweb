package com.example.studentjavaweb.util;

import java.sql.*;

public class DBUtil {

    private static final String URL = "jdbc:mysql://localhost:3306/student_javaweb?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf-8&useSSL=false";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USER_NAME = "root";
    private static final String PWD = "root";

    // 加载驱动 jdbc4.0
    static {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取连接
     * @return
     */
    public static Connection getConn() {
        try {
            return DriverManager.getConnection(URL,USER_NAME,PWD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 关闭结果集
     * @param resultSet
     */
    public static void closeResultSet(ResultSet resultSet) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 关闭ps
     * @param ps
     */
    public static void closePs(PreparedStatement ps) {
        try {
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 关闭连接
     * @param conn
     */
    public static void closeConn(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        System.out.println(DBUtil.getConn());
    }
}
