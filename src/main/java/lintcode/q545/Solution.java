package lintcode.q545;

public class Solution {
    public int moveFlag(int[] n,int left,int right){
        while(left<right){
            while(left<right && n[right]<=n[left]){
                right--;
            }
            swap(n,left,right);
            while(left<right && n[right]<n[left]){
                left++;
            }
            swap(n,left,right);
        }
        return left;
    }
    public void sortForTopK(int[] n,int k,int left,int right){
        if(left>=right){
            return;
        }
        int mid=moveFlag(n,left,right);
        if(mid<k){
            sortForTopK(n,mid,left,mid-1);
            sortForTopK(n,k,mid+1,right);
        }else if(mid>k){
            sortForTopK(n,k,left,mid-1);
        }
    }
    public void swap(int[] n,int a,int b){
        if(a==b){
            return;
        }
        n[a]=n[a]^n[b];
        n[b]=n[a]^n[b];
        n[a]=n[a]^n[b];
    }
    /**
     * @param nums: an integer array
     * @param k: An integer
     * @return: the top k largest numbers in array
     */
    public int[] topk(int[] nums, int k) {
        // write your code here
        int[] result=new int[k];
        sortForTopK(nums,k,0,nums.length-1);
        System.arraycopy(nums,0,result,0,k);
        return result;
    }
}