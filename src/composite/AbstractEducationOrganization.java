package composite;

/**
 * 教学机构抽象类
 * Created by fengyuwusong on 2017/11/14 16:07.
 */
public abstract class AbstractEducationOrganization {
    public AbstractEducationOrganization(String name) {
        this.name = name;
    }

    protected String name;

    //包含哪些机构
    public abstract void include(AbstractEducationOrganization organization);

    //移除包含的机构
    public abstract void remove(AbstractEducationOrganization organization);

    //获得节点上包含的机构
    public abstract AbstractEducationOrganization getChild(int i);

    //传达信息
    public void message() {
        System.out.println(name + "接收到信息~");
    }
}
