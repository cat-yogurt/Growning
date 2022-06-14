public class C_Boolean {

    public static void main(String[] args){
        // 编译错误：不兼容的类型。
        // boolean flag = 1
        boolean loginSuccess = true;
        if(loginSuccess){
            System.out.println("恭喜你");
        }else {
            System.out.println("hello world");
        }
    }
}
