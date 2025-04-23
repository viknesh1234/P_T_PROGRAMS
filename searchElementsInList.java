import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
                //  search elements
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
    list.add(Arrays.asList(1, 2, 3));
    list.add(Arrays.asList(4, 5));
    list.add(Arrays.asList(6, 7, 8));

    int searchElement = 5;
    boolean found = false;

    for (List<Integer> value : list) {
        if (value.contains(searchElement)) {
            System.out.println("Element is found");
            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println("Element is not found");
    }


    }
}
