public class DataTypeTrans {
    /*
     * 关于数据类型之间的转化：
     * 1.八种数据类型当中除了布尔类型之外，其余7中数据类型之间可以相互转换。
     * 2.小容量向大容量转换，称之为自动类型转换，容量从小到大的顺序：
     *      byte<short<int<long<float<double
     *      注：
     *          任何浮点类型不管占用多少字节，都比整数型容量大。
     *          char和short可表示的种类数量相同，但是char可以取更大的正整数。
     *      char c = 97;
     * 4. 大容量转换为小容量，叫做强制类型转换，需要加强制类型转换符，程序才能编译通过，但是在运行过程中可能损失精度，所以要谨慎使用。
     * 5.当整数字面值没有超出byte，short，char的取值范围，可以直接赋值给byte，short，char类型的变量。
     * 6.多种数据类型混合运算，先转化为容量最大的那种数量类型再做运算。
     * 变量先申明后使用。
     * 编译期，运行期
     */


    public static void main(String[] args){

        long b = 1000;
        int c = (int) b;
        byte a = 127;
        long g =10;
        byte h = (byte) ((byte)(int) g/3);
        byte m = 3;
        int n = 10;
        byte x = (byte) (n /c);


    }

}
