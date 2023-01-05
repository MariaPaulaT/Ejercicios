public class pivotindex {
    static public int pivotIndex(int[] nums) {
int sumaTot=0;
        for (int i=1; i<nums.length; i++)
        {
            int ind = i;
            int sumaAnt=0;
            int sumaDesp=0;
            for (int j =0; j<=ind; j++){
                sumaAnt += nums[j];
            }
            for(int z=ind+1; z<nums.length; z++)
            {
                sumaDesp+= nums[z];
            }
            if(sumaAnt==sumaDesp){
                System.out.println(sumaAnt);
                System.out.println(sumaDesp);
                return ind;
            }
 sumaTot+=nums[i];
            
        }
        if (sumaTot==0)
        {
            return 0;
        }
        else{
            return -1;
        }
    }


    public static void main(String[] args) {
        
        int[] nums = new int[6];
nums[0]=-1;

 nums[1]=-1;
nums[2]=0;
nums[3]=1;
nums[4]=1;
nums[5]=-1;
System.out.println(pivotIndex(nums));
    }
}
