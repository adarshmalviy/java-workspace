import java.util.Arrays;

// import jdk.internal.util.xml.impl.Input;
// for sorting of string Collections.sort() can be used by converting it in list

public class arraysort {
    public static void main(String [] args){
        // int[] arr =new int[]{1,5,9,4,7};
        System.out.println("hello9");
        // int[] arr =  new int[5];
        int arr[] = new int[]{5,3,6,7,2};
        System.out.println("Array: "
                           + Arrays.toString(arr));
        Arrays.sort(arr);
        // System.out.println(arr);
        System.out.println("Array: "
                           + Arrays.toString(arr));
        
    }
    
}
