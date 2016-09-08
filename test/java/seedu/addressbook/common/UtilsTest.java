package seedu.addressbook.common;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.Before;

public class UtilsTest {

	public void testIsOneObjectNull() {
		assertTrue(Utils.isAnyNull(null, "Test", "Test2"));
	}

	public void testMoreThanOneObjectNull() {
		assertTrue(Utils.isAnyNull("test", null, null, "test", null));
	}

	public void testAllObjectsNull() {
		assertTrue(Utils.isAnyNull(null, null, null, null));
	}

	public void testNoObjectsNull() {
		assertFalse(Utils.isAnyNull("test", "test1", "lol"));
	}

	public void testDifferentObjectsButNoneNull() {
		assertFalse(Utils.isAnyNull("Test", 1, 1.30, 'c', "LOL"));
	}

	public void testNoElementUnique() {
		assertFalse(Utils.elementsAreUnique(Arrays.asList(new int[] { 2, 2, 3, 4, 3, 4, 5, 5 })));
	}

	public void testSomeElementsUnique() {
		assertFalse(Utils.elementsAreUnique(Arrays.asList(new int[] { 1, 2, 3, 3, 4, 5, 4 })));
	}

	public void testAllElementsUnique() {
		assertTrue(Utils.elementsAreUnique(Arrays.asList(new int[] { 1, 2, 3, 4, 5 })));
	}

	public void testSingleElementList() {
		assertTrue(Utils.elementsAreUnique(Arrays.asList(new int[] { 1 })));
	}

}
