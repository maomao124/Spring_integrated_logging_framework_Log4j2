import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Project name(项目名称)：Spring整合日志框架Log4j2
 * Package(包名): PACKAGE_NAME
 * Class(类名): HelloLog4j
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/5
 * Time(创建时间)： 13:46
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class HelloLog4j
{
    private static final Logger log = LoggerFactory.getLogger(HelloLog4j.class);
    private String message;

    public void setMessage(String message)
    {
        this.message = message;
    }

    public void getMessage()
    {
        log.info("消息为：" + message);
    }
}
