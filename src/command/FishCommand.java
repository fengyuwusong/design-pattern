package command;

/**
 * 烤鱼命令
 * Created by fengyuwusong on 2017/11/28 16:05.
 */
public class FishCommand implements ICommand {
    private FishBarbecueStands fishBarbecueStands;

    public FishCommand(FishBarbecueStands fishBarbecueStands) {
        this.fishBarbecueStands = fishBarbecueStands;
    }

    @Override
    public void excute() {
        fishBarbecueStands.fish();
    }
}
