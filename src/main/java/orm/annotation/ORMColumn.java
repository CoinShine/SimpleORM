package orm.annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * description: 定义设置字段名的注解
 * @author coinshine
 * @date 2019/03/08 17:59
 * @version 1.0
 */
@Retention(RetentionPolicy.RUNTIME) //运行期间保留注解的信息
@Target(ElementType.FIELD) //设置注解作用范围
public @interface ORMColumn {
    String name() default "";
}
