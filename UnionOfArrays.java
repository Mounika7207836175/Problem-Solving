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
        HashSet<Integer> hs=new HashSet<>(n1+n2);
        for(int i=0;i<n1;i++){
            hs.add(a[i]);
        }
        for(int j=0;j<n2;j++){
            hs.add(b[j]);
        }
        for(int ele:hs){
            result.add(ele);
        }
        Collections.sort(result);
        return result;
    }
}
  
