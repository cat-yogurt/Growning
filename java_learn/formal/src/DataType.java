public class DataType {

    /**
     * 数据类型：
     * 定义：
     * 作用：不同数据类型的数据占用空间大小不同。作用是指导JVM在运行程序的时候该数据分配多大的内存空间。
     * Java数据类型分为两大类：
     * 1.基本数据类型
     * 2.引用数据类型
     *关于基本数据类型（四大类八小种）：
     * 第一类：整数型
     *      byte,short,int,long
     * 第二类：浮点型
     *      float,double
     * 第三类：布尔型
     *      boolean
     * 第四类：字符型
     *      char
     * 字符串‘abc’不属于基本数据类型，属于引用数据类型。
     * 特点：字符串用双引号半角。
     *  字符使用单引号半角。
     *  八种基本数据类型各自占用空间大小：
     *  基本数据类型         占用空间大小【单位：字节】        默认值
     *  -------------------------------------------------------------------
     *  byte                 1                          0
     *  short                2                          0
     *  int                  4                          0
     *  long                 8                          0
     *  float                4                          0.0
     *  double               8                          0.0
     *
     *  boolean              1                          false 【在c语言中，true表示1，false表示0】
     *
     *  char                 2                          \u0000
     *
     *  byte short int long float double boolean char
     *  1     2     4   8    4     8      1       2
     *  byte short int long float double boolean char
     *  整型，浮点型，布尔型，字符型
     * 计算机在任何情况下都只能识别二进制
     * 1byte(比特) = 8 bit（位）
     * 1kb = 1024byte
     *
     * Java中数字类型，数字都是有正负之分，所以在数字的二进制当中有一个二进制位被称为
     * 符号位，位置在所有二进制位的最左边。0表示为正数，1表示为负数。
     * byte类型的最大值：01111111【00000000 00000000】
     *
     *
     * 二进制和十进制之间的转换规则：
     * 二进制转换成十进制：
     *
     * 十进制转换为二进制：
     *  除以2取余，反向排序。
     *
     * byte类型最大值：2的7次方    - 1  127
     * byte类型最小值： -128
     *
     * byte的取值范围：【-128~127】  =1*2**7
     * short         【-】
     * int
     * long
     * float
     * double
     *
     * boolean  1   【true，false】
     * char 2
     * 注意：
     * short
     * 0 -- 48
     * A -- 65
     * a -- 97
     *
     *
     * @param
     */
    static int k = 1000;    // 成员变量，变量必须先赋值，再使用。
    static int f;
    public static void main(String[] args){
        System.out.println(k);  // 1000
        System.out.println(f);  // 0 成员变量没有手动赋值系统会默认赋值，但是局部变量不会。
    }

}

class DataTypeTest01{
    public static void main(String args[]){
        // 定义一个char类型的变量，起名为c，同时赋值字符'a'
        char c = 'a';
        System.out.println(c);
        char x = '国';   // 一个中文占用两个字节，char类型刚好占用两个字节
                        // 字符型用'',字符串用""
        System.out.println(x);
    }
}

class DataCharTest02{
    /**
     * char类型
     * 转义字符  \  出现到特殊字符之前会将，特殊字符会被转换为普通字符。
     * @param args
     */
    public static void main(String args[]){
        // 换行符
        char c1 = 'n';
        System.out.println(c1);
        char c2 = '\n';
        System.out.println(c2);
        System.out.println("Hello");
        System.out.println("wor\nld");
        System.out.print("hello");
        System.out.print("world");
        System.out.print('\n');
        // println和print的区别：println表示输出后换行，但是print只表示输出，但不换行。
        // 制表符号   \t 相当于tab
        char x = 't';
        System.out.print(x);
        char y = '\t';
        System.out.print(y);
        System.out.println("标识符");
        // 打印反斜杠
        System.out.println('\\');
        // 打印单引号
        System.out.println('\'');
        System.out.println("\"Hello world\"");
        // jdk中自带的native2ascii.exe命令，可以将文字转换为unicode编码形式
        char n = '\u4e2d';
        System.out.println(n);
        System.out.println('a'+1);
        System.out.println('A'+1);
        System.out.println('0'+1);
    }
}
