package lab7;

public class IndexofSmallest {
    public static int indexofSmaller(int[] arr){
        int min = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i]<arr[min]){
                min = i;
            }
        }
        return min;

    }
    public static void main(String[] args){
        int[] values = { 6,5,8,7,11};
        System.out.println("Index of the smallest value is " + indexofSmaller(values));
    }
}
