import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

class CurrencyConverterTest {

	@Test
	void testConvert() {
        // Test Case 1:
		CurrencyConverter testConvert_test = new CurrencyConverter();
        BigDecimal test1_value1 = BigDecimal.valueOf(7.82);
        BigDecimal test1_value2 = BigDecimal.valueOf(16.44);
        BigDecimal test1_result = testConvert_test.convert(test1_value1, test1_value2);
        BigDecimal test1_val = test1_result.multiply(BigDecimal.valueOf(100)).divide(BigDecimal.valueOf(100));
        BigDecimal test1_end_result = BigDecimal.valueOf(128.56);
        assertEquals(test1_end_result, test1_val);
       
        
        // Test Case 2:
        BigDecimal test2_value1 = BigDecimal.valueOf(159.581544);
        BigDecimal test2_value2 = BigDecimal.valueOf(2.71);
        BigDecimal test2_result = testConvert_test.convert(test2_value1, test2_value2);
        BigDecimal test2_val = test2_result.multiply(BigDecimal.valueOf(100)).divide(BigDecimal.valueOf(100));
        BigDecimal test2_end_result = BigDecimal.valueOf(432.47);
        assertEquals(test2_end_result, test2_val);
       
       
       
       
    }
	@Test
	void testIsValid() {
		CurrencyConverter testIsValid_test = new CurrencyConverter();
		
		// Test Case 1:
		BigDecimal BD1 = BigDecimal.valueOf(30000);
		boolean b1 = testIsValid_test.isValidRate(BD1);
		assertEquals(true, b1);
		
		// Test Case 2:
		BigDecimal BD2 = BigDecimal.valueOf(99999);
		boolean b2 = testIsValid_test.isValidRate(BD2);
		assertEquals(true, b2);
		
		// Test Case 3:
		BigDecimal BD3 = BigDecimal.valueOf(-5);
		boolean b3 = testIsValid_test.isValidRate(BD3);
		assertEquals(false, b3);
		
		// Test Case 4:
		BigDecimal BD4 = BigDecimal.valueOf(0);
		boolean b4 = testIsValid_test.isValidRate(BD4);
		assertEquals(false, b4);
		
		// Test Case 5:
		BigDecimal BD5 = BigDecimal.valueOf(100000);
		boolean b5 = testIsValid_test.isValidRate(BD5);
		assertEquals(false, b5);
	}

}




