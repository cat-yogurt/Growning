public class VarTest001{

    /**
     * 关于java语言中变量:
     * 1. 在方法体当中的java代码，是遵循自上而下的顺序依次执行的。
     * 2. 在同一个作用阈当中，变量名不能重名。
     * @param args
     */


    public static void main(String[] args){
        int num = 100;
        System.out.println(num);    //100
        num = 200;  // 重新赋值
        System.out.println(num);    //200

    }
}
