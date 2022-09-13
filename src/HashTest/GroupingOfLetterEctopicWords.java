package HashTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupingOfLetterEctopicWords {
    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, ArrayList> rel = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            final String hashKey = getHashKey(strs[i]);
            if(!rel.containsKey(hashKey)){
                rel.put(hashKey,new ArrayList());
            }
            rel.get(hashKey).add(strs[i]);
        }
        return new ArrayList(rel.values());
    }
    public static String getHashKey(String strs){
        int tmp[] = new int[26];
        final char[] chars = strs.toCharArray();
        for (int i1 = 0; i1 < chars.length; i1++) {
            tmp[chars[i1]-'a']++;
        }
        String key = "";
        for (int i = 0; i < tmp.length; i++) {
            key += "#"+tmp[i];
        }
        return key;
    }

    public static void main(String[] args) {
        groupAnagrams(new String[]{"ate","tea","abe"});
    }
}
