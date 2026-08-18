class Solution {
    public boolean isPalindrome(String s) {
                ArrayList<Character> reversedList = new ArrayList<>();
        for(int i = s.length() - 1; i >= 0; i--) {
            reversedList.add(s.charAt(i));
        }

        StringBuilder reversedSb = new StringBuilder(reversedList.size());
        for(Character chr: reversedList){
            reversedSb.append(chr);
        }

        String reversedString = reversedSb.toString().toLowerCase().replaceAll("[^a-z0-9]", "");
        
        return reversedString.equals(s.toLowerCase().replaceAll("[^a-z0-9]", ""));

    }
}
