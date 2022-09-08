package Java基础.junit反射动态代理注解.junit;

public class UserService {
    public String loginName(String loginName ,String passWord){
        if ("admin".equals(loginName)&&"123456".equals(passWord)){
            return "登入成功";
        }else {
            return "登入失败";
        }
    }

    public void selectName(){
        System.out.println(10/2);
        System.out.println("查询全部用户成功");
    }
}
