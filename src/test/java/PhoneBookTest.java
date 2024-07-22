import org.example.PhoneBook;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        int count = phoneBook.add("Boba", "123456");
        assert count == 1;
    }
}
