package Ejercicios.Arrrays;
//Sort two arrays [1,5, 8], [2,6,8,9]
// Opcion 1: 
public class MergeSortedArray {
    
    public static void MergeArray(int[] numbers1, int[] numbers2){
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
    }
    public static void main(String[] args) {
        int[] nums1= new int[3];
        nums1[0]=5;
        nums1[1]=8;
        nums1[2]=7;
        int[] nums2 = new int[3];
        nums2[0]=1;
        nums2[1]=3;
        nums2[2]=9;
        MergeArray(nums1,nums2); 
    }
}
