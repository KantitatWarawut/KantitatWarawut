## WeaponFactory
**Java:**
```java
import java.util.Scanner;

public class WeaponFactory{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sword = 10, shield = 8, helm = 3;
        int amo_sword = 0, amo_shield = 0, amo_helm = 0;
        
        while(n>=3){
            if(n>=sword){
                n -= sword;
                amo_sword+=1;
            }
            if(n>=shield){
                n -= shield;
                amo_shield+=1;
            }
            if(n>=helm){
                n -= helm;
                amo_helm+=1;
            }
        }
        
        System.out.print(amo_sword + " " + amo_shield + " " + amo_helm + " " + n);
        
    }
}
```
