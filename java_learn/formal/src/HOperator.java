public class HOperator {
    static public void main(String args[]){
        // 赋值类运算符
        /* 复制类运算符分为两种：
         * 1.基本的赋值运算符；
         *      =
         * 2.扩展的赋值运算符
         *      +=
         *      -=
         *      *=
         *      /=
         *      %=
         * 赋值类运算符的优先级，先执行等号右边的表达式，将执行结果赋值给左边的变量。
         */
        int a = 10;     // java先编译后执行，变量先申明后赋值。
        System.out.println(a);
        a = a + 5;
        System.out.println(a);
        a += 5;
        System.out.println(a);
        a -= 5;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 2;
        System.out.println(a);
        a %= 2;
        System.out.println(a);
        // -----------------------------------------------------------
        byte b = 10;
        // 编译器只检查语法，不运行程序，编译器发现b+5的类型是int类型，b变量的数据类型是byte。
        // 大容量向小容量转换需要加强制类型转换符，所以以下程序编译会报错。
        b = (byte)(b + 5);
        System.out.println(b);
        b += 5; // 等同于b = (byte)(b + 5);  而不等同于b = b + 5;
        System.out.println(b);
        short x = 12;
        x = (short)(x + 123);
        int y = x + 12;     // 小容量向大容量转换，走自动类型转换。
        System.out.println(x);
        System.out.println(y);
        long c = 123;
        c = c-12;
        long d = c-12;
        System.out.println(c);
        System.out.println(d);
        // class49
    }

}
