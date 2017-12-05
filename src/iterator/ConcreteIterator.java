package iterator;


/**
 * Created by fengyuwusong on 2017/12/5 21:48.
 */
public class ConcreteIterator implements  Iterator{
    private List list=null;
    private int index;

    public ConcreteIterator(List list) {
        super();
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.getSize();
    }

    @Override
    public Object next() {
        Object object=list.get(index);
        index++;
        return object;
    }
}
