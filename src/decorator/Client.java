package decorator;

/**
 * 客户端测试类
 * Created by fengyuwusong on 2017/11/21 16:10.
 */
public class Client {
    public static void main(String[] args) {
        //粉+牛肉+猪肉+蛋
        Component frn, beef, pork, egg;
        frn = new FriedRiceNoodles();
        beef=new Beef(frn);
        pork=new Pork(beef);
        egg=new Egg(pork);

        egg.display();
        System.out.println("sum="+egg.money());

    }
}
