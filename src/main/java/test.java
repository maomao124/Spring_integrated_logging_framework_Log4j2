import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Project name(项目名称)：Spring整合日志框架Log4j2
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/5
 * Time(创建时间)： 13:48
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    private static final Logger log = LoggerFactory.getLogger(test.class);

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        log.info("正在从容器中获取 HelloLog4j 的 Bean");
        HelloLog4j obj = context.getBean("helloLog4j", HelloLog4j.class);
        obj.getMessage();
        log.info("代码执行完成！");
    }
}
