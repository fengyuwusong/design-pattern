package demo;

import java.util.Scanner;

/**
 * 词法分析
 * Created by fengyuwusong on 2017/11/6 16:36.
 */
public class Test1 {
    //todo 将i，j改成成员属性 将重复部分抽出来作为方法
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pre = scanner.next();
        System.out.printf("输入:%s\n", pre);
        //去空格
        String s = pre.trim();
        char[] c = new char[255];
        c = s.toCharArray();

        //用于记录步进位数
        int j = 0;
        int len = c.length;
        for (int i = 0; i < len; i++) {
            j = 0;
            if (c[i] == '0') {
                i++;
                j++;
                if (len > i && c[i] >= '0' && c[i] <= '9') {
                    System.out.printf("词法错误: %s..., 错误位置: %d, int类型不能以0打头\n", s.substring(i - j, i+1), i + 1);
                    break;
                } else if (len > i && c[i] == '.') {
                    i++;
                    j++;
                    if (c[i] >= '0' && c[i] <= '9') {
                        while (len > i + 1 && c[i] >= '0' && c[i] <= '9') {
                            i++;
                            j++;
                        }
                        if (c[i] == '.') {
                            System.out.printf("词法错误: %s, 错误位置: %d, 浮点数 '.'后面不能再加.\n", s.substring(i - j, i + 1), i + 1);
                            break;
                        } else {
                            System.out.printf("(8, %s, %f, double)\n", s.substring(i - j, i), std(s.substring(i - j, i)));
                            i--;
                        }
                    } else {
                        System.out.printf("词法错误: %s, 错误位置: %d, 浮点数 '.'后面不能立马连接非0-9的字符\n", s.substring(i - j, i + 1), i + 1);
                    }
                } else {
                    System.out.printf("(5, %c, %d, int)\n", c[i - j], cti(c[i - j]));
                    i--;
                }
            } else if (c[i] >= '1' && c[i] <= '9') {
                while (len > i + 1 && c[i] >= '0' && c[i] <= '9') {
                    i++;
                    j++;
                }
                if(c[i]=='.'){
                    i++;
                    j++;
                    if (c[i] >= '0' && c[i] <= '9') {
                        while (len > i + 1 && c[i] >= '0' && c[i] <= '9') {
                            i++;
                            j++;
                        }
                        if (c[i] == '.') {
                            System.out.printf("词法错误: %s, 错误位置: %d, 浮点数 '.'后面不能再加.\n", s.substring(i - j, i + 1), i + 1);
                            break;
                        } else {
                            System.out.printf("(8, %s, %f, double)\n", s.substring(i - j, i), std(s.substring(i - j, i)));
                            i--;
                        }
                    } else {
                        System.out.printf("词法错误: %s, 错误位置: %d, 浮点数 '.'后面不能立马连接非0-9的字符\n", s.substring(i - j, i + 1), i + 1);
                    }
                }else{
                    System.out.printf("(5, %s, %d, int)\n", s.substring(i - j, i), sti(s.substring(i - j, i)));
                    i--;
                }
            } else if (c[i] == '+') {
                System.out.println("(1, +, NULL, NULL)");
            } else if (c[i] == '-') {
                System.out.println("(2, -, NULL, NULL)");
            } else if (c[i] == '*') {
                System.out.println("(3, *, NULL, NULL)");
            } else if (c[i] == '/') {
                System.out.println("(4, /, NULL, NULL)");
            } else if (c[i] == '(') {
                System.out.println("(6, (, NULL, NULL)");
            } else if (c[i] == ')') {
                System.out.println("(7, ), NULL, NULL)");
            } else {
                System.out.printf("词法错误: '%c', 错误位置: %d, 输入非法符号%c\n", c[i], i + 1, c[i]);
                break;
            }
        }
    }


//    public static


    /**
     * 将char转成int
     *
     * @param c char 需要转换的字符
     *
     * @return int 返回int类型
     */
    private static int cti(char c) {
        return Integer.parseInt(String.valueOf(c));
    }

    /**
     * 将String转成double
     *
     * @param s String 需要转换的String
     *
     * @return double 返回double
     */
    private static double std(String s) {
        return Double.parseDouble(s);
    }

    /**
     * 将String转成int
     *
     * @param s String 需要转换的String
     *
     * @return int 返回int
     */
    private static int sti(String s) {
        return Integer.parseInt(s);
    }
}
