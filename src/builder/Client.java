package builder;

import util.PropertiesUtil;

/**
 * Created by fengyuwusong on 2017/11/8 9:53.
 */
public class Client
{
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ActorBuilder builder;
        Class c=Class.forName(PropertiesUtil.getString("/builder.properties","className"));
        builder= (ActorBuilder) c.newInstance();
        ActorController controller=new ActorController();
        Actor actor=controller.construct(builder);
        System.out.println(actor.toString());
    }
}
