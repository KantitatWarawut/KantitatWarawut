## MinutesToYearDay
**Java:**
```java
import java.util.Scanner;

public class MinuteToYearDay{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int day = 1440;
        int amo_day = n/day;
        int amo_year = 0;
        while(amo_day>=365){
            amo_day-=365;
            amo_year+=1;
        }
        System.out.print(amo_year + " " + amo_day);
    }
}
```
