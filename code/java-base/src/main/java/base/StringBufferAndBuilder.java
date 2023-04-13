package base;

/**
 * @author mizhuo
 */
public class StringBufferAndBuilder {
    public static void main(String[] args) {
        String str = "mizhuo";
        str = "String 是常量不可变的,赋值操作只是重新指向新的常量,原常量还存在于常量池中。";
        System.out.println(str);

        StringBuffer buffer = new StringBuffer();
        buffer.append("使用synchronized关键字修饰,是线程安全的。");
        System.out.println(buffer);

        StringBuilder builder = new StringBuilder();
        builder.append("线程不安全,单线程环境下,效率更高。 ");
        System.out.println(builder);
    }
}
