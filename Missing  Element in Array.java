class Solution {
    int missingNum(int arr[]) {
        int n = arr.length; 
        long total = (long)(n + 1) * (n + 2) / 2; // sum of 1 to n+1
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return (int)(total - sum);
    }
}
