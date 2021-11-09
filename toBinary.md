##toBinary
**Java:**
```java
import java.util.Scanner;

public class Q2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        toBinary(n);
    }
    public static void toBinary(int n){
        if(n>0){
            toBinary(n/2);
            System.out.print(n%2);
        }
    }
}
```
