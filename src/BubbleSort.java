import java.util.Arrays;
//Worst and Average Case Complexity: O(n*n). Worst case occurs when array is reverse sorted.
//Best Case Time Complexity: O(n). Best case occurs when array is already sorted
public class BubbleSort {
    public static void bubbleSort(int[]arr){
        System.out.println("unsorted arrays: "+" "+Arrays.toString(arr));
        //flag to optimized sort algorithm
        boolean flag;
        //iterate through number of pass
        for(int i=0;i<arr.length-1;i++){
            flag = false;
            //iterate through number of comparision
            for(int j=0;j<arr.length-1-i;j++){
                //check if previous element is greater than next element in array and swap
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(flag==false){
                break;
            }
        }
        System.out.println("Bubble Sorted arrays: "+" "+Arrays.toString(arr));

    }

    /*
    * Insertion sort algorithm
    * Best case Time Complexity: O(n*2)
    * Worst case Time Complexity: : O(N)
     */
    public static void insertionSort(int[]arr){
        //loop start from beginning of unsorted list
        for(int i=1;i<arr.length;i++){
            //take a variable from first unsorted sublist to compare with others
            //value of this variable will increment as it goes through loop
            int temp=arr[i];
            int j =i-1;
            while (j>=0&&arr[j]>temp){
                //right value assign to left
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        System.out.println("Insertion sort sorted arrays: "+" "+ Arrays.toString(arr));

    }

    public static void main(String[]args){
        int[] arr= new int[]{17,20,7,9,6,2,3,1,0,-1,-2};
        bubbleSort(arr);
//        System.out.println("\n");
        insertionSort(arr);

    }
}
