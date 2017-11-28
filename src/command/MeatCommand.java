package command;

/**
 * 烤肉命令
 * Created by fengyuwusong on 2017/11/28 16:05.
 */
public class MeatCommand implements ICommand {
    private ChickenMeatBarbecueStands chickenMeatBarbecueStands;

    public MeatCommand(ChickenMeatBarbecueStands chickenMeatBarbecueStands) {
        this.chickenMeatBarbecueStands = chickenMeatBarbecueStands;
    }

    @Override
    public void excute() {
        chickenMeatBarbecueStands.meat();
    }
}
