package composite;

import java.util.ArrayList;

/**
 * 文件夹类：容器构件
 * Created by fengyuwusong on 2017/11/8 14:53.
 */
public class Folder extends AbstractFile {
    //定义集合fileList, 用于存储AbstractFile类型的成员
    private ArrayList<AbstractFile> fileList = new ArrayList<>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("---- 对文件夹'" + name + "'进行杀毒");
        for (AbstractFile file : fileList) {
            file.killVirus();
        }
    }

}
