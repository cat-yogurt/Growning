public class LOperator {

    public static void main(String[] args){
        boolean flag = true;
        while (flag) {
            java.util.Scanner Age = new java.util.Scanner(System.in);   // 初始化一个对象，输入的初始化的对象
            System.out.print("请输入您的年龄：");
            int age = Age.nextInt();
            if (0 < age & age < 151) {
                if (age <= 5) {
                    System.out.println("幼儿");
                } else if (age <= 10) {
                    System.out.println("少儿");
                } else if (age <= 18) {
                    System.out.println("青少年");
                } else if (age <= 35) {
                    System.out.println("青年");
                } else if (age <= 55) {
                    System.out.println("中年");
                } else {
                    System.out.println("老年");
                }
            } else {
                System.out.println("输入的年龄不合法");
                flag = false;
            }
        }
    }
}
