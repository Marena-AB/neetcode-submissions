class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numsHash = new HashSet<>();
            for (int num: nums) {
                numsHash.add(num);
            }

            return numsHash.size() < nums.length;
    }
}