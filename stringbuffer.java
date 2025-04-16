import java.util.*;
public class stringbuffer {
    public static void main(String[] args) {
        // long startTime = System.currentTimeMillis();
    
        // StringBuffer buffer = new StringBuffer("Hello");
        // for(int i=0; i<1000;i++){
        //     buffer.append("World");
        // }
        // System.out.println("Time taken to append 1000 times: " + (System.currentTimeMillis() - startTime) + "ms");

        // startTime = System.currentTimeMillis();
        // StringBuilder builder = new StringBuilder("Hello");
        // for(int i=0;i<1000;i++){
        //     builder.append("world");
        // }
        // System.out.println("Time taken to append 1000 times: " + (System.currentTimeMillis() - startTime) + "ms");
        String s1 = "hello";
        String s2 = new String("world");
        String s3 = s1.intern();
        System.out.println(s1==s2);
        System.out.println(s1==s3);

        }
}
