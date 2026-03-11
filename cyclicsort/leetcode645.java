import java.util.Arrays;
public class leetcode645{
    public static void main(String[] args) {
        int []arr = {1,1};
        int []set = findinset(arr);
        System.out.println(Arrays.toString(set));
    }
    static int [] findinset(int []arr){
        sort(arr);
        for(int i =0; i<arr.length; i++){
            if(arr[i]!=i+1){
                return new int[] {arr[i], i+1};
            }
        }
        return new int []{-1,-1};
    }
    static void sort(int []arr){
        int i =0;
        int n = arr.length;
        while(i<n){
            int correctindex = arr[i]-1;
            if(arr[correctindex]!=arr[i]){
                int temp = arr[i];
                arr[i] = arr[correctindex];
                arr[correctindex] = temp;
            }else{
                i++;
            }
        }
    }
}