// import java.lang.Thread.State;

public class minmax {
    
   static int min(int arr[],int n){
       int res = arr[0];
        for (int i=1;i<n;i++)
        {
            res = Math.min(res, arr[i]);
        }
        return res;
    }
    static int max(int arr[],int n){
        int res = arr[0];
         for (int i=1;i<n;i++)
         {
             res = Math.max(res, arr[i]);
         }
         return res;
     }
    public static void main(String[] args){
        System.out.println("hey there");
        int arr[] = {1,3,4,7,2};
        int n = arr.length;
        System.out.println("minimum no:"+min(arr,n));
        System.out.println("maximum no:"+max(arr,n));
    }
}
