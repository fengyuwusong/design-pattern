package normalFactory;

/**
 * Created by fengyuwusong on 2017/11/6 10:35.
 */
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
//        创建文件日志记录器对象
        Logger logger=new FileLogger();
        return logger;
    }

    @Override
    public Logger createLogger(String str) {
        //        使用参数String重载方法，不同方法实现
        return new DatabaseLogger();
    }
}
