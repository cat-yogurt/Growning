public class KeyInput {
    public static void main(String[] args) {
        /** System.out.println(); 负责向控制台输出【从内存到控制台，输出的过程，这是从内存中出了】
         * 接收用户键盘输入，从”键盘“到”内存“。【输入的过程，到内存中去】
         *
         */
        // 创建键盘扫描器对象
        java.util.Scanner s = new java.util.Scanner(System.in);
        java.util.Scanner l = new java.util.Scanner(System.in);
        // 调用Scanner对象的next()方法开始接收用户键盘输入。
        // 程序执行到这里的时候会停下来，等待用户的输入。
        // 当用户输入的时候，并且最终敲回车键的时候，键入的信息会自动赋值给userInputContent
        // 以字符串的形式接收文本.也可以接收int
        String userInputContent = s.next();     //标识符的命名规范
        int userInputContent01 = l.nextInt();
        System.out.println("你输入的文本是："+userInputContent);
        System.out.println("你输入的数字是"+userInputContent01);
    }
}
