package lab7;

public class SmallestValue {
    public static int smallest(int[] arr){

        int min = 0;//assume that this is smallest value
        for(int i = 1;i <= arr.length;i++){
            if(i< arr[min]){
                min = i;
            }
        }
        return min;
    }

    public static void main(String[] args){
        int[] values = {6,5,8,7,11};
        System.out.println("Smallest "+smallest(values));
    }

}
