## SwitchDayFortune
**Java:**
```java
import java.util.Scanner;

public class SwitchDayFortune{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        switch(a){
            case "Monday":
                System.out.println("Fortune : Purple");
                System.out.println("Unfortunate : Red");
                break;
            case "Tuesday":
                System.out.println("Fortune : Orange");
                System.out.println("Unfortunate : Yellow, White");
                break;
            case "Wednesday":
                System.out.println("Fortune : Black, Brown, Gray");
                System.out.println("Unfortunate : Pink");
                break;
            case "Thursday":
                System.out.println("Fortune : Red");
                System.out.println("Unfortunate : Purple");
                break;
            case "Friday":
                System.out.println("Fortune : Pink");
                System.out.println("Unfortunate : Black, Blue, Gray");
                break;
            case "Saturday":
                System.out.println("Fortune : Blue, Baby Blue");
                System.out.println("Unfortunate : Green");
                break;
            case "Sunday":
                System.out.println("Fortune : Green");
                System.out.println("Unfortunate : Blue, Baby Blue");
                break;
            default: System.out.println("Input is invalid");
        }
    }
}
```
