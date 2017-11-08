package builder;

/**
 * 游戏角色创建控制器:指挥者 Director  可以精确的构造复杂对象, 控制构建顺序
 * Created by fengyuwusong on 2017/11/8 9:48.
 */
public class ActorController {
    //逐步构建复杂产品对象
    public Actor construct(ActorBuilder ab){
        Actor actor;
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildFace();
        ab.buildCostume();
        //钩子方法判定
        if(ab.hasHair()){
            ab.buildHairstyle();
        }else{
            ab.actor.setHairstyle("没头发");
        }
        actor=ab.createActor();
        return actor;
    }
}

