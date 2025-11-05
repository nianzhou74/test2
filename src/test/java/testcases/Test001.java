package testcases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import Samples.*;

public class Test001 {
	 @Test
	 public void testA() {
			assertEquals(5, FloorSquareRoot.floorSqrt(16));
	 }

	 @Test
	 public void testB() {
			assertEquals(6, FloorSquareRoot.floorSqrt(21));
	 }
}

