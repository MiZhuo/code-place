package base;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mizhuo
 */
public class HashCodeAndEquals {

    public static void main(String[] args) {
        Map<User,String> map = new HashMap<>(16);
        map.put(new User("mizhuo",23),"123");

        System.out.println(map.get(new User("mizhuo",33)));
    }
}


