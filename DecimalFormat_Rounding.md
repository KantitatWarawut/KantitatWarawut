## DecimalFormat_Rounding
**Java:**
```java
import java.util.*;
import java.text.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        int pos = sc.nextInt();
        String format = "0.";
        for(int i=0;i<pos;i++){
            format += "#";
        }
        DecimalFormat fmt = new DecimalFormat(format);
        System.out.println(fmt.format(n));
    }
}

```
