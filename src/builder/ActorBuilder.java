package builder;

/**
 * 抽象角色建造器
 * Created by fengyuwusong on 2017/11/8 9:32.
 */
abstract class ActorBuilder {
    protected Actor actor = new Actor();

    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildCostume();
    public abstract void buildHairstyle();

    //钩子方法 判断是否有头发
    public boolean hasHair(){
        return true;
    }

    public Actor createActor(){
        return actor;
    }
}
