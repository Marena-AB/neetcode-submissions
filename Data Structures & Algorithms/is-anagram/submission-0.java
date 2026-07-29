class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();

        Arrays.sort(charS);
        Arrays.sort(charT);
        
        String sortedS = new String(charS);
        String sortedT = new String(charT);

        return (sortedT.equals(sortedS));

    }
}
