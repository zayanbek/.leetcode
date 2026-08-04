/*
 * @lc app=leetcode id=981 lang=java
 *
 * [981] Time Based Key-Value Store
 */

// @lc code=start
class TimeMap {

    HashMap<String, TreeMap<Integer, String>> map;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        TreeMap<Integer, String> valueMap = map.get(key);

        if (valueMap == null) valueMap = new TreeMap<>();

        valueMap.put(timestamp, value);
        map.put(key, valueMap);
    }
    
    public String get(String key, int timestamp) {
        
        TreeMap<Integer, String> valueMap = map.get(key);
        
        if (valueMap == null) return "";

        Integer time = valueMap.floorKey(timestamp);

        if (time == null) return "";

        return valueMap.get(time);

    }

}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
// @lc code=end

