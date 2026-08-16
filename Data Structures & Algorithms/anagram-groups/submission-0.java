class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> sortedGroups = new HashMap<>();
        List<List<String>> finalLst = new ArrayList<>();
        
        for(int i = 0; i < strs.length; i++) {

            char[] word = strs[i].toCharArray();
            Arrays.sort(word);
            String sortedWord = new String(word);
            
            if(sortedGroups.containsKey(sortedWord)) {
                sortedGroups.get(sortedWord).add(strs[i]);
            }
            else{
                sortedGroups.put(sortedWord, new ArrayList<>());
                sortedGroups.get(sortedWord).add(strs[i]);

            }

        }

        
        for(List<String> value : sortedGroups.values()) {
            finalLst.add(value);
        }
        return finalLst;
        
    }
}
