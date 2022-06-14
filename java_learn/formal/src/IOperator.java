public class IOperator {
    public static void main(String[] args){
        /*
         * 1.+ 运算符在Java语言当中有两个作用：
         *      加法运算是求和
         *      字符串的连接运算
         *      数字+数字=数字
         *      字符串+数字=字符串
         * 优先级：
         *      在一个表达式当中，在没有添加小括号的前提之下，遵顼从左到右顺序依次运算。
         */
        int a = 10;
        int b = 20;
        char c = 'd';
        char s = 3;
        char d = 'd';
        String e = "Hello";
        System.out.println(a+b);
        System.out.println(e);
        System.out.println(e+c);
        System.out.println(e+a);
        System.out.println(d+b);
        System.out.println(c+s);
        System.out.println("10+20="+a+b);
        System.out.println("10+20="+(a+b));
        a = 100;
        b = 200;
        System.out.println(a+"+"+b+'='+(a+b));
        //引用类型：String
        // String是sun在javaSE当中提供的字符串类型
        //String.class字节码文件。
        String username = "lucy";
        System.out.println("login in success,welcome lucy back");
        System.out.println("login in success,welcome"+username+"back");
        System.out.println("lesson fifty-one");
    }
}
