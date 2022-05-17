
import java.util.HashMap;

public class Abbreviations {
    private HashMap<String,String> map;

    public Abbreviations() {
        this.map = new HashMap<>();
    }

    public void addAbbreviation(String abbr, String exp) {
        this.map.put(abbr, exp);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.map.containsKey(abbreviation);
    }


    public String findExplanationFor(String abbreviation) {
        return this.map.get(abbreviation);
    }

}
