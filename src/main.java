import java.io.IOException;
import java.util.List;

public class main {
    public static void main(String args[]) throws IOException, InterruptedException {

        getJSON gj = new getJSON();
        getJSON.url = "https://api.magicthegathering.io/v1/cards";
        gj.start();
        String json = gj.getJson();

        do {
            Thread.sleep(100);
        } while ((json = gj.getJson()) == null);

        Cards cards = Cards.fromJSONToObjects(json);

        System.out.println("Array sorted by names:\n\n");
        cards.getCards().sort(Card.byNameDesc);
        System.out.println(cards);

        System.out.println("Array sorted by rarity in ascending order:\n\n");
        cards.getCards().sort(Card.byRarityAsc);
        System.out.println(cards);

        System.out.println("Array sorted by rarity in descending order:\n\n");
        cards.getCards().sort(Card.byRarityDesc);
        System.out.println(cards);

        System.out.println("Array sorted by manacost in ascending order:\n\n");
        cards.getCards().sort(Card.byManaCostAsc);
        System.out.println(cards);

        System.out.println("Array sorted by manacost in descending order:\n\n");
        cards.getCards().sort(Card.byManaCostDesc);
        System.out.println(cards);
    }
}
