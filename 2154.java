import java.util.ArrayList;

class Solution {
    public int findFinalValue(int[] nums, int original) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int n : nums) {
            if (n == original)
                original *= 2;
            else if (original == 1 && n % 2 == 0 || n % original == 0)
                numbers.add(n);
        }
        if (!numbers.isEmpty()) {
            while (true) {
                if (!numbers.contains(original))
                    break;
                original *= 2;
            }
            numbers.clear();
        }
        return original;
    }
}