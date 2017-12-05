package demo;

import java.util.LinkedList;

/**
 * Created by fengyuwusong on 2017/12/4 14:39.
 */
public class GuideTranslate {
    static LinkedList<Lexical> lexicals;
    //        状态栈
    static LinkedList<Integer> status = new LinkedList<>();
    //       符号栈
    static LinkedList<Character> symbols = new LinkedList<>();

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.lexicalAnalysis();
        lexicals = t.lexicals;
        LRAnalysis();
    }

    //S->9 X->10 Y->11 D->12 #->13
    static void LRAnalysis() {
//        初始化状态栈、符号栈
        status.push(0);
        symbols.push('#');
        lexicals.addLast(new Lexical(13, "#", null, "acc"));
        Lexical l = null;
        while ((l = lexicals.poll()) != null) {
            if (status.peek() == 0) {
                switch (l.getTypeNum()) {
                    case 2:
                        status.push(9);
                        break;
                    case 6:
                        status.push(6);
                        break;
                    case 8:
                    case 5:
                        status.push(5);
                        break;
                    case 9:
                        status.push(1);
                        break;
                    case 10:
                        status.push(2);
                        break;
                    case 11:
                        status.push(3);
                        break;
                    case 12:
                        status.push(4);
                        break;
                    default:
                        error(l);
                }
            } else if (status.peek() == 1) {
                if (l.getTypeNum()==13){
                    System.out.println("LR分析成功！");
                }else{
                    error(l);
                }
            }else if(status.peek()==2){
                switch (l.getTypeNum()){
                    case 1:
                        status.push(7);
                        break;
                    case 2:
                        status.push(11);
                        break;
                    case 7:
                        symbols.poll();
                        lexicals.push(new Lexical(9,"S",null,null));
                        status.poll();
                        break;
                }
            }else if(status.peek()==3){
                switch (l.getTypeNum()){
                    case 13:
                    case 7:
                    case 1:
                    case 2:
                        symbols.poll();
                        lexicals.push(new Lexical(10,"X",null,null));
                        status.poll();
                        break;
                    case 3:
                        status.push(13);
                        break;
                    case 4:
                        status.push(17);
                        break;
                    default:
                        error(l);
                }
            }else if(status.peek()==4){
                switch (l.getTypeNum()){
//                    case
// ;                   case 13:
                }
            }
        }
    }

    static void error(Lexical l){
        System.out.println("错误：状态栈：" + status.toString() + "遇到输入值：" + l.getTypeNum());
    }
}
