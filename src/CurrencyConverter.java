import java.math.BigDecimal;
import java.math.RoundingMode;

public class CurrencyConverter {

    protected static final int DECIMAL_DIGITS = 2;

    public static void main(String[] args) {
        System.out.println("Hello Currency Converter 002");
        System.out.println("Add line from dev");
    }

    public BigDecimal convert(BigDecimal originalAmount, BigDecimal conversionRate) {
        BigDecimal convertedAmount = originalAmount.multiply(conversionRate);
        return convertedAmount.setScale(DECIMAL_DIGITS, RoundingMode.HALF_UP);
    }


    public boolean isValidRate(BigDecimal conversionRate) {
        // TODO Auto-generated method stub
        // Tip: BigDecimal compareTo()
        int result1 = conversionRate.compareTo(BigDecimal.valueOf(0));

        if (result1 == 0) {
            return false;
        } 
        else if (result1 < 0) {
            return false;
        } 
        else {
            int result2 = conversionRate.compareTo(BigDecimal.valueOf(100000));
            if (result2 == 0) {
                return false;
            }
            if (result2 > 0) {
                return false;
            }
        }
        return true;
    }

}