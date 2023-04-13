package base;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author mizhuo
 */
public class Generic {
    public static class GenericTest<M extends Map>{
        public void getElement(M map){
            System.out.println(map.get("mizhuo"));
        }
    }
    public static void main(String[] args) {
        GenericTest test = new GenericTest();
        Map<String,String> map1 = new HashMap<>(16);
        map1.put("mizhuo", "123");
        test.getElement(map1);
        Map<String,String> map2 = new LinkedHashMap<>(16);
        map2.put("mizhuo", "123");
        test.getElement(map2);
    }
}
