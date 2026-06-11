import java.util.*;
class Union{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int size1=sc.nextInt();
    int array1[]=new int[size1];
    for(int i=0;i<size1;i++){
      array1[i]=sc.nextInt();
    }
    int size2=sc.nextInt();
    int array2[]=new int[size2];
    for(int i=0;i<size2;i++){
      array2[i]=sc.nextInt();
    }
  }
  public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        int n1=a.length;
        int n2=b.length;
        ArrayList<Integer> result=new ArrayList<>(n1+n2);
        int i=0, j=0;
        while(i<n1 && j<n2){
            if(a[i]<b[j] && !result.contains(a[i])){
                result.add(a[i]);
                i++;
            }
            else if(b[j]<a[i] && !result.contains(b[j])){
                result.add(b[j]);
                j++;
            }
            else
            {
                if(!result.contains(a[i])){
                result.add(a[i]);
                i++;
                j++;
                }
            }
        }
        while(i<n1){
            if(!result.contains(a[i]))
            result.add(a[i]);
            i++;
        }
        while(j<n2){
            if(!result.contains(b[j]))
            result.add(b[j]);
            j++;
        }
        return result;
    }
}
  
