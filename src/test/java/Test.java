import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by wangzz on 2016/12/14.
 */
public class Test {
    public static void main(String[] args) {
        //加密密码
        encodePassword();
    }

    public static void encodePassword() {
        //加密密码
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(16);
        String pwd = bCryptPasswordEncoder.encode("123");
        System.out.println(pwd);
        //校验明文密码是否和加密密码匹配
        String encode = "$2a$16$lNyxEJn1FmkGKhCUomW/1.1TgO1vXSsKphQcZp5/t/BzOQSpUJdnW";
        System.out.println(bCryptPasswordEncoder.matches("123", encode));
    }
}
