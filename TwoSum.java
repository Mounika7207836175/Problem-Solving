import java.util.*;
class TwoSum{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int array[]=new int[size];
    for(int i=0;i<size;i++){
      array[i]=sc.nextInt();
    }
    int target=sc.nextInt();
    //brute force
    int res[]=new int[2];
    for(int i=0;i<size;i++){
      for(int j=i+1;j<size;j++){
        if(array[i]+array[j]==target)
        {
          res[0]=i;
          res[1]=j;
        }
      }
    }
    //better than brute force approach
    for(int i=0;i<size;i++){
      for(int j=i+1;j<size;j++){
         if(array[i]+array[j]==target)
          {
            res[0]=i;
            res[1]=j;
            break;
          }
      }
    }
    //better approach
    HashMap<Integer, Integer> hmap=new HashMap<Integer, Integer>();
    for(int i=0;i<nums.length;i++){
            if(hmap.containsKey(target - nums[i])){
                res[0]=hmap.get(target-nums[i]);
                res[1]=i;
                break;
            }
            else{
                hmap.put(nums[i], i);
            }
        }
    }
    
}
