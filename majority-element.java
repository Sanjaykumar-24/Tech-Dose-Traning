class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        Arrays.stream(nums).map(i->i).forEach(i->map.put(i,map.getOrDefault(i,0)+1));
        int len = nums.length/2;
        List<Map.Entry<Integer,Integer>> entry = new ArrayList<>(map.entrySet());
        for(int i=0;i<entry.size();i++)
        {
            if(map.get(entry.get(i).getKey())>len)
            return entry.get(i).getKey();
        }
        return 0;
    }
}