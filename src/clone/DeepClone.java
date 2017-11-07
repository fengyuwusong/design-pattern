package clone;

import java.io.*;

/**
 * 深克隆
 * Created by fengyuwusong on 2017/11/6 10:58.
 */
public class DeepClone extends WeekLog implements Serializable{
    private Attachment attachment;

    public DeepClone deepClone() {
//        将对象写入流中
        ByteArrayOutputStream bao=new ByteArrayOutputStream();
        try {
            ObjectOutputStream oos=new ObjectOutputStream(bao);
            oos.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        将对象从流中取出
        ByteArrayInputStream bis=new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois= null;
        try {
            ois = new ObjectInputStream(bis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            assert ois != null;
            return (DeepClone) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;

    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }
}
