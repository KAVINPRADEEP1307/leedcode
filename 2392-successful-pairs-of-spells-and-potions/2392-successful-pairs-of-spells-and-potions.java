class Solution {
    public int binSearch(int[] potions, long el) {
        int start = 0;
        int end = potions.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (potions[mid] >= el) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start; 
    }

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length;
        int m = potions.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            long spell = spells[i];
            long el = (success + spell - 1) / spell; 
            int ind = binSearch(potions, el);
            ans[i] = m - ind;
        }

        return ans;
    }
}