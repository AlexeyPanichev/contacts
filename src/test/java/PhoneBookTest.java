import org.example.PhoneBook;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNull;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        int count = phoneBook.add("Boba", "123456");
        assert count == 1;
    }

    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Boba", "123456");
        String name = phoneBook.findByNumber("123456");
        assertEquals("Boba", name);
    }

    @Test
    public void testFindByNumberNotFound() {
        PhoneBook phoneBook = new PhoneBook();
        String name = phoneBook.findByNumber("123456");
        assertNull(name);
    }

    @Test
    public void testFindByName() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Boba", "123456");
        String number = phoneBook.findByName("John");
        assertEquals("123456", number);
    }

    @Test
    public void testFindByNameNotFound() {
        PhoneBook phoneBook = new PhoneBook();
        String number = phoneBook.findByName("Boba");
        assertNull(number);
    }
}
