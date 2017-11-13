package normalFactory;

/**
 * 数据库日志记录器工厂类：具体工厂
 * Created by fengyuwusong on 2017/11/6 10:32.
 */
public class DatabaseLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
//        连接数据库代码...
//        创建数据库日志记录器对象
        //        初始化数据库日志记录器代码
        return new DatabaseLogger();
    }

    @Override
    public Logger createLogger(String str) {
//        使用参数String重载方法，不同方法实现
        return new DatabaseLogger();
    }

}
