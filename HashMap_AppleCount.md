## HashMap_AppleCount
**Java:**
```java
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        while(true){
            String person = sc.next();
            if(person.equals("0")) break;
            else{
                int amountApple = sc.nextInt();
                if(map.containsKey(person)){
                    amountApple += map.get(person);
                    map.put(person, amountApple);
                }
                else{
                    map.put(person, amountApple);
                }
            }
        }
        String who = sc.next();
        System.out.println(map.get(who));
    }
}

```
