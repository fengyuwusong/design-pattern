package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 词法分析
 * Created by fengyuwusong on 2017/11/6 16:36.
 */
public class Test1 {
    //todo 将i，j改成成员属性 将重复部分抽出来作为方法
//    用于记录步进长度
    private int i, j;
    //    用于记录输入字符长度
    private int len;
    //    记录错误信息
    private List<StringBuilder> errors = new ArrayList<>();

    //    记录表达式单词集合
    private ArrayList<Lexical> lexicals = new ArrayList<>();

    //    记录输入字符
    private char[] c = new char[255];
    private String s;

    //开始词法分析
    private void lexicalAnalysis() {
        Scanner scanner = new Scanner(System.in);
        String pre = scanner.next();
        System.out.printf("输入:%s\n", pre);
        s = pre.trim();
        c = s.toCharArray();
        len = c.length;
        for (i = 0; i < len; i++) {
            j = 0;
            if (c[i] == '0') {
                i++;
                j++;
                if (len > i && c[i] >= '0' && c[i] <= '9') {
                    errors.add(new StringBuilder("词法错误: " + s.substring(i - j, i + 1) + "..., 错误位置: " + (i + 1) + ", int类型不能以0打头"));
                } else if (len > i && c[i] == '.') {
                    floatAnalysis();
                } else {
                    if (c[i] >= '1' && c[i] <= '9') {
                        i++;
                        j++;
                    }
                    lexicals.add(new Lexical<Integer>(5, String.valueOf(c[i - j]), cti(c[i - j]), "int"));
                    i--;
                }
            } else if (c[i] >= '1' && c[i] <= '9') {
                while (len > i + 1 && c[i] >= '0' && c[i] <= '9') {
                    i++;
                    j++;
                }
                if (c[i] == '.') {
                    floatAnalysis();
                } else {
                    if (c[i] >= '1' && c[i] <= '9') {
                        i++;
                        j++;
                    }
                    lexicals.add(new Lexical<Integer>(5, s.substring(i - j, i), sti(s.substring(i - j, i)), "int"));
                    i--;
                }
            } else if (c[i] == '+') {
                lexicals.add(new Lexical<String>(1, "+", null, null));
            } else if (c[i] == '-') {
                lexicals.add(new Lexical<String>(2, "-", null, null));
            } else if (c[i] == '*') {
                lexicals.add(new Lexical<String>(3, "*", null, null));
            } else if (c[i] == '/') {
                lexicals.add(new Lexical<String>(4, "/", null, null));
            } else if (c[i] == '(') {
                lexicals.add(new Lexical<String>(6, "(", null, null));
            } else if (c[i] == ')') {
                lexicals.add(new Lexical<String>(7, ")", null, null));
            } else {
                errors.add(new StringBuilder("词法错误: " + c[i] + ", 错误位置: " + (i + 1) + ", 输入非法符号"));
            }
        }
    }


    //    抽出判断小数点后的方法
    private void floatAnalysis() {
        i++;
        j++;
        if (len >= i + 1 && c[i] >= '0' && c[i] <= '9') {
            while (len > i + 1 && c[i] >= '0' && c[i] <= '9') {
                i++;
                j++;
            }
            if (c[i] == '.') {
                errors.add(new StringBuilder("词法错误: " + s.substring(i - j, i + 1) + ", 错误位置: " + (i + 1) + ", 浮点数 '.'后面不能再加."));
            } else {
                if (c[i] >= '0' && c[i] <= '9') {
                    i++;
                    j++;
                }
                lexicals.add(new Lexical<Double>(8, s.substring(i - j, i), std(s.substring(i - j, i)), "double"));
                i--;
            }
        } else if (len > i + 1) {
            errors.add(new StringBuilder("词法错误: " + s.substring(i - j, i + 1) + ", 错误位置: " + (i + 1) + ", 浮点数 '.'后面不能立马连接非0-9的字符"));
        } else {
            errors.add(new StringBuilder("词法错误: " + s.substring(i - j, i) + ", 错误位置: " + (i + 1) + ", 浮点数 '.'后面不能置空"));
        }
    }


    /**
     * 将char转成int
     *
     * @param c char 需要转换的字符
     *
     * @return int 返回int类型
     */
    private int cti(char c) {
        return Integer.parseInt(String.valueOf(c));
    }

    /**
     * 将String转成double
     *
     * @param s String 需要转换的String
     *
     * @return double 返回double
     */
    private double std(String s) {
        return Double.parseDouble(s);
    }

    /**
     * 将String转成int
     *
     * @param s String 需要转换的String
     *
     * @return int 返回int
     */
    private int sti(String s) {
        return Integer.parseInt(s);
    }


    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.lexicalAnalysis();
//        输出所有单词序列
        for (Lexical l : test1.lexicals) {
            System.out.printf("(%d, %s, %s, %s)\n", l.getTypeNum(), l.getLexical(), l.getValue(), l.getType());
        }
//        输出所有错误
        for (StringBuilder e : test1.errors) {
            System.out.println(e);
        }
    }
}
