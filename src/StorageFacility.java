import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> map;

    public StorageFacility() {
        this.map = new HashMap<>();
    }

    public void add(String unit, String item) {
        if (this.map.containsKey(unit)) {
            this.map.get(unit).add(item);
        } else {
            this.map.put(unit, new ArrayList<String>());
            this.map.get(unit).add(item);
        }
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.map.getOrDefault(storageUnit, new ArrayList<String>());
    }

    public void remove(String storageUnit, String item) {
        if (this.map.keySet().contains(storageUnit)) {
            this.map.get(storageUnit).remove(item);
            if (this.map.get(storageUnit).isEmpty()) {
                this.map.remove(storageUnit);
            }
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> list = new ArrayList<>();

        for (String s : this.map.keySet()) {
            list.add(s);
        }
        return list;
    }
}
