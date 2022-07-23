package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class text2mysql修改 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        //获取连接
        String url="jdbc:mysql://localhost:3306/mybatis";
        String username = "root";
        String password = "123";
        Connection conn = DriverManager.getConnection(url,username,password);
        //定义SQL语句
        //wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
        //update user set uname='x'where urealname='血'where后面加的是条件不是改的数据,没有where全部都会修改切记
//        String sql = "update user set uname='x'where urealname='血'";
//        String sql = "alter table user add address varchar (30);";
        String sql = "alter table tb_user change addr  adder varchar (30);";
//        String sql = "create database mybatis";
        // 获取SQL对象statement
        Statement stmt = conn.createStatement();
        //执行SQL
        int count = stmt.executeUpdate(sql);//受影响行数
        //处理结果
        System.out.println(count);
        //释放资源
        stmt.close();
        conn.close();
    }
}
