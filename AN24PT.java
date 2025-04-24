import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AN24PT {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(0,"apple");
        map.put(1,"orange");
        map.put(1,"banana");
        String s = map.get(1);
        System.out.println(s);
 
        HashMap<Character, String> map1 = new HashMap<Character, String>();
        map1.put('n', "naresh");
        map1.put('m', "viknesh");
        map1.put('e', "vikram");

        System.out.println("-------------------------");
            // next one
       for (Map.Entry<Character, String> i : map1.entrySet()) {
         System.out.println(i.getKey() + " : " + i.getValue());
        }
        System.out.println("````````````````````````");
        System.out.println(map.keySet());
        System.out.println("````````````````````````");
        System.out.println(map.values());
        System.out.println("````````````````````````");
        System.out.println(map.getOrDefault('n', "key is not there"));
        System.out.println("````````````````````````");
        System.out.println(map.containsValue("v"));
        System.out.println("````````````````````````");
        System.out.println(map.containsKey("dhj"));
        System.out.println("````````````````````````");
        System.out.println(map.isEmpty());
        System.out.println("````````````````````````");
        System.out.println('p');
        System.out.println("````````````````````````");
        System.out.println(map);
        System.out.println("-------------------------");

        // next one
        Scanner sc = new Scanner(System.in);
        HashMap<Character, String> map2 = new HashMap<Character, String>();
        System.out.println("Enter the size");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the key");
            char key = sc.next().charAt(0);
            System.out.println("Enter the value");
            String value = sc.next();
            map2.put(key, value);
        }
        System.out.println(map2);

        System.out.println("--------------------------");

        // next one
        Scanner sc1 = new Scanner(System.in);
        HashMap<Integer, Integer> map3 = new HashMap<Integer, Integer>();
        int [] arr = new int[] {1,2,1,2,3,4,5,5,6,7,7 };
        for(int i=0; i<arr.length; i++){
            map3.put(arr[i],map3.getOrDefault(arr[i], 0)+1);
        }
        System.out.println(map3);
    }
}
