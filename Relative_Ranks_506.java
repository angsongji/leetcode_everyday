import java.util.Hashtable;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] increScore = quickSort(score);
        Hashtable<Integer, Integer> hashTable = new Hashtable<>();
        for (int i = 0; i < increScore.length; i++) {
            hashTable.put(increScore[i], i + 1);
        }

        String[] ans = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            int rank = hashTable.get(score[i]);
            switch (rank) {
                case 1:
                    ans[i] = "Gold Medal";
                    break;
                case 2:
                    ans[i] = "Silver Medal";
                    break;
                case 3:
                    ans[i] = "Bronze Medal";
                    break;
                default:
                    ans[i] = rank + "";
                    break;
            }

        }
        return ans;
    }

    public int[] quickSort(int[] score) {
        int[] array = Arrays.copyOf(score, score.length);
        quickSortHelper(array, 0, array.length - 1);
        return array;
    }

    private void quickSortHelper(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);

            quickSortHelper(array, low, pi - 1);
            quickSortHelper(array, pi + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] > pivot) {
                i++;
                // Hoán đổi
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Hoán đổi pivot vào đúng vị trí
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}