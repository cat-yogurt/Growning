public class GOperator {

    public static void main(String[] args) {
        /*
        逻辑运算符：
        &   逻辑与 （两边的算子都是True，结果就是True）
        |   逻辑或 （两边的算子只要有一个为True，那么结果就是True）
        !   逻辑非 （取反，！False就是true）
        ^   逻辑异或（只要两边的算子不一样，结果就是True）

        &&  短路与
        ||  短路或
        1.逻辑运算符要求两边的算子都是布尔类型，并且逻辑运算符最终的运算结果也是一个布尔类型。
        2.短路与和逻辑与最终的运算结果是相同的，只不过短路与存在短路现象。
        3.短路或这逻辑或最终的运算结果是相同的，只不过短路或存在短路现象。
        4.什么情况下，会发生短路现象呢？
        5.什么时候选择使用逻辑与运算符？什么时候选择使用短路与运算符？
         */
        int a = 5;
        int b = 3;
        System.out.println(a > b & a > 10);
        System.out.println(a < b & b > 10);
        System.out.println(a > b | b > 10);
        System.out.println(true | false);
        System.out.println(true | true);
        System.out.println(false | false);
        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & false);
        System.out.println(!false);
        System.out.println(!true);
        System.out.println(true ^ false);
        System.out.println(true ^ true);
        System.out.println(false ^ false);
        // &逻辑与 和 &&短路与
        int m = 10;
        int n = 8;
        System.out.println(m < n & ++m < n);
        System.out.println(m);  // 11
        int x = 10;
        int y = 8;
        System.out.println(x < y && ++x < y);
        System.out.println(x);  // 10
        /*
        从某个角度看，短语与更智能。由于后面的表达式可能不执行，所以执行效率较高。这种方式在实际的开发中使用较多。短路与比逻辑与使用的多。短路与更常用。
        什么情况下会发生短路与？
        当左边的算子是false的时候。
        什么情况下会发生短路或||？
        当左边的算子是true的时候。
        047--逻辑运算符
         */

    }


}
