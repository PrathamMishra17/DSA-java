
import java.util.ArrayList;
import java.util.List;
public class leetcode442{
    public static void main(String[] args) {
        int []arr = {1};
        List<Integer> result = findduplicates(arr);
        System.out.println(result);
    }
    static List<Integer> findduplicates(int []arr){
        List<Integer>list = new ArrayList(arr.length);
        sort(arr);
        for(int i =0; i<arr.length; i++){
            if(arr[i]!=i+1){
                list.add(arr[i]);
            }
        }
        return list;
        
    }
    static void sort(int []arr){
        int i =0;
        int n = arr.length;
        while(i<n){
            int correctindex = arr[i]-1;
            if(arr[correctindex]!= arr[i]){
                int temp = arr[i];
                arr[i] = arr[correctindex];
                arr[correctindex] = temp;
            }else{
                i++;
            }
        }
    }
}