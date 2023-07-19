class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1)
        return nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                if(nums[i]!=nums[i+1])
                return nums[i];
            }
            else if(i==nums.length-1)
            {
                if(nums[nums.length-1]!=nums[nums.length-2])
                return nums[i];
            }
            else if(nums[i]-nums[i-1]==0||nums[i]-nums[i+1]==0)
            continue;
            else
            return
            nums[i];
        }
        return 0;
    }
}