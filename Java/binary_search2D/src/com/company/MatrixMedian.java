// Code Studio link => https://www.codingninjas.com/studio/problems/median-of-a-row-wise-sorted-matrix_1115473?leftPanelTab=0

public final class MatrixMedian {
    public static int findMedian(int A[][], int row, int col) {
        int low = 1;
        int high = 1000000000;
        int n = row;
        int m = col;
        while (low <= high) {
        int mid = (low + high) >> 1;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            cnt += countSmallerThanMid(A[i], mid, col);
        }
        if (cnt <= (n * m) / 2)
            low = mid + 1;
        else
            high = mid - 1;
        }
        return low;
    }

    public static int countSmallerThanMid(int[] A, int mid, int n) {
    int l = 0, h = n - 1;
    while (l <= h) {
      int md = (l + h) >> 1;
      if (A[md] <= mid) {
        l = md + 1;
      } else {
        h = md - 1;
      }
    }
    return l;
  }
}
