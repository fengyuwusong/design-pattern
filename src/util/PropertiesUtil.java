package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Properties配置文件读取工具类
 * Created by fengyuwusong on 2017/11/13 10:24.
 */
public class PropertiesUtil {

    public static String getString(String url, String arg) {
        InputStream is = Properties.class.getResourceAsStream(url);
        Properties properties = new Properties();
        try {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return properties.getProperty(arg);
    }
}
