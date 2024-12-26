class Solution {
    public int[] sumZero(int n) {
        int mid = n/2;
        int[] arr = new int[n];
        for(int i=0; i<arr.length ;i++ ){
            if(i==mid && n%2==0) mid--;
            arr[i] = i - mid;
        }
        return arr;
    }
}