class Solution {
    public int singleNumber(int[] nums) {
       Map<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<nums.length;i++)
       map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       Set<Map.Entry<Integer,Integer>> entry = map.entrySet();
       List<Map.Entry<Integer,Integer>> list = new ArrayList<>(entry);
       for(Map.Entry<Integer,Integer> i : list)
           if(i.getValue()==1)
           return i.getKey();
           return 0;
    }
}