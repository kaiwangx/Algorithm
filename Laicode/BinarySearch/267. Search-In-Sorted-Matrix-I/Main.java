public class Main {
    public int[] search(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
          return new int[]{-1, -1};
        }
        int left = 0;
        int height = matrix.length;
        int width = matrix[0].length;
        int right = height * width - 1;
    
        while (left <= right) {
          int mid = left + (right - left) / 2;
          int row = mid / width;
          int col = mid % width;
          int value = matrix[row][col];
          if (target == value) {
            return new int[]{row, col};
          } else if (target > value) {
            left = mid + 1;
          } else {
            right = mid - 1;
          }
        }
        return new int[]{-1, -1};
      }
}
