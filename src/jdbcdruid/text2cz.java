package jdbcdruid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

//增删改查
public class text2cz {

    public static void main(String[] args) throws Exception {

         selectAll();
         sjadd();
         xgbiao();
         cshang();

    }

    private static void cshang() throws Exception {
        int id =4;
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/druid.properties"));
        //获取对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
//获取连接
        Connection conn = dataSource.getConnection();
        //定义SQL语句
        String sql ="delete from tb_brand where id=?";
        //获取pstms对象
        PreparedStatement pstms = conn.prepareStatement(sql);
        //设置参数

        pstms.setInt(1,id);
        //执行sql
        int rs = pstms.executeUpdate();
        //处理结果
        System.out.println(rs>0);




//释放资源

        conn.close();
        pstms.close();
    }

    private static void xgbiao() throws Exception {


        String brandName="旺仔牛逼糖";
        String companyName="旺仔有限公司";
        int ordered= 189;
        String description = "头不痛了，心不跳了，当天立马见孝";
        int status=1;
        int id =4;
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/druid.properties"));
        //获取对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
//获取连接
        Connection conn = dataSource.getConnection();
        //定义SQL语句
        String sql ="update tb_brand " +
                "set brand_name =?," +
                "company_name=?," +
                "ordered=?," +
                "description=?," +
                "status=? " +
                "where id=?";
        //获取pstms对象
        PreparedStatement pstms = conn.prepareStatement(sql);
        //设置参数
        pstms.setString(1,brandName);
        pstms.setString(2,companyName);
        pstms.setInt(3,ordered);
        pstms.setString(4,description);
        pstms.setInt(5,status);
        pstms.setInt(6,id);
        //执行sql
        int rs = pstms.executeUpdate();
        //处理结果
        System.out.println(rs>0);




//释放资源

        conn.close();
        pstms.close();
    }

    private static void sjadd() throws Exception {


      String brandName="旺仔牛逼糖";
      String companyName="旺仔混子公司";
      Integer ordered= 1;
      String description = "当天立马见孝";
      int status=1;
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/druid.properties"));
        //获取对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
//获取连接
        Connection conn = dataSource.getConnection();
        //定义SQL语句
        String sql ="insert into tb_brand (brand_name, company_name,ordered,description,status)value(?,?,?,?,?)";
        //获取pstms对象
        PreparedStatement pstms = conn.prepareStatement(sql);
        //设置参数
        pstms.setString(1,brandName);
        pstms.setString(2,companyName);
        pstms.setInt(3,ordered);
        pstms.setString(4,description);
        pstms.setInt(5,status);
        //执行sql
        int rs = pstms.executeUpdate();
        //处理结果
        System.out.println(rs>0);




//释放资源

        conn.close();
        pstms.close();
    }

    private static void selectAll() throws Exception {
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/druid.properties"));
        //获取对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
//获取连接
        Connection conn = dataSource.getConnection();
        //定义SQL语句
        String sql ="select * from tb_brand";
        //获取pstms对象
        PreparedStatement pstms = conn.prepareStatement(sql);
        //设置参数
        //执行sql
        ResultSet rs = pstms.executeQuery();

        List<Brand> list = new ArrayList<>();
        //光标向下移动，判断是否有数据遍历数据
        while(rs.next()){
            //获取数据

            int id =rs.getInt("id");
            //也可以int id =rs.getInt("id");
            String brandName = rs.getString("brand_name");
            //String name =rs.getString("name");
            String companyName = rs.getString("company_name");
            int ordered = rs.getInt("ordered");
            String description = rs.getString("description");
            int status = rs.getInt("status");
            //int jj =rs.getInt("jj");
            //封装brand对象
            Brand brand = new Brand();
            brand.setId(id);
            brand.setBrandName(brandName);
            brand.setCompanyName(companyName);
            brand.setOrdered(ordered);
            brand.setDescription(description);
            brand.setStatus(status);
            list.add(brand);
//            System.out.println(id);
//            System.out.println(name);
//
//            System.out.println(jj);
//            System.out.println(".................................");


        }
//释放资源
        System.out.println(list);
        rs.close();
        pstms.close();
    }
}
