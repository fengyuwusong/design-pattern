package normalFactory;

/**
 * 日志记录器：具体产品类
 * Created by fengyuwusong on 2017/11/6 10:31.
 */
public interface LoggerFactory {
    public Logger createLogger();

    //重载的工厂方法
    public Logger createLogger(String str);
}
