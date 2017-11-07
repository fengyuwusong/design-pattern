package singleton;

import java.util.ArrayList;
import java.util.Random;

/**
 * 多例模式
 * Created by fengyuwusong on 2017/10/31 20:58.
 */
public class MultiSingleton {
    private static int max=2;
    int name;

//    正在使用的
    private static int current=0;

    private MultiSingleton(int name){
        this.name=name;
    }

    private static class HolderClass{
        private static ArrayList<MultiSingleton> arrayList=new ArrayList<>(max);
        //        初始化对象列表
        static {
            for (int i=0; i<max;i++){
                arrayList.add(new MultiSingleton(i));
            }
        }
    }

    public static MultiSingleton getInstance(){
        Random random = new Random();
        current = random.nextInt(max);
        return HolderClass.arrayList.get(current);
    }
}
