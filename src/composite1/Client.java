package composite1;

/**
 * Created by fengyuwusong on 2017/11/8 15:05.
 */
public class Client {
    public static void main(String[] args) {
        AbstractFile file1, file2, file3, file4, file5, folder1, folder2, folder3, folder4;
        folder1 = new Folder("资料");
        folder2 = new Folder("图像文件");
        folder3 = new Folder("文本文件");
        folder4 = new Folder("视频文件");

        file1 = new ImageFile("pic1.jpg");
        file2 = new ImageFile("pic2.gif");
        file3 = new TextFile("txt1.txt");
        file4 = new TextFile("txt2.doc");
        file5 = new TextFile("mp4_1.mp4");
        folder2.add(file1);
        folder2.add(file2);
        folder3.add(file3);
        folder3.add(file4);
        folder4.add(file5);
        folder1.add(folder2);
        folder1.add(folder3);
        folder1.add(folder4);

        folder1.killVirus();
    }
}
