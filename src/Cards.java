import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cards implements Comparable{

    private List<String> types = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public static Comparator<Cards> comparator = (o1, o2) -> o1.types.size() > o2.types.size() ? 1 : o1.types.size() < o2.types.size() ? -1 : 0;

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public static Cards fromJSONtoObject(String jsonData) throws IOException {
        return new ObjectMapper().readValue(jsonData, Cards.class);
    }

    @Override
    public String toString() {
        return "Cards{" +
                "types=" + types +
                ", additionalProperties=" + additionalProperties +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
