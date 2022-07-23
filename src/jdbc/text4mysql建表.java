package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class text4mysql建表 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //注册连接驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获取连接
        String url="jdbc:mysql://localhost:3306/db1";
        String username = "root";
        String password = "123";
        Connection conn = DriverManager.getConnection(url,username,password);
        //定义SQL语句

//            StringBuilder create_table_sql = new StringBuilder();
//            create_table_sql.append("create table  tb_brand"
//                    + "(id int primary key auto_increment,"
//                    + " brand_name  varchar(20) , "
//                    + " company_name varchar(20),"
//                    + " ordered int,"
//                    + " description varchar(100),"
//                    + " status int);");
//        StringBuilder create_table_sql = new StringBuilder();
//        create_table_sql.append("create table  tb_user(" +
//                "id int primary key auto_increment," +
//                "username varchar(20)," +
//                "password varchar(20)," +
//                "gender char(1)," +
//                "addr varchar(30));");
        StringBuilder create_table_sql = new StringBuilder();
        create_table_sql.append("create table  tb_user(" +
                "id int primary key auto_increment," +
                "username varchar(20)," +
                "password varchar(20));");
        // 获取SQL对象statement
        Statement stmt = conn.createStatement();
        //执行SQL
        //int   executeUpdate可以执行DML（返回受影响行数），DDl语句（成功也可能是0）
        //ResultSet    executeQuery执行DQL语句（返回ResultSet结果集对象）查询
        int count = stmt.executeUpdate(String.valueOf(create_table_sql));//受影响行数
        //处理结果
        System.out.println(count);
        //释放资源
        stmt.close();
        conn.close();
    }
}
