import java.util.Arrays;
//Worst and Average Case Complexity: O(n*n). Worst case occurs when array is reverse sorted.
//Best Case Time Complexity: O(n). Best case occurs when array is already sorted
public class BubbleSort {
    public static void bubbleSort(int[]arr){
        //iterate through number of pass
        for(int i=0;i<arr.length-1;i++){
            //iterate through number of comparision
            for(int j=0;j<arr.length-1-i;j++){
                //check if previous element is greater than next element in array and swap
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[]args){
        int[] arr= new int[]{17,20,7,9,6,2,3,1,0,-1,-2};
        bubbleSort(arr);

    }
}
