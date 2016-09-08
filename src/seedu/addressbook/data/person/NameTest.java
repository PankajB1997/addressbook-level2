package seedu.addressbook.data.person;

import static org.junit.Assert.*;

import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;



public class NameTest {

	private Name name;
	
	public NameTest() throws IllegalValueException {
		name = new Name("Pankaj Bhootra");
	}
	@Test
	public void identicalNames() throws IllegalValueException {
		assertTrue(name.isSimilar(new Name("Pankaj Bhootra")));
	}
	@Test
	public void thisSubsetOfOther()throws IllegalValueException {
		assertTrue(name.isSimilar(new Name("Mr Pankaj Bhootra")));
	}
	@Test
	public void otherSubsetOfThis()throws IllegalValueException {
		assertTrue(name.isSimilar(new Name("Bhootra")));
	}
	@Test
	public void inUpperCase()throws IllegalValueException {
		assertTrue(name.isSimilar(new Name("PANKAJ BHOOTRA")));
	}
	@Test
	public void inLowerCase()throws IllegalValueException {
		assertTrue(name.isSimilar(new Name("pankaj bhootra")));
	}
	@Test
	public void inMixedCase()throws IllegalValueException {
		assertTrue(name.isSimilar(new Name("PaNkaJ bHoOtrA")));
	}
	@Test
	public void inDifferentOrder()throws IllegalValueException {
		assertTrue(name.isSimilar(new Name("Bhootra Pankaj")));
	}
	@Test
	public void differentOrderAndMixedCase()throws IllegalValueException {
		assertTrue(name.isSimilar(new Name("BhOOtrA pAnkAJ")));
	}
}
