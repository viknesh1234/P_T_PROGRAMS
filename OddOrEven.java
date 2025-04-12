public class OddOrEven {
    public static void main(String[] args) {
        int size[] = {1,2,3,4,5,6,7,8,9,};
    //     int odd=0;
    //     int even=0;
    //     for(int i=0; i<size.length; i++){
    //         if(size [i]%2==0)//5%2==0 => 5%2=1, 1==0 => false
    //             // 6%2==0 => 6%2=0, 0==0 => true
    //             // 7%2==0 => 7%2=1, 1==0 => false
    //             // 8%2==0 => 8%2=0, 0==0 => true
    //             // 9%2==0 => 9%2=1, 1==0 => false
    //             // 10%2==0 => 10%2=0, 0==0 => true
    //             // i=5+1=6, i=6+1=7, i=7+1=8, i=8+1=9, i=9+1=10
    //         even++;
    //         else odd++;
    //     }
    //     System.out.println("Number of odd numbers: " +odd + " and number of even numbers: " +even);
    int max1 =Integer.MIN_VALUE;
    int max2 =Integer.MIN_VALUE;
    for(int i=0; i<size.length; i++){
        if(size[i]>max1){
            max2 = max1;
            max1=size[i];
        }else if(size[i]>max2 && size[i]!=max1){
            max2=size[i];
        }
    }
    System.out.println( max2);
    }

}
