import java.util.Scanner;
public class FibonacciSerisi {
    public  static void main(String[] args){
        int sayi;
        int current=1,prev=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Sayı Giriniz: ");
        sayi= input.nextInt();
        System.out.println("Fibonacci sayıları:");
        for(int i =1; i <= sayi; i++){
            System.out.print(prev+" ");
            int next = prev+current;
            prev=current;
            current=next;
        }

    }
}
