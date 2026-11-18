import startic org.junit.Assert.assertEquals;
import org.junit.Test;

public class ProductCalculationsTest {
    @Test 
    public void GetVat_WithValidData_ReturnsCorrectValue() {
        ProductCalculations calc = new ProductCalculations(3500.0);
        double expectedVat = 525.0;
        assertEquals(expectedVat, calc.GetVat(), 0.001);
    }
    
     @Test 
    public void GetVat_WithValidData_ReturnsCorrectValue() {
        ProductCalculations calc = new ProductCalculations(3500.0);
        double expectedTotal = 4200.0;
        assertEquals(expectedVat, calc.GetVat(), 0.001);
    }
}