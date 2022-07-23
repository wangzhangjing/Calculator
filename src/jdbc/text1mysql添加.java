package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class text1mysql添加 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //注册连接驱动
       Class.forName("com.mysql.jdbc.Driver");
       //获取连接
        String url="jdbc:mysql://localhost:3306/db1";
        String username = "root";
        String password = "123";
        Connection conn = DriverManager.getConnection(url,username,password);
        //定义SQL语句
        String sql = "insert into tb_user (username,password)value " +
                "('zhangsan','123'),('lisi','234')";
//        String sql = "insert into tb_brand (brand_name, company_name,ordered,description,status)value " +
////                "(1,'zs','123','男','北京')," +
////                "(2,'ls','234','男','济南')," +
////                "(3,'wmz','345','女','加洲')";
//                "('三只松鼠','三只松鼠股份有限公司',5,'好吃不上水',0)," +
//                "('华为','华为技术有限公司',100,'华为致力于。。。。',1)," +
//                "('小米','小米科技有限公司',50,'are you ok',1);";
//                "insert into cnm (id, name,qq,ww,zz,jj)value (2,'zj','ss','wd',2,125)"+
//                "insert into cnm (id, name,qq,ww,zz,jj)value (3,'qw','sdf','rr',4,193)";
//        String sql = "update user set address='广州' where uname='x'";
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
