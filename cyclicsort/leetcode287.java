public class leetcode287{
    public static void main(String[] args) {
        int []arr = {3,3,3,3,3};
        int result = findrepeated(arr);
        System.out.println(result);
    }
    static int findrepeated(int []arr){
        sort(arr);
        for(int i =0; i<arr.length; i++){
            if(arr[i]!=i+1){
                return arr[i];
            }
        }
        return -1;
    }
    static void sort(int []arr){
        int i = 0;
        while(i<arr.length){
            int correctindex = arr[i]-1;
            if(arr[i]!=arr[correctindex]){
                int temp = arr[i];
                arr[i] = arr[correctindex];
                arr[correctindex] = temp;
            }else{
                i++;
            }
        }
    }
}