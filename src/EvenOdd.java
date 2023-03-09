import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        /*Snack 1
        Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert a number : ");
        int number = Integer.parseInt(scan.nextLine());

        if(number % 2 == 0){
            System.out.println(number);
        }else{
            System.out.println(number+1);
        }
    }
}