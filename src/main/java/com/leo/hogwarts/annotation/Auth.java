package com.leo.hogwarts.annotation;

import java.lang.annotation.*;

/**
 * @ClassName Auth
 * @Description 登录校验注解
 * @Author Leo
 * @Date 2020/3/31 14:56
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target({ElementType.METHOD , ElementType.TYPE})
public @interface Auth {

}
