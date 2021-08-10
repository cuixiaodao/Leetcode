// https://leetcode-cn.com/problems/group-anagrams/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> srcMap = new HashMap<>();
        List<String> combs = null;
        for (String s : strs) {
            String src = getSrc(s);
            combs = srcMap.get(src);
            if (null == combs) {
                combs = new LinkedList<>();
                srcMap.put(src, combs);
            }
            combs.add(s);
        }

        List<List<String>> res = new LinkedList<>();
        for (List<String> strList : srcMap.values()) {
            res.add(strList);
        }
        return res;
    }

    private String getSrc(String s) {
        char[] arr = s.toCharArray();
        // System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        return new String(arr);
    }
}
