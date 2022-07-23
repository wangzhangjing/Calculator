package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class text3mysql删除 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        //获取连接
        String url="jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "123";
        Connection conn = DriverManager.getConnection(url,username,password);
        //定义SQL语句

        String sql = "delete from user where urealname='王五'";
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
