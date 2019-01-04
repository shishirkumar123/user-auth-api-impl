package com.company.auth;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import com.company.auth.privilege.Privilege;


/**
 * Note : Few classes(hamcrest,mokito related) have been added in eclipse editor favorites 
 * from Windows>>Preferences>>Java>>Editor>>Content Assist>>Favorites. The effect is that editor 
 * shows proper error message for using methods like 'is()' for not imported.
 * 
 * @author DLL
 *
 */
public class TestsDemo {

	@Test
	public void testExample1() throws Exception {
		assertTrue(true);
	}

	@Test
	public void testExample2() throws Exception {
		assertFalse(false);
	}

	@Test
	public void testExample3() throws Exception {
		assertEquals(2, Arrays.asList("a","b").size());
	}

	@Test
	public void testExample4() throws Exception {
		assertArrayEquals(Arrays.asList("a","b").toArray(), Arrays.asList("a","b").toArray());
	}

	@Test
	public void testExample5() throws Exception {
		assertNotEquals(2, 3);
	}

	@Test
	public void testExample6() throws Exception {
		assertNotNull(new Object());
	}

	@Test
	public void testExample7() throws Exception {
		assertNull(null);
	}

	@Test
	public void testExample9() throws Exception {
		Privilege p1 = new Privilege("a", "a - desc");
		Privilege p2 = new Privilege("a", "a - desc");
		//p2 = p1;
		assertSame(p1, p2); // This fails. Explain why.
	}

	@Test
	public void testExample10() throws Exception {
		Privilege p1 = new Privilege("a", "a - desc");
		Privilege p2 = new Privilege("b", "b - desc");
		assertNotSame(p1, p2);
	}

	@Test
	public void testExample11() throws Exception {
		assertThat("123",is("123"));				//'is' method is from hamcrest (see import). Check other methods from Hamecrest as well.
	}

	/*About Hamcrest Matchers
	 * 
	Core
		any() Matches any object passed to it.
		is() A matcher that checks if the given objects are equal.
		describedAs() adds a description to the matcher
	Logical
		allOf() Takes an array of matchers and must all match the expected object.
		anyOf() Takes an array of matcher and must match at least one of the matchers must report that it matches the target object.
		not() Check if the object negates what was passed.
	Object
		equalTo() Equality check.
		instanceOf() Check if an object is an instance of a given/expected object.
		notNullValue() Check if the passed value is not null
		nullValue() Tests whether the given object is null or not null.
		sameInstance() Tests if the given object is the exact same instance as another.
	 * 
	 */

	@Test
	public void testExample12() throws Exception {
		assertThat("some reason", "123",is("123"));
	}
	
	/*
	 * Stub vs Mock
	 * Stub - only in very simple scenario. Need to hardcode values, inflexible, not dynamic.
	 * Mock - more appropriate 
	 */
}
