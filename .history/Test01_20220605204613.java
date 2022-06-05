public class Test01 {
    public static void main(String[] args) {
        

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
