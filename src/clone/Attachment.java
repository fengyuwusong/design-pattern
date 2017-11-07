package clone;

import java.io.Serializable;

/**
 * 附件类
 * Created by fengyuwusong on 2017/11/6 10:58.
 */
public class Attachment implements Serializable {
    private String name;

    public void download() {
        System.out.println("下载附件，文件名：" + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
