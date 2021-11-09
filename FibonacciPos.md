## FibonacciPos
**Java:**
```java
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(FibonacciPos(n));
    }
    
    public static int FibonacciPos(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return FibonacciPos(n-1) + FibonacciPos(n-2);
    }
}
```
