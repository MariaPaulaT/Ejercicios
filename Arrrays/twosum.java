package Ejercicios.Arrrays;
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
public class twosum {
    
    public static int[] twosum(int[] numbs, int target){
        boolean encontrado = false;
        int i =0;
        int[] answer = new int[2];
        while(encontrado==false){
            if (numbs[i]+ numbs[i+1]==target){
                encontrado = true;
                answer[0]=numbs[i];
                answer[1]=numbs[i+1];
            }
            i++;
        }
        System.out.println(answer[0] );
        System.out.println(answer[1] );
        return answer;
    }
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0]=1;
         nums[1]=2;
        nums[2]=4;
        nums[3]=6;
        nums[4]=4;

        twosum(nums, 10);
    }
}
