package jdbc;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class text6 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //注册连接驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获取连接
        String url="jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "123";
        Connection conn = DriverManager.getConnection(url,username,password);
        //定义SQL语句
        String sql = "select * from cnm";
        // 获取SQL对象statement
        Statement stmt = conn.createStatement();
        //执行sql
        ResultSet rs = stmt.executeQuery(sql);
        //处理结果
        List<Account> list = new ArrayList<>();
        //光标向下移动，判断是否有数据遍历数据
        while(rs.next()){
            Account account = new Account();
            int id =rs.getInt(1);
            //也可以int id =rs.getInt("id");
            String name =rs.getString(2);
            //String name =rs.getString("name");
            int jj =rs.getInt(6);
            //int jj =rs.getInt("jj");
            account.setId(id);
                    account.setName(name);
            account.setJj(jj);
            list.add(account);
//            System.out.println(id);
//            System.out.println(name);
//
//            System.out.println(jj);
//            System.out.println(".................................");


        }
//释放资源
        rs.close();
        stmt.close();
        conn.close();System.out.println(list);
    }
}
