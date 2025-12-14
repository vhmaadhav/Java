package Kunal;

public class ceilingofanumber {
    static void main() {
        int[] arr={2,3,5,9,14,16,18};
        int target=14;
        System.out.println(binarysearch(arr,target));

    }
    static int binarysearch(int[] arr, int target){
        int start =0;
        int end=arr.length-1;
        while(start<=end){
            int mid= start + (end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                if(arr[mid]==target){
                return arr[mid];
                } else{
                    return arr[mid+1];
                }
            }
        }
        return start;
    }
}
