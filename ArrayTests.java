import static org.junit.Assert.*; // QUESTION: What does the keyword static in an import statement do?
import org.junit.*;

public class ArrayTests {
/**
 * The two tests we wrote for you in ArrayTests.java pass, but the two implementations of reverse methods in ArrayExamples.java have bugs! 
 * Write more tests in ArrayTests.java to demonstrate that the two methods, reverseInPlace and reversed, have bugs, and identify the bugs.
 */
	@Test // The annotation, @Test, is required for each test method when using Junit. (QUESTION: true/false?)
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
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));

    // My tests:
    int[] input2 = {1,2,3,4,5,6};
    assertArrayEquals(new int[]{6,5,4,3,2,1}, ArrayExamples.reversed(input2));
  }
}

// @Test
// public void throw Exceptions testArraySyntax() {
//   int[] input3 = new int[];
// }