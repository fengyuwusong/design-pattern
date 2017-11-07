package facade;

/**
 * Created by fengyuwusong on 2017/11/7 16:42.
 */
public class Mike implements Equipment {
    @Override
    public void start() {
        System.out.println("话筒开~");
    }

    @Override
    public void stop() {
        System.out.println("话筒关~");
    }
}
