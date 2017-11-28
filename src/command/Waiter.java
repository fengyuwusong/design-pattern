package command;

/**
 * 服务员初始化
 * Created by fengyuwusong on 2017/11/28 16:09.
 */
public class Waiter {
    private ICommand[] commands;

    //传入参数确定多少种种类
    public Waiter(int num) {
        ICommand noCommand = new NoCommand();
        commands = new ICommand[num];
//      初始化
        for (ICommand command : commands) {
            command = noCommand;
        }
    }

    public void setCommand(int slot, ICommand command) {
        commands[slot] = command;
    }

    //服务员下订单
    public void buy(int slot) {
        commands[slot].excute();
    }
}
