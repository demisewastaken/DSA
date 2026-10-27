class Solution {
    public String[] createGrid(int m, int n) {
        StringBuilder sb = new StringBuilder(".");
        StringBuilder last = new StringBuilder();

        for (int i = 1; i < n; i++) {
            sb.append("#");
        }
        for (int i = 0; i < n; i++) {
            last.append(".");
        }

        String[] array = new String[m];

        for (int i = 0; i < m - 1; i++) {
            array[i] = sb.toString();
        }

        array[m - 1] = last.toString();

        return array;


    }
}