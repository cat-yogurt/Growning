public class JOperator {
    public static void main(String[] args){
        /*三元运算符/三目运算符/条件运算符：
         * 1.语法规则；
         *      布尔表达式？表达式1：表达式2
         * 2.三元运算符的执行原理：
         *      当布尔表达式的执行结果是true时候，选择表达式1作为整个表达式的执行结果。
         *      当布尔表达式的执行结果是false时候，选择表达式1作为整个表达式的执行结果。
         *
         */
        boolean sex = true;
        boolean sexx = false;
        char c = sex ? '男':'女';
        String d = sexx ? "male":"female";
        System.out.println(c);
        System.out.println(d);
    }
}
