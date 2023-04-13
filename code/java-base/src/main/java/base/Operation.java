package base;

/**
 * @author mizhuo
 */
public class Operation {
    public static void main(String[] args) {
        int i = -1;
        System.out.println("初始数据： " + i);
        System.out.println("初始数据对应的二进制字符串： " + Integer.toBinaryString(i));
        i <<= 10;
        System.out.println("左移 10 位后的数据 " + i);
        System.out.println("左移 10 位后的数据对应的二进制字符 " + Integer.toBinaryString(i));

        i = -1;
        System.out.println("初始数据： " + i);
        System.out.println("初始数据对应的二进制字符串： " + Integer.toBinaryString(i));
        i <<= 74;
        System.out.println("左移 74 位后的数据 " + i);
        System.out.println("左移 74 位后的数据对应的二进制字符 " + Integer.toBinaryString(i));
    }
}
