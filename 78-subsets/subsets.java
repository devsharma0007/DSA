class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list2  =  new ArrayList<>();
        subset(nums,list,list2,0);  
        return list;
    }
    public void subset(int[] nums,List<List<Integer>> list,List<Integer> list2,int idx){
        if(idx==nums.length){
            list.add(new ArrayList<>(list2));
            return;
        }
        list2.add(nums[idx]);
        subset(nums,list,list2,idx+1);
        list2.remove(list2.size()-1);
        subset(nums,list,list2,idx+1);
    }
}