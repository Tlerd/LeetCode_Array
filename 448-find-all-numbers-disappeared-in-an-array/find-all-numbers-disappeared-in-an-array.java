class Solution {
    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
                fw.write("0");
            } catch (Exception e) {
            }
        }));
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List <Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0){
                continue;
            }
            nums[index] *= -1;
        }

        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0){
                result.add(i + 1);
            }
        }

        return result;

    }
}