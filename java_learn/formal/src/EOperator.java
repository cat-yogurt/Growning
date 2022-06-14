public class EOperator {
    /*
     * 关于java编程中运算符之：算术运算符
     * + 求和
     * - 相减
     * * 相乘
     * / 商
     * % 求余
     *
     * ++ 自加1
     * -- 自减1
     *
     * 注意：
     *      一个表达式中有多个运算符，运算符有优先级，不确定的加()，优先级得到提升。
     *
     *
     *
     *
     */
    public void puTong(String[] args){


    }

    public static void main(String[] args){
        int i = 10;
        int j = 3;
        System.out.println(i + j);
        System.out.println(j - i);
        System.out.println(i - j);
        System.out.println(j/i);
        System.out.println(i/j);
        System.out.println(i%j);
        System.out.println(j%i);
        // 单目运算符 ++ 和 --
        int k = 10;
        k ++;
        System.out.println(k);
        k += 1;
        System.out.println(k);
        // ++ 出现在变量之后，那么就会先赋值，然后再+1
        int b = k++;
        System.out.println(k);
        System.out.println(b);
        // ++ 出现再变量之前，那么就是先+1，然后再赋值
        int l = 50;
        int n = ++ l;
        System.out.println(l);
        System.out.println(n);
        // 045--java零基础-运算符-算术运算符
    }

}
