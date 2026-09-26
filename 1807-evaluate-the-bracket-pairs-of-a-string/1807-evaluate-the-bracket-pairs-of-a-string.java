import java.util.HashMap;
class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < knowledge.size(); i++) {
            map.put(knowledge.get(i).get(0), knowledge.get(i).get(1));
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == '(') {
                StringBuilder tempSB = new StringBuilder();
                i = i + 1;
                while (s.charAt(i) != ')') {
                    tempSB.append(s.charAt(i));
                    i++;
                }
                String key = map.getOrDefault(tempSB.toString(), null);
                if (key == null) {
                    sb.append("?");
                }else {
                    sb.append(key);
                }
            }else {
                sb.append(temp);
            }
        }
        return sb.toString();
    }
}