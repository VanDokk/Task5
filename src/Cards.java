import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cards {

    private List<Card> cards = null;
    //private List<String> types = null;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(String jsonData) throws IOException {
        this.cards = cards;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public static Cards fromJSONToObjects(String jsonData) throws IOException {
       return new ObjectMapper().readValue(jsonData, Cards.class);
    }

    @Override
    public String toString() {
        return "Cards{" +
                "cards=" + cards +
                '}';
    }
}
