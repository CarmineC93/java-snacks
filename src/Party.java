import java.util.Arrays;
import java.util.Random;

public class Party {
    public static void main(String[] args) {
/*    Snack 2
    Generatore di “nomi cognomi” casuali:
    il Grande Gatsby ha una lista di nomi e una lista di cognomi,
    e da queste vuole mostrare a video una falsa lista di invitati
    con nome e cognome.*/

        String [] partyNames = {"Tom","Ben","Liza","Luc" };
        String [] partySurname = {"Swift","Hard","Skywalker","Hur" };

        String [] partyInvited = new String[4];

        Random random = new Random();

        for (int i = 0; i < partyInvited.length; i++) {

            String invited = partyNames[i] + " " + partySurname[random.nextInt(partySurname.length)];
            partyInvited[i] = invited;
        }

        System.out.println(Arrays.toString(partyInvited));
    }
}

