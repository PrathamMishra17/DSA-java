public class leetcode41{
    public static void main(String[] args) {
        int []arr = {3,4,-1,1};
        int result = findmissingpositive(arr);
        System.out.println(result);
    }
    static int findmissingpositive(int []arr){
        sort(arr);
        int n = arr.length;
        int i =0; 
        while(i<n){
            if(arr[i]!=i+1){
                return 1+1;
            }else{
                i++;
            }
        }
        return arr[n-1]+1;
    }
    static void sort(int []arr){
        int n = arr.length;
        int i =0;
        while(i<n){
            int correctindex = arr[i]-1;
            if(correctindex>=0 && correctindex<n){
                if(arr[correctindex]!=arr[i]){
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
}