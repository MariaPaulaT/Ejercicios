package Ejercicios.Arrrays;
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
public class twosum {
    // If the numbers of the answer where only in order
    public static int[] twosum(int[] numbs, int target){
        boolean encontrado = false;
        int i =0;
        int[] answer = new int[2];
        answer[0]=0;
        answer[1]=0;
        while(encontrado==false && i < numbs.length ){
            if (numbs[i]+ numbs[i+1]==target){
                encontrado = true;
                answer[0]=numbs[i];
                answer[1]=numbs[i+1];
            }
            i++;
        }
        
        return answer;
    }

    public static int[] twosum2 (int[] nums, int target){
        int[] answer = new int[2];
        for (int i =0; i< nums.length; i++){
            for (int j =i+1; j< nums.length; j++){
                if (nums[i]+ nums[j]== target){
                    answer[0]=i;
                    answer[1]=j;
                    System.out.println(answer[0]);
                    System.out.println(answer[1]);
                    return answer;
                }
            }
        }

        return answer;

    }
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0]=1;
         nums[1]=2;
        nums[2]=4;
        nums[3]=6;
        nums[4]=4;

        twosum2(nums, 10);
    }
}
