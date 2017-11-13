package normalFactory;

/**
 * Created by fengyuwusong on 2017/11/6 10:31.
 */
public class FileLogger implements  Logger{

    @Override
    public void writeLog() {
        System.out.println("文件日志功能！");
    }
}
