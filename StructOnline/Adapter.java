package StructOnline;

import java.util.HashMap;

public class Adapter implements EnglishText {

     BanglaText bt;
     String[] result=new String[100];
     String input;

    HashMap <String, String> map = new HashMap<>();


     Adapter(ConcreteBangla bt){
          this.bt=bt;
         map.put("Ami", "I");
         map.put("Amra", "We");
         map.put("Bhat", "rice");
         map.put("Khai", "eat");
         map.put("Roti", "bread");
         map.put("Banai", "make");
         for(int x=0; x<result.length; x++)
             result[x]=new String();
         input=bt.input;
          result= input.split(" ");

     }
    @Override
    public void show() {

        for (int x=0; x<result.length; x++)
            System.out.println(map.get(result[x]));


    }
}
