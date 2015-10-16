import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {

	Person p;

	@Before
	public void before() {
		p = new Person();
	}

	@Test
	public void testName() {
		p.setName("Jordan");
		assertEquals("Jordan", p.getName());
	}
}
