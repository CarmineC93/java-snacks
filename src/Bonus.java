import java.util.Random;

public class Bonus {
    public static void main(String[] args) {
/*    Snack 4 (Bonus)
    Crea due array che hanno un numero di elementi diversi. Mostra a video
    dei nuovi elementi random finchè il numero di elementi
    presenti nell’array che ne ha di meno + quelli mostrati a video
    non è uguale al numero di elementi presenti nell’array che ne ha di più*/

        int [] firstArray = {1,2,3,4,5};
        int [] secondArray = {1,2,3,4,5,6,7};

        int[] majorArray = firstArray.length > secondArray.length ? firstArray : secondArray;
        int[] minorArray = firstArray.length > secondArray.length ? secondArray : firstArray;

        Random random = new Random();

        int i = 0;
        while(minorArray.length + i != majorArray.length){
            System.out.println((random.nextInt(majorArray.length)));
            i++;
        }

    }
}
