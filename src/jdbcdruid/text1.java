//package jdbcdruid;
//
//import com.alibaba.druid.pool.DruidDataSourceFactory;
//import com.sun.deploy.panel.IProperty;
//
//import javax.sql.DataSource;
//import java.io.FileInputStream;
//import java.sql.Connection;
//import java.util.Properties;
//
///*
//*
//* 数据库连接池
//*
//* */
//public class text1 {
//    public static void main(String[] args) throws Exception {
////加载配置文件
//        Properties prop = new Properties();
//        prop.load(new FileInputStream("src/druid.properties"));
//        //获取对象
//        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
////获取连接
//        Connection connection = dataSource.getConnection();
//        System.out.println(connection);
////        System.out.println(System.getProperty("user.dir"));
//    }
//}
