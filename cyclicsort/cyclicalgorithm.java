import java.util.Arrays;
public class cyclicalgorithm{
    //used when range from 1 to N is given and the time complexity is o[N] which is 
    //same in both the cases worst and best
    public static void main(String[] args) {
        int []arr = {4,3,2,7,8,2,3,1};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicsort(int []arr){
        int j = 0;
        while(j<arr.length){
            int correctindex = arr[j] -1;
            if(arr[j]!=arr[correctindex]){
                int temp = arr[j];
                arr[j] = arr[correctindex];
                arr[correctindex] = temp;
            }else{
                j++;
            }
        }
    }
}