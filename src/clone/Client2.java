package clone;

/**
 * Created by fengyuwusong on 2017/11/6 11:09.
 */
public class Client2 {
    public static void main(String[] args) {
        DeepClone log_previous = new DeepClone();
        log_previous.setName("张无忌");
        log_previous.setDate("第12周");
        log_previous.setContent("这周工作很忙，每天加班！");
        Attachment attachment=new Attachment();
        attachment.setName("attachment");
        log_previous.setAttachment(attachment);

        System.out.println("-----周报------");
        System.out.println("周次：" + log_previous.getDate());
        System.out.println("姓名：" + log_previous.getName());
        System.out.println("内容：" + log_previous.getContent());
        System.out.println("附件下载：");
        log_previous.getAttachment().download();

        DeepClone log_new = (DeepClone) log_previous.deepClone();

        log_new.setDate("第13周");
        System.out.println("-----周报------");
        System.out.println("周次：" + log_new.getDate());
        System.out.println("姓名：" + log_new.getName());
        System.out.println("内容：" + log_new.getContent());
        System.out.println("附件下载：");
        log_previous.getAttachment().download();

        System.out.println(log_previous==log_new);
        System.out.println(log_new.getContent()==log_previous.getContent());
        System.out.println(log_new.getDate()==log_previous.getDate());
        System.out.println(log_new.getName()==log_previous.getName());
        System.out.println(log_new.getAttachment()==log_previous.getAttachment());
    }
}
