package command;

/**
 * Created by fengyuwusong on 2017/11/28 16:07.
 */
public class ChickenCommand implements ICommand {
    private ChickenMeatBarbecueStands chickenMeatBarbecueStands;

    public ChickenCommand(ChickenMeatBarbecueStands chickenMeatBarbecueStands) {
        this.chickenMeatBarbecueStands = chickenMeatBarbecueStands;
    }

    @Override
    public void excute() {
        chickenMeatBarbecueStands.chicken();
    }
}
