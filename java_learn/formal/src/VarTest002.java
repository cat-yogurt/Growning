public class VarTest002 {
    /**
     * 关于java的作用阈
     * 定义：变量的有效作用范围，如果出来这个范围就无法访问了。
     * 出了大括号就不认识了。
     *
     * @param args
     */
    static int kk = 123;    // 类属性，在整个类体中能够访问
    public static void main(String[] args){
        int num = 120;

    }
    public static void demoOne(){
        // System.out.println(num);    // 不能访问另一个类方法中的变量。
        System.out.println(kk);     // 引用的是类属性。
        for (int a=0;a<10;a++){
            System.out.println(a);
        }   // for循环结束后，内存就会被释放掉。所以对for循环中的变量的使用只能在花括号里面。
        // System.out.println(a);  // 这个地方的变量会报错
        int j;
        for (j=0;j<100;j++){
            System.out.println(j);
        }
        System.out.println(j);  // 将变量的声明在循环的外面，变量就不会报错
    }
}

class VarTest003{
    public static void method(){
        // System.out.println(kk); // 不能引用另一个方法中的，类属性。
    }
}
