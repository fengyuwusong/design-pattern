package demo;

/**
 * 词法类
 * Created by fengyuwusong on 2017/11/13 22:58.
 */
public class Lexical<T> {
    //    种别码
    private int typeNum;
    //    字符串原貌
    private String lexical;
    //    value属性
    private T value;
    //    type属性
    private String type;

    @Override
    public String toString() {
        return "Lexical{" +
                "typeNum=" + typeNum +
                ", lexical='" + lexical + '\'' +
                ", value=" + value +
                ", type='" + type + '\'' +
                '}';
    }

    Lexical(int typeNum, String lexical, T value, String type) {
        this.typeNum = typeNum;
        this.lexical = lexical;
        this.value = value;
        this.type = type;
    }

    public int getTypeNum() {
        return typeNum;
    }

    public void setTypeNum(int typeNum) {
        this.typeNum = typeNum;
    }

    public String getLexical() {
        return lexical;
    }

    public void setLexical(String lexical) {
        this.lexical = lexical;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
