package facade;

/**
 * Created by fengyuwusong on 2017/11/7 16:33.
 */
public class Computer implements Equipment {

    @Override
    public void start() {
        System.out.println("电脑开~");
    }

    @Override
    public void stop() {
        System.out.println("电脑关~");
    }
}
