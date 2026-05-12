class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int index = numbers.length - 1;
        // for (int i = 0; i < numbers.length - 1; i++) {
        //     if (numbers[i + 1] >= target) {
        //         index = i;
        //         break;
        //     }
        // }
        int i = 0;
        while (i < index) {
            if (numbers[i] + numbers[index] > target)
                index--;
            else if (numbers[i] + numbers[index] < target)
                i++;
            else {
                int ans[] = {i + 1, index + 1};
                return ans;
            }
        }
        return new int[0];
    }
}
