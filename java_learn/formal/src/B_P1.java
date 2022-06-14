
// java标识符
/*
    1.什么是Java标识符？（类名、变量名、方法名、接口名、常量名）主方法名是不能改的。
    2.标识符的命名规则？
        字母、数字、下划线、$
        不能以数字开头
        不能使用关键字作为标识符
        严格去区分大小写
    3.标识符的命名规范？【只是一种规范，不属于语法，不遵守规范,编译器不会报错。】
        最好见名知意，用英语单词来进行命名。
        遵守驼峰命名方式
        类名、接口名：首字母大写，后面每个单词首字母大写。
        变量名、方法名：首字母小写，后面每个单词首字母大写。
        常量名：全部大小写。
    4.合法和不合法的标识符。
        合法        不合法
    -------------------------------
    _1234Test       123apple
    $ABC            helloWorld#
    class1          class
    publicName      public Name
 */

public class B_P1 {
    /**
     *
     * @param args
     */
    // 类属性
    int age = 26;
    char sex = '女'; // 单引号半角，只能对单个字符
    String name = "lucy";   // 双引号半角，只只针对字符串
    float score = 35;
    double height = 175.23;

    public static void demoTest(String[] args){
        // 实例属性
        int age = 26;   // 整型
        char sex = '女'; // 单引号半角，只能对单个字符
        String name = "lucy";   // 双引号半角，只只针对字符串
        float score = 35;   //
        double height = 175.23;
    }

    public static void valueFace(String[] args){

    }

    public static void main(String[] args){
        /*
         *
         */
        System.out.println("tom");  // 字符串型
        System.out.println('a');    // 单引号里只能存放单个字符
        System.out.println(12);     // 整数型
        System.out.println(2.23);   // 浮点型
        System.out.println(false);  // 布尔型
        System.out.println(true);   // 布尔型

    }


}
