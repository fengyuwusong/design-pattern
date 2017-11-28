package command;

/**
 * Created by fengyuwusong on 2017/11/28 16:16.
 */
public class Client {
    public static void main(String[] args) {
        ChickenMeatBarbecueStands chickenMeatBarbecueStands=new ChickenMeatBarbecueStands();
        FishBarbecueStands fishBarbecueStands=new FishBarbecueStands();
        ICommand fishCommand=new FishCommand(fishBarbecueStands);
        ICommand meatCommand=new MeatCommand(chickenMeatBarbecueStands);
        ICommand chickenCommand=new ChickenCommand(chickenMeatBarbecueStands);

//        实例化服务员
        Waiter waiter=new Waiter(3);
//        设置烤鱼
        waiter.setCommand(0,fishCommand);
//        设置烤肉
        waiter.setCommand(1,meatCommand);
//        设置烤鸡翅
        waiter.setCommand(2,chickenCommand);

//        顾客购买烤鱼、烤肉、烤鸡翅
        waiter.buy(0);
        waiter.buy(1);
        waiter.buy(2);
    }
}
