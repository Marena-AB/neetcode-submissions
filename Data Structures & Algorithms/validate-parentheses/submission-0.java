class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> charMap = new HashMap<>();
        charMap.put('[', ']');
        charMap.put('(', ')');
        charMap.put('{', '}');

        Deque<Character> myDeque = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (charMap.containsKey(c)) {
                myDeque.push(c);
            }
            else {
                if(myDeque.isEmpty()) return false;
                else {
                    char lastOpened = myDeque.pop();
                    if (charMap.get(lastOpened) != c) return false;
                }
            }
        }
        return myDeque.isEmpty();
    }
}
