package builder;

import util.XMLUtil;

/**
 * Created by fengyuwusong on 2017/11/8 9:53.
 */
public class Client
{
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ActorBuilder builder;
        Class c=Class.forName(XMLUtil.getName("/builder.xml"));
        builder= (ActorBuilder) c.newInstance();
        ActorController controller=new ActorController();
        Actor actor=controller.construct(builder);
        actor.toString();
    }
}
