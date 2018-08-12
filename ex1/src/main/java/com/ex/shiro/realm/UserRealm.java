package com.ex.shiro.realm;

import com.ex.model.User;
import com.ex.service.IUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * by luoqi
 * 描述
 * 日期 2018/8/9 23:21
 **/
public class UserRealm extends AuthorizingRealm {

    @Autowired
    private IUserService userService;
    private static final String SALT = "hello";

    @Override
    public String getName() {
        return "customRealm";
    }

    /*
     * 用户验证
     *
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        UsernamePasswordToken tmp = (UsernamePasswordToken) token;
        String userAccount = tmp.getUsername();
        String userPassword = String.valueOf(tmp.getPassword());


        User user = userService.findByUserAccount(userAccount);

        if(user == null) {

            System.out.println("认证：当前登录的用户不存在");

            //抛出错误
            throw new UnknownAccountException();


        }
        user.setPassword(userPassword);
        String pwd = user.getPassword();
        return new SimpleAuthenticationInfo(user, pwd, getName());
    }

    /**
     * 授权:
     *
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection){


        String l = "dq";
        return null;
    }

    public static String md5Pwd(String password, String salt) {
        // TODO Auto-generated method stub
        String md5Pwd = new Md5Hash(password, salt).toHex();
        return md5Pwd;
    }

}
