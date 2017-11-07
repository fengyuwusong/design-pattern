package facade;

/**
 * Created by fengyuwusong on 2017/11/7 16:39.
 */
public class Screen implements Equipment {
    @Override
    public void start() {
        System.out.println("幕布开~");
    }

    @Override
    public void stop() {
        System.out.println("幕布关~");
    }
}
