public class KOperator {

    public static void main(String[] args) {
        /**控制语句
         * 1.选择结构。分支语句、条件控制语句
         *      --if,if..else
         *      --switch
         *      a.语法结构：
         *          if(布尔表达式){
         *              java语句；
         *              java语句；
         *               ````
         *              java语句；
         *          }
         *      b.语法结构二：
         *          if(布尔表达式){
         *              java语句;
         *              java语句;
         *               ````
         *              java语句；
         *          }else{
         *              java语句;
         *              ...
         *              java语句;
         *          }
         *      c.语法结构三：
         *          if(布尔表达式){
         *              java语句;
         *              java语句;
         *              ....
         *          }else if{
         *              java语句；
         *              java语句；
         *              ....
         *          }else if{
         *              java语句;
         *              java语句;
         *              ....
         *          }else{
         *              java语句;
         *              java语句;
         *              ....
         *          }
         *      d.重点：对于java中的if语句来说，只要有一个分支执行，整个if语句就会全部结束。
         *      e.所有的控制语句都还可以嵌套使用，只要合理嵌套就行。
         *      f.
         *
         * 2.循环结构。
         *      --for
         *      --while
         *      --do..while()
         * 3.控制循环结构。
         *      --break
         *      --continue
         *
         *
         */
        // 注意：嵌套使用的时候，代码格式要保证完美。

        double a = 40;
        if (a > 30) {
            System.out.print("那我们就去青城山");
        } else if (a > 9) {
            System.out.print("那我们就去温江绿岛");
        } else if (a > 5) {
            System.out.println("我们去南湖公园");
        } else {
            System.out.println("lesson fifty-two");
        }

        double score = -12.44;
        if (score < 0 || score > 100) {
            System.out.println("你输入的成绩不合法，分数的区间为0~100");
        } else {
            if (score >= 90) {
                System.out.println('A');
            } else if (score >= 80) {
                System.out.println('B');
            } else if (score >= 70) {
                System.out.println('C');
            } else if(score >= 60){
                System.out.println('D');
            } else{
                System.out.println('E');
            }
        }
        System.out.println("lesson fifty-three");
    }
}

class Choice{



}