class Solution {
    public int[] shuffle(int[] nums, int n) {
        int answer[] = new int[2*n];

        for (int i = 0; i < n; i++){
            answer[i*2] = nums[i];
            answer[i*2+1] = nums[i+n];
        }

        return answer;
    }
}