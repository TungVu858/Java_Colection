package thuchanh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap  = new HashMap<>();
        hashMap.put("Smith",29);
        hashMap.put("Anderson",31);
        hashMap.put("Lewis",30);
        hashMap.put("Cook",30);
        System.out.println("Hiển thị ");
        System.out.println(hashMap.get("Smith"));
        System.out.println(hashMap + "\n");
        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Hiển thị ");
        System.out.println(treeMap + "\n");
        Map<String,Integer> linkedMap = new LinkedHashMap<>(16,0.75f,true);
        linkedMap.put("Smith", 30);
        linkedMap.put("Anderson", 31);
        linkedMap.put("Lewis", 29);
        linkedMap.put("Cook", 29);
        System.out.println("Lewis is " + linkedMap.get("Lewis"));
    }
}
