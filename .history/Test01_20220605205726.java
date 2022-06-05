public class Test01 {
    public static void main(String[] args) {
        
            System.out.println("s");
            int [] i={1,1,1,1};
            int [] sum=Sum(i);
            for (int j : sum) {
                System.out.println(j);
            }
            
    }
    public static int [] Sum(int [] nums){
        int n=nums.length;
        int [] ans=new int[n];
        for (int i = 0, s =0; i < ans.length; i++) {
            ans[i]=s=s+nums[i];
        }
        return ans;
    }
}
