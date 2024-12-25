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
        if (!numbers.isEmpty())
            original = find(numbers, original);
        return original;
    }

    private int find(ArrayList<Integer> numbers, int original) {
        if (!numbers.contains(original))
            return original;
        return find(numbers, original * 2);
    }
}
