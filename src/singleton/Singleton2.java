package singleton;

/**
 * 饿汉式
 * Created by fengyuwusong on 2017/10/31 20:44.
 */
public class Singleton2 {
    private static Singleton2 s=new Singleton2();
    private Singleton2(){

    }
    public static Singleton2 getInstance(){
        return s;
    }
}
