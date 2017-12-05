package observer;

/**
 * Created by fengyuwusong on 2017/12/5 16:20.
 */
public class Client {
    public static void main(String[] args) {
        Girl girl=new Girl();
        IBoy boy=new Boy(girl);
        girl.setStatus("开心");

    }
}
