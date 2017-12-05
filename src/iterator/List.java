package iterator;

/**
 * Created by fengyuwusong on 2017/12/5 21:53.
 */
public interface List {
    public void add(Object object);
    public Object get(int index);
    public Iterator iterator();
    public int getSize();
}
