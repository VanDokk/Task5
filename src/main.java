import java.io.IOException;

public class main {
    public static void main(String args[]) throws IOException
    {

        getJSON gj = new getJSON();
        getJSON.url = "https://api.magicthegathering.io/v1/types";
        gj.run();

        Cards cards, cards1;
        cards = cards1 = Cards.fromJSONtoObject(gj.getJson());
        System.out.println(cards.toString());
        System.out.println(cards.compareTo(cards1));


    }
}
