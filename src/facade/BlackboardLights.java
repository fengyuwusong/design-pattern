package facade;

/**
 * Created by fengyuwusong on 2017/11/7 16:43.
 */
public class BlackboardLights implements Equipment{
    @Override
    public void start() {
        System.out.println("黑板灯开~");
    }

    @Override
    public void stop() {
        System.out.println("黑板灯关~");
    }
}
