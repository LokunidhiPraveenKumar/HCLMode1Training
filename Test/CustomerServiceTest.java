import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.hcl.model.Customer;
import com.hcl.service.CustomerService;
import com.hcl.service.CustomerServiceImpl;

public class CustomerServiceTest {
	CustomerService service=new CustomerServiceImpl();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/*@Before
	public void setUp() throws Exception {
		service = new CustomerServiceImpl();
	}*/

	@After
	public void tearDown() throws Exception {
		service = null;
	}

	@Test
	public void testAddCustomer() {
		Customer customer = new Customer(1, "suresh", "chennai");
		boolean b = service.addCustomer(customer);
		assertTrue(b);
	}

	@Test
	public void testDeleteCustomer() {
		int id = 1;
		boolean b = service.deleteCustomer(id);
		assertTrue(b);
	}

	@Test
	public void testGetCustomers() {
		List<Customer> customers = service.getCustomers();
		assertNotNull(customers);

	}

}
