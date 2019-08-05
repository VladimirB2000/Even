package JavaRush;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)  throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String number = reader.readLine();
    int a = Integer.parseInt(number);
        if ((a+(a%2))-a==0 && a>=1 && a<10)
            System.out.println("четное однозначное число");
        if ((a+(a%2))-a !=0 && a>=1 && a<10)
            System.out.println("нечетное однозначное число");
        if ((a+(a%2))-a==0 && a>9 && a<100)
            System.out.println("четное двузначное число");
        if ((a+(a%2))-a !=0 && a>9 && a<100)
            System.out.println("нечетное двузначное число");
        if ((a+(a%2))-a==0 && a>99 && a<1000)
            System.out.println("четное трехзначное число");
        if ((a+(a%2))-a !=0 && a>99 && a<1000)
            System.out.println("нечетное трехзначное число");

} }
