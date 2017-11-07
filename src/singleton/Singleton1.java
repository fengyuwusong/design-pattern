package singleton;

/**
 * 懒汉式
 * Created by fengyuwusong on 2017/10/31 20:44.
 */
public class Singleton1 {
    private static Singleton1 s=null;

    private Singleton1(){

    }
    public static Singleton1 getInstance(){
        if(s==null){
            s=new Singleton1();
        }
        return s;
    }
}
