public class Test01 {
    public static void main(String[] args) {
        int [] i={1,2,3,4};
        runningSum(i);
            
    }
    public void runningSum(int [] nums){
        int n=nums.length;
        int [] ans=new int[n];
        for (int i = 0, s =0; i < ans.length; i++) {
            ans[i]=s=s+nums[i];
        }
        for (int i : ans) {
            System.out.println(ans[i]);
        }
    }
}
