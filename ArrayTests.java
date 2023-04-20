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
}
