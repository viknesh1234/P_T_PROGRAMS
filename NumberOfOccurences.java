public class NumberOfOccurences {
    public static void main(String[] args) {
        String input = "banana";
        char target = 'a';
        int count = 0;

        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) == target){
                count++;
            }
        }
        System.out.println("Number Of Occurences: " +target + " = " + count);
    }
}
