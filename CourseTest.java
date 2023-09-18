import static org.junit.Assert.*;

import org.junit.Test;

public class CourseTest {

	@Test
	public void testGetNumAssignments() {
		int numAssignments = 3;
		Course course = new Course(numAssignments);
		
		int assignments = course.getNumAssignments();
		
		if(assignments != numAssignments)
			fail("Had " + numAssignments + ", got " + assignments + " back.");
	}

}
