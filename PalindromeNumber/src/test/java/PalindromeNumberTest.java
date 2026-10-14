import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeNumberTest {
    @Test public void identifiesPalindrome() { assertTrue(new PalindromeNumber().isPalindrome(121)); }
    @Test public void identifiesNonPalindrome() { assertFalse(new PalindromeNumber().isPalindrome(123)); }
    @Test public void negativeNumberIsNotPalindrome() { assertFalse(new PalindromeNumber().isPalindrome(-121)); }
}
