class Solution {
    public boolean checkZeroOnes(String s) {
        int[] max = { 0, 0 };
        int[] count = { 0, 0 };
        for (char c : s.toCharArray()) {
            switch (c) {
                case '1':
                    if (max[0] < count[0])
                        max[0] = count[0];
                    count[0] = 0;
                    count[1]++;
                    break;
                case '0':
                    if (max[1] < count[1])
                        max[1] = count[1];
                    count[0]++;
                    count[1] = 0;
                    break;
            }
        }
        if (max[0] < count[0])
            max[0] = count[0];
        if (max[1] < count[1])
            max[1] = count[1];
        return max[1] > max[0];
    }
}