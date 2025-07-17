//Kth largest element in java
import java.util.*;
public class kthlargestelearray{
    public int findKthlargest(int [] nums,int k){
        // Scanner sc = new Scanner(System.in);
        // System.out.print("enter numbes in arr");
        // int[] nums=sc.newInt();
        // int k[]=sc.newInt();
        PriorityQueue<Integer>minHeap=new PriorityQueue<>();
        for(int num:nums){
            minHeap.add(num);
            if(minHeap.size()>k){
                minHeap.poll();
            }
            
        }
        return minHeap.peek();

    }
    public static void main(String[] args){
        kthlargestelearray obj = new kthlargestelearray();
        int[] nums={1,4,5,3,2,6};
        int k=3;
        int result=obj.findKthlargest(nums,k);
        System.out.println("the"+k+"largest element is:"+result);
    }
}