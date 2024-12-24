import java.util.Hashtable;

class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Hashtable<Integer, Integer> hashTable = new Hashtable<>();
        for (int n : nums) {
            int count = hashTable.get(n) == null ? 0 : hashTable.get(n);
            if (count == 2)
                return false;
            hashTable.put(n, count + 1);
        }
        return true;
    }
}