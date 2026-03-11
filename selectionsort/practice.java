import java.util.Arrays;
public class practice{
    public static void main(String[] args) {
        int []arr = {0,-32,3,4,5};
        search(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void search(int[]arr){
        boolean flag = false;
        for(int i = 0; i<arr.length;i++){
            for(int j =0; j<arr.length-1-i;j++){
               
                if(arr[j]>arr[j+1]){
                     flag=true;
                     int temp =arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1]=temp;
                }
            }
            if(!flag){
                break;
            }
        }
    }
}