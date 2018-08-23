package pnunu.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author pnunu@git
 * @Date 2018/2/26 12:58
 * @Desc 水果颜色注解
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
    /**
     * 颜色枚举
     * @author peida
     */
    enum Color{ BULE,RED,GREEN}

    /**
     * 颜色属性
     * @return
     */
    Color fruitColor() default Color.GREEN;
}
