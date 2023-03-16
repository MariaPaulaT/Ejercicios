package Arrrays;

import java.util.HashMap;

class commons{

/*public static boolean commonItems(String[] wor1, String[] wor2){
boolean resp = false;
    for(int i=0; i<wor1.length;i++){
         
        for(int j=0; j<wor2.length;j++){

            if(wor1[i]==wor2[j]){
                resp= true;

            }
        }
        if(resp==true)
        {
            System.out.println(resp);
            return resp;
        }

    }
    
    System.out.println(resp);
    return resp;
}*/
public static boolean commonItems(String[] wor1, String[] wor2){

    HashMap <String, Boolean> mapi = new HashMap<>();
    for (int i=0; i<wor1.length; i++){
        mapi.put(wor1[i],true);
    }

    for(int j=0;j<wor2.length;j++){
        if(mapi.containsKey(wor2[j])){
            System.out.println(true);
            return true;
        }
    }
    
    System.out.println(false);
    return false;
}

public static void main(String[] args) {

    String[] wors1= new String[4];
    wors1[0]="a";
    wors1[1]="b";
    wors1[2]="c";
    wors1[3]="x";

    String[] wors2= new String[3];
    wors2[0]="z";
    wors2[1]="y";
    wors2[2]="i";
    commonItems(wors1, wors2);
}
}