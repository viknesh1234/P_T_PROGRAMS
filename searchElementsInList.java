import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class searchElementsInList {
    public static void main(String[] args) {
    //    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
    //     int searchelement = 5;

    //     if(list.contains(searchelement)){
    //         System.out.println("element is found");
    //     }
    //     else{
    //         System.out.println("element is not found ") ;
    //     }
            List<List<Integer>> list = new ArrayList<>();
            Collections.add(Arrays.asList(1,2,3));
            Collections.add(Arrays.asList(4,5));
            Collections.add(Arrays.asList(6,7,8));

            int searchelement = 5;
            boolean found = false;

            for(List<Integer> value : Collections);{
                if(value.contains(searchelement)){
                    System.out.println("element is found");
                    found =true;
                    break;
                }
                if(!found){
                    System.out.println("element is not found ");
                }
            }

    }
}
