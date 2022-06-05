public class Test01 {
    public static void main(String[] args) {
        
    }
    public int [] runningSum(int [] nums){
        int n=nums.length;
        int [] ans=new int[n];
        for (int i = 0, s =0; i < ans.length; i++) {
            ans[i]=s=s+nums[i];
        }
        return ans;
    }
}
