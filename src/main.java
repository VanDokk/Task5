import java.io.IOException;
import java.util.List;

public class main {
    public static void main(String args[]) throws IOException
    {

        getJSON gj = new getJSON();
        getJSON.url = "https://api.magicthegathering.io/v1/cards";
        gj.start();

        Cards cards = Cards.fromJSONToObjects(gj.getJson());
        System.out.println(cards.getCards().get(0));
    }
}
