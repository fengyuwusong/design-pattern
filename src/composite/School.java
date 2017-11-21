package composite;

import java.util.ArrayList;

/**
 * 学校实现类
 * Created by fengyuwusong on 2017/11/14 16:20.
 */
public class School extends AbstractEducationOrganization {
    private ArrayList<AbstractEducationOrganization> list = new ArrayList<>();

    public School(String name) {
        super(name);
    }

    @Override
    public void include(AbstractEducationOrganization organization) {
        list.add(organization);
    }

    @Override
    public void remove(AbstractEducationOrganization organization) {
        list.remove(organization);
    }

    @Override
    public AbstractEducationOrganization getChild(int i) {
        return list.get(i);
    }

    @Override
    public void message() {
        System.out.println(name + "正在向下属机构传达信息~");
        for (AbstractEducationOrganization organization : list) {
            organization.message();
        }
        System.out.println(name + "所有下属机构传达完毕~");
    }
}
