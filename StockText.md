## StockText
**Java:**
```java
import java.util.*;
import java.text.*;

public class StockText{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] Stock = new String[n];
        double[] change = new double[n];
        double[] percent = new double[n];
        double[] currentValue = new double[n];
        
        for(int i=0;i<n;i++){
            Stock[i] = sc.next();
            change[i] = sc.nextDouble();
            percent[i] = sc.nextDouble();
            currentValue[i] = sc.nextDouble();
        }
        
        for(int i=0;i<n;i++){
            System.out.printf("%-5s%+10.2f%+10.2f%,15.2f", Stock[i], change[i], percent[i], currentValue[i]);
            System.out.println("");
        }
    }
}

```
