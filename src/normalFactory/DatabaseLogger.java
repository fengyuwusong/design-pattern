package normalFactory;

/**
 * Created by fengyuwusong on 2017/11/6 10:30.
 */
public class DatabaseLogger implements Logger{
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录！");
    }
}
