package edu.tamu.amos.spring.firstspringproject;

import edu.tamu.amos.spring.firstspringproject.level1.BinarySearchExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

// Load the Context
// ContextConfiguration
// Access wire @Autowired
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = FirstSpringApplication.class)
public class FirstSpringApplicationSpec {

	@Autowired
	BinarySearchExample binarySearchExample;

	// Test Behaviors of BinarySearchExample
	@Test
	public void contextLoads() {
	    assertEquals(10, binarySearchExample.binarySearch(new int[]{1,2,3}, 10));
	}

}
