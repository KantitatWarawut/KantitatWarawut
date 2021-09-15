## Quiz_Chocolate
**Java:**
```java
import java.util.Scanner;

public class MyClass {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int frd = sc.nextInt();
        int i=1,j=0,cnt = 0,num = 1;
        while(i<=row){
            System.out.print(num);
            cnt++;
            j++;
            if(cnt == frd){
                num++;
                cnt = 0;
            }
            if(j == col){
                j = 0;
                i++;
                System.out.println("");
            }
        }
    }
}
```
