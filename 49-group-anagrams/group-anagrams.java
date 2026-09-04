class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        List<String> visited = new ArrayList<>();
        for(int i=0;i<strs.length-1;i++){
            if(visited.contains(strs[i]))
                continue;
            visited.add(strs[i]);
            List<String> list = new ArrayList<>();
            list.add(strs[i]);
            for(int j=i+1;j<strs.length;j++){
                if(isAnagram(strs[i],strs[j])){
                    list.add(strs[j]);
                    visited.add(strs[j]);
                }
            }
            // if(list.isEmpty())
            //     list.add(strs[i]);
            res.add(list);
        }
        if(!visited.contains(strs[strs.length-1]))
                res.add(new ArrayList<>(Arrays.asList(strs[strs.length-1])));
        return res;
    }
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        
        Arrays.sort(sc);
        Arrays.sort(tc);

        for(int i=0;i<sc.length;i++){
            if(sc[i] != tc[i])
                return false;
        }
        
        return true;
    }
}