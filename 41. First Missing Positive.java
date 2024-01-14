class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int mex = 1;
        while (set.contains(mex)) {
            mex++;
        }
        return mex;
    }
}
