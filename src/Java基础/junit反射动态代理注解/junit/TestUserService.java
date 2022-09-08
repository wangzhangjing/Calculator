package Java基础.junit反射动态代理注解.junit;

import org.junit.*;

//测试
public class TestUserService {
    @Before//只能修饰实例方法
    public void before(){
        System.out.println("===before方法执行一次===");
    }
    @After
    public void after(){
        System.out.println("===after方法执行一次===");
    }

    @BeforeClass//只能修饰实例方法
    public static void beforeClass(){
        System.out.println("===beforecaaaa方法执行一次===");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("===aftercaaaaaa方法执行一次===");

    }
    /**
     * 测试方法
     */
    @Test
    public void testLoginName(){
        UserService userService=new UserService();
        String name = userService.loginName("admin", "123456");
        //进行预期结果的正确性测试，断言
        Assert.assertEquals("您的功能业务可能从问题了","登入成功",name);
    }
    @Test
    public void testSelectNames(){
        UserService userService=new UserService();
        userService.selectName();
    }
}
