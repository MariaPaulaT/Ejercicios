package Ejercicios.Arrrays;
//Sort two arrays [1,5, 8], [2,6,8,9]
// Opcion 1: 
public class MergeSortedArray {
    
    public static int[] MergeArray(int[] numbers1, int[] numbers2){
        //Check input
        if (numbers1.length==1){
            return numbers2;
        }
        if (numbers2.length==1){
            return numbers1;
        }
        int numb1lenght = numbers1.length;
        int numb2lenght = numbers2.length;
        int leng = numb1lenght +numb2lenght;
        int[] arreglo = new int[leng];
        for(int a =0; a<numb1lenght;a++){
             arreglo[a]=numbers1[a];
        }
        numb1lenght--;
        for(int i=0; i<numbers2.length;i++){
            for(int j=numb1lenght; j>=0; j--){
            if(numbers2[i]<arreglo[j]){
              arreglo[j+1]=arreglo[j];
              arreglo[j]=numbers2[i];
            }
        }
        numb1lenght++;
        }
        int ultimo=0;
        if(numbers1[numbers1.length-1]>numbers2[numbers2.length-1]){
            ultimo=numbers1[numbers1.length-1];
        }else{
            ultimo=numbers2[numbers2.length-1];
        }
        arreglo[leng-1] =ultimo;
        System.out.println(arreglo[0]);
        System.out.println(arreglo[1]);
        System.out.println(arreglo[2]);
        System.out.println(arreglo[3]);
        System.out.println(arreglo[4]);
        System.out.println(arreglo[5]);
        return arreglo;
    }

    public static void mergeArr2 (int[] numb1, int[] numb2){

        int j=0;
        int i=0;
        int ar =0;
        int[] arreglo = new int[numb1.length+ numb2.length];
        while(i<numb1.length && j< numb2.length){
            if(numb1[i]>numb2[j]){
                arreglo[ar]=numb2[j];
                ar++;
                j++;
            }
            else{
                arreglo[ar]= numb1[i];
                ar++;
                i++;
            }
        }
        if (i<numb1.length){
            while(i<numb1.length){
                arreglo[ar]=numb1[i];
                i++;
            }
        }

        if (j<numb2.length){
            while(j<numb2.length){
                arreglo[ar]=numb2[j];
                j++;
            }

        }
        System.out.println(arreglo[0]);
        System.out.println(arreglo[1]);
        System.out.println(arreglo[2]);
        System.out.println(arreglo[3]);
        System.out.println(arreglo[4]);
        System.out.println(arreglo[5]);
    }
    public static void main(String[] args) {
        int[] nums1= new int[3];
        nums1[0]=5;
        nums1[1]=6;
        nums1[2]=7;
        int[] nums2 = new int[3];
        nums2[0]=1;
        nums2[1]=3;
        nums2[2]=9;
        mergeArr2(nums1,nums2); 
    }
}
