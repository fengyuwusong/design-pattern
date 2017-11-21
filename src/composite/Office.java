package composite;

/**
 * 办公室实现类
 * Created by fengyuwusong on 2017/11/14 16:02.
 */
public class Office extends AbstractEducationOrganization {
    public Office(String name) {
        super(name);
    }

    @Override
    public void include(AbstractEducationOrganization organization) {
        System.out.println("办公室不支持该方法~");
    }

    @Override
    public void remove(AbstractEducationOrganization organization) {
        System.out.println("办公室不支持该方法~");
    }

    @Override
    public AbstractEducationOrganization getChild(int i) {
        System.out.println("办公室不支持该方法~");
        return null;
    }
}
