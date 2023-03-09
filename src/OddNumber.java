public class OddNumber {
    public static void main(String[] args) {
       /* Snack 3
        Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari*/

        int [] oddNumbers = {120 , 50, 52, 53, 95, 2};
        int sum = 0;

        for (int i = 0; i < oddNumbers.length ; i++) {
            if(i % 2 != 0){
                sum += oddNumbers[i];
            }
        }

        System.out.println(sum);
    }
}
