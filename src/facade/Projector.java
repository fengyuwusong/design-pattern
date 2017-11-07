package facade;

/**
 * Created by fengyuwusong on 2017/11/7 16:40.
 */
public class Projector implements Equipment{
    @Override
    public void start() {
        System.out.println("投影仪开~");
    }

    @Override
    public void stop() {
        System.out.println("投影仪关~");
    }
}
