class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        sb.append(strs.size()).append("|");
        for (String s : strs) sb.append(s.length() + "|" + s);
        return sb.toString();
    }

    public List<String> decode(String str) {
        int ptr = str.indexOf("|");
        int len = Integer.parseInt(str.substring(0, ptr));
        ptr++;
        
        ArrayList<String> strs = new ArrayList<>(len);

        for (int i = 0; i < len; i++) {
            int next = str.indexOf("|", ptr);
            int strLen = Integer.parseInt(str.substring(ptr, next));

            ptr = next + 1;
            
            strs.add(str.substring(ptr, ptr + strLen));
            ptr += strLen;
        }

        return strs;
    }
}