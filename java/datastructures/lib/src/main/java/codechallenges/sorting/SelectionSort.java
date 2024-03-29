package codechallenges.sorting;


public class SelectionSort {
  public void setSelectionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int j = i - 1;
      int temp = arr[i];

      while (j >= 0 && temp < arr[j]) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = temp;
    }
  }
}
