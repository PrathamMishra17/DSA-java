import java.util.Arrays;
public class selectionsort{
    public static void main(String[] args) {
        int []arr = {3,5,4,1,2};
        search(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void search(int []arr){
        for(int i =0; i<arr.length;i++){
            int lastindex = arr.length-i-1;
            int maxindex = Maxindex(arr, 0, lastindex);
            swap(arr, maxindex,lastindex);
        
        }
    
    }
    static void swap(int []arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]=temp;
    }
    static int Maxindex(int []arr, int start,int end){
        int max = start;
        for(int i = start; i<=end ; i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
    return max;
}
   
}