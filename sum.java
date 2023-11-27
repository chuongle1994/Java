import java.util.Scanner;
public class sum {
  
    public static void main(String[] args) {
        int x, y, sum;
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        x = myobj.nextInt();

        System.out.println("Enter another number: ");
        y = myobj.nextInt();
        sum = calculation(x, y);
        System.out.println("Sum is " + sum);
    }
    public static int calculation(int x, int y){
        return x + y;

    }
}



   