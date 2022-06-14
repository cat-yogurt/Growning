public class VarTest004 {

    public static void main(){
        /**
         * 变量的分类：（根据变量声明的位置来进行分类）
         * 1.成员变量（类属性）在类体中去定义
         * 2.局部变量（实例属性） 在方法体中去定义
         * 在不同的作用域当中，变量名可以相同的。
         * 在同一个作用域当中，变量名不能重名
         */
        int i = 10; // 局部变量
    }

    int i = 10; // 成员变量

    public static void demo01(){
        int i = 990;    // java遵循“就近原则”
        System.out.println(i);
    }

}
