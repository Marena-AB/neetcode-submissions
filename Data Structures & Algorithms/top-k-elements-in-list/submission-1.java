class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> sortedNums = new TreeMap<>();
            Map<Integer, List<Integer>> frequency = new TreeMap<>(Comparator.reverseOrder());

            int[] topK = new int[k];


            for(int i = 0; i < nums.length; i++) {

                if(sortedNums.containsKey(nums[i])) {
                    sortedNums.put(nums[i], sortedNums.get(nums[i]) + 1);
                }
                else{
                    sortedNums.put(nums[i], 1);
                }

            }

            for(Integer key : sortedNums.keySet()) {
                if(frequency.containsKey(sortedNums.get(key))) {
                    frequency.get(sortedNums.get(key)).add(key);
                }
                else {
                    frequency.put(sortedNums.get(key), new ArrayList<>(List.of(key)));
                }
            }

            int count = 0;
            for(Integer key: frequency.keySet()){
                for(int i = 0; i < frequency.get(key).size(); i++){
                    if (count < k) {
                        topK[count] = frequency.get(key).get(i);
                        count++;
                    }
                }
            }

            return topK;
    }
}
