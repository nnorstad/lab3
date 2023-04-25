import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {

	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    int[] input2 = {3, 2, 1};
    ArrayExamples.reverseInPlace(input1);
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 3 }, input1);
    assertArrayEquals(new int[]{1, 2, 3}, input2);
    assertEquals(1, input2[0]);
  }


  @Test
  public void testReversed() {
    int[] input1 = { };
    int[] input2 = {3, 2, 1};
    int[] output = ArrayExamples.reversed(input2);
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[]{1, 2, 3}, ArrayExamples.reversed(input2));
    assertEquals(3, output[2]);
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {1, 1, 1};
    double[] input2 = {-1, -2, -3};
    double[] input3 = {-1, 0, 1};
    double[] input4 = { };
    double[] input5 = {1};
    assertEquals(0, ArrayExamples.averageWithoutLowest(input1), 0.0001);
    assertEquals(-1.5, ArrayExamples.averageWithoutLowest(input2), 0.0001);
    assertEquals(0.5, ArrayExamples.averageWithoutLowest(input3), 0.0001);
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input4), 0.0001);
    assertEquals(0, ArrayExamples.averageWithoutLowest(input5), 0.0001);
  }
}
