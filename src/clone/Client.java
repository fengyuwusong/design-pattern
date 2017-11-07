package clone;

import java.io.IOException;

/**
 * Created by fengyuwusong on 2017/11/6 10:53.
 */
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        WeekLog log_previous = new WeekLog();
        log_previous.setName("张无忌");
        log_previous.setDate("第12周");
        log_previous.setContent("这周工作很忙，每天加班！");

        System.out.println("-----周报------");
        System.out.println("周次：" + log_previous.getDate());
        System.out.println("姓名：" + log_previous.getName());
        System.out.println("内容：" + log_previous.getContent());

        WeekLog log_new = log_previous.clone();

        log_new.setDate("第13周");
        System.out.println("-----周报------");
        System.out.println("周次：" + log_new.getDate());
        System.out.println("姓名：" + log_new.getName());
        System.out.println("内容：" + log_new.getContent());


        System.out.println(log_previous==log_new);
        System.out.println(log_new.getContent()==log_previous.getContent());
        System.out.println(log_new.getDate()==log_previous.getDate());
        System.out.println(log_new.getName()==log_previous.getName());
    }
}
