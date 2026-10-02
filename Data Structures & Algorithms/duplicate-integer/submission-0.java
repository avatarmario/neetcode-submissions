class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        int sizeArray = nums.length;

        // filling up my set
        for(int i = 0; i < sizeArray; i++){
            set.add(nums[i]);
        }

        int sizeSet = set.size();

        if(sizeArray != sizeSet){
            return true;
        }
        
        return false;

    }
}