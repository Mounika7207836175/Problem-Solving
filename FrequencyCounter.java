import java.util.*;
class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int array[]=new int[size];
      for(int i=0;i<size;i++){
        array[i]=sc.nextInt();
      }
      //brute force
      boolean temp[]=new boolean[size];
      for(int i=0;i<size;i++){
          if(temp[i])
          continue;
          int count=1;
          for(int j=i+1;j<size;j++){
              if(array[i]==array[j]){
                //   System.out.print(array[i]+" "+array[j]);
                  temp[j]=true;
                  count++;
              }
             
          }
          System.out.print("The element "+array[i]+" repeates "+count+" times ");
          System.out.println();
      }
      //optimal
     HashMap<Integer, Integer> freq=new HashMap<>();
     for(int i=0;i<size;i++){
         if(freq.containsKey(array[i]))
         freq.put(array[i], freq.get(array[i])+1);
         else
         freq.put(array[i],1);
     }
     for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
         System.out.println(entry.getKey()+" "+entry.getValue());
     }
    }
}
