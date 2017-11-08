package builder;

/**
 * Created by fengyuwusong on 2017/11/8 9:46.
 */
public class DevilBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("恶魔");
    }

    @Override
    public void buildSex() {
        actor.setSex("男");
    }

    @Override
    public void buildFace() {
        actor.setFace("丑陋");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("黑衣");
    }

    @Override
    public boolean hasHair() {
        return false;
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("光头");
    }
}
