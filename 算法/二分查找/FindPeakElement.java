package learn;

public class FindPeakElement {
    public static int findPeakElements(int[] nums){
        int n=nums.length;
        if(n==1)
            return 0;
        if(nums[0]>nums[1])
            return 0;
        if(nums[n-1]>nums[n-2])
            return n-1;
        int l=1,r=n-2,m=0,ans=-1;
        while (l<=r){
            m=(l+r)/2;
            if(nums[m]<nums[m-1]){
                r=m-1;
            }else if(nums[m]<nums[m+1]){
                l=m+1;
            }else{
                ans=m;
                break;
            }
        }
        return ans;
        
    }
}
