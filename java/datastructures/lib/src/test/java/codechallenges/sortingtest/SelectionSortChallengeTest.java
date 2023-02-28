package codechallenges.sortingtest;

import codechallenges.sorting.SelectionSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SelectionSortChallengeTest {
  @Test
  void testAChallenge() {
    SelectionSort sut = new SelectionSort();
    sut.setSelectionSort(new int[]{2,5,8});
    System.out.println("test something here");
    assertTrue(true);
  }
}
