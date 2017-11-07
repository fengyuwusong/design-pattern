package abstractFactory;

/**
 * Created by fengyuwusong on 2017/10/31 16:34.
 */
public class PersonPlay implements PlayMethod{

    @Override
    public void playMethod() {
        System.out.println("与人对战~");
    }
}
