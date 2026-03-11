

import java.util.ArrayList;
import java.util.List;

public class leetcode448{
    public static void main(String[] args) {
        int []arr = {1,1};
        sort(arr);
        List<Integer> result = findmissing(arr);
        System.out.println(result);
        
    }
   static  List<Integer> findmissing(int []arr){
    List<Integer> list = new ArrayList(5);
       sort(arr);
       for(int i = 0; i<arr.length; i++){
        if(arr[i]!=i+1){
            list.add(i+1);
        }
       }
       return list;
   }
    static void sort(int []arr){
        int j = 0;
        while(j<arr.length){
            int correctindex = arr[j] - 1;
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