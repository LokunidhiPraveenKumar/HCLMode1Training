import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.hcl.service.CustomerService;
import com.hcl.service.CustomerServiceImpl;

public class Testcases {
	CustomerService service;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		service=new CustomerServiceImpl();
	}

	@After
	public void tearDown() throws Exception {
		service=null;
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	

}
