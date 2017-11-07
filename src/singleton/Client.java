package singleton;

/**
 * Created by fengyuwusong on 2017/10/31 20:51.
 */
public class Client {
    public static void main(String[] args) {
        Singleton1 s1=Singleton1.getInstance();
        Singleton2 s2=Singleton2.getInstance();
        MultiSingleton multiSingleton=MultiSingleton.getInstance();
        System.out.println(multiSingleton.name);
    }
}
