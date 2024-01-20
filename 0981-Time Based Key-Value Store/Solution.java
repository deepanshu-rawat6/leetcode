// Approach: Binary Search

/*
 * STEP 1: We will store the elements in a HashMap with key as key element and values will be in a List<Pair<Value, Timestamp>> as a list of pairs of the form (value, timestamp).
 * STEP 2: Now declaring the HashMap as HashMap<String, List<Pair<String, Integer>>> map.
 * STEP 3: Now, we will create the object for map as map = new HashMap<>(); in the constructor.
 * STEP 4: Inserting value in the map: If the key is not present in the map, we will add the key in the map as map.put(key, new ArrayList<>()); and then add the value in the list as map.get(key).add(new Pair<>(value, timestamp));.
 * STEP 5: Searching the value in the map: If the key is not present in the map, we will return "".
 */



class Pair <K,V> {
    private K timestamp;
    private V value;

    public Pair(K value,V timestamp) {
        this.timestamp= timestamp;
        this.value = value;
    }

    public K getKey() {
        return value;
    }

    public V getValue() {
        return timestamp;
    }
}

class TimeMap {

    HashMap<String, List<Pair<String, Integer>>> map;
    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) map.put(key, new ArrayList<>());
        map.get(key).add(new Pair<>(value, timestamp));
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";
        List<Pair<String, Integer>> list = map.get(key);
        return search(list, timestamp);
    }

    public String search(List<Pair<String, Integer>> list, int timestamp) {
        int low = 0;
        int high = list.size() - 1;
        while (low < high) {
            int mid = low + (high - low + 1) / 2;
            if (list.get(mid).getValue() <= timestamp) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }
        return list.get(low).getValue() <= timestamp ? list.get(low).getKey() : "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */