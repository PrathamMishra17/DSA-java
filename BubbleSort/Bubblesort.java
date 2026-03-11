import java.util.Arrays;
public class Bubblesort{
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int []arr){
        //we will not return any array because the space complexity is one hence
        //we will not make any copy of the array
            boolean swapped = false;

        for(int i =0; i<arr.length; i++){
            for(int j = 0; j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}