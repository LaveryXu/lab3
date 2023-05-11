import static org.junit.Assert.*; // QUESTION: What does the keyword static in an import statement do?

import java.sql.Array;

import org.junit.*;

public class ArrayTests {
	@Test
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    // My tests:
    int[] input2 = {};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{}, input2);

    // int[][] input3 = {{1,2,3}, {4,5,6}, {7,8,9}};
    // for(int i = 0; i < input3.length; i++) {
    //   for(int j = 0; j < input3[i].length; j++) {
    //     assertArrayEquals();
    //   }
    // }

    int[] input4 = {1,2,3};
    ArrayExamples.reverseInPlace(input4);
    assertArrayEquals(new int[]{3,2,1}, input4);

    int[] input5 = {-1, 1};
    ArrayExamples.reverseInPlace(input5);
    assertArrayEquals(new int[]{1, -1}, input5);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));

    // My tests:
    int[] input2 = {1,2,3,4,5,6};
    assertArrayEquals(new int[]{6,5,4,3,2,1}, ArrayExamples.reversed(input2)); // failure #1
  
    int[] input3 = {-1, 1};
    assertArrayEquals(new int[] {1, -1}, ArrayExamples.reversed(input3));

    int[] input4 = {22, 21, 20, 19, 18, 17, 16, 15, 14, 13};
    assertArrayEquals(new int[] {13, 14, 15, 16, 17, 18, 19, 20, 21, 22}, ArrayExamples.reversed(input4));

  }
}

// public void testArraySyntax() throws Exception {
//   int[] input3 = new int[];
// }