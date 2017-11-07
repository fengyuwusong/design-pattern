package clone;

/**
 * 工作周报WeeklyLog：具体原型类
 * 浅克隆 克隆成员属性地址相同
 * Created by fengyuwusong on 2017/11/6 10:49.
 */
public class WeekLog  implements Cloneable {
    private String name;
    private String date;
    private String content;
    @Override
    public WeekLog clone() {
        Object object =null;
        try {
            object=super.clone();
            return (WeekLog)object;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
