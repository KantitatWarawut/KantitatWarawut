## VectorListSort
**Java:**
```java
import java.io.*;
import java.util.*;

public class VectorListSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Vector<Integer> nums = new Vector<Integer>();
        int a;
        while(true){
            a = sc.nextInt();
            if(a == -1) break;
            else{
                nums.add(a);
            }
        }
        
        Collections.sort(nums);
        for(int i=0;i<nums.size();i++){
            System.out.print(nums.get(i) + " ");
        }
        
        System.out.println("");
        
        Collections.reverse(nums);
        for(int i=0;i<nums.size();i++){
            System.out.print(nums.get(i) + " ");
        }
    }
}

```
