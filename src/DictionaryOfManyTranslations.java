import java.util.HashMap;
import java.util.ArrayList;


public class DictionaryOfManyTranslations {
    private HashMap<String,ArrayList<String>> map;

    public DictionaryOfManyTranslations() {
        this.map = new HashMap<>();
    }

    public void add(String word, String translation) {
        if (!(this.map.get(word) == null)) {
            this.map.get(word).add(translation);
        } else {
            this.map.put(word, new ArrayList<String>());
            this.map.get(word).add(translation);
        }
    }

    public ArrayList<String> translae(String word) {
        ArrayList<String> list = new ArrayList<>();

        if (!(this.map.keySet().contains(word))) {
            return list;
        } else {
            return this.map.get(word);
        }
    }

    public void remove(String word) {
        if (this.map.keySet().contains(word)) this.map.remove(word);
    }

}
