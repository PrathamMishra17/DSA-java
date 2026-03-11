
public class leetcode268{
    public static void main(String[] args) {
        int []arr = {0,1};
        sort(arr);
        int result = linearsearch(arr);
        System.out.println(result);
    }
    static void sort(int []arr){
        int n = arr.length;
        int i = 0;
        while(i<n){
            int correctindex = arr[i];
            if(correctindex!=n){
                if(correctindex!=i){
                    int temp = arr[i];
                    arr[i] = arr[correctindex];
                    arr[correctindex]= temp;
                }else{
                    i++;
                }
            }else{
                i++;
            }
        }
    }
    static int linearsearch(int []arr ){
        int n = arr.length;
        for(int i =0; i<n; i++){
            if(arr[i]!=i){
                return i;
            }
        }
        return n;
    }
}