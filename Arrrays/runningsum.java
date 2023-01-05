class Solution {
    static public int[] runningSum(int[] nums) {



for (int i =1; i<nums.length;i++){

nums[i]= nums[i]+nums[i-1];

}
System.out.println(nums[3]);
return nums;
    }


    public static void main(String[] args) {
        int[] nums = new int[5];
nums[0]=1;

 nums[1]=1;
nums[2]=1;
nums[3]=1;
nums[4]=1;
       runningSum(nums);
    }
}