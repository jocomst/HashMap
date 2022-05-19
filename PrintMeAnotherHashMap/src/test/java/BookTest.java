import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @DisplayName("Get name of book")
    @Test
    void getName() {
        Book book = new Book("Gone with the wind", 1932, "A book about post-civil war south");
        assertEquals("Gone with the wind", book.getName());
    }

    @DisplayName("Check if name is changed")
    @Test
    void setName() {
        Book book = new Book("Twilight", 2008, "A book about vampires");
        book.setName("New moon");
        assertEquals("New moon", book.getName());
    }

    @DisplayName("Get publication year")
    @Test
    void getPublicationYear() {
        Book b = new Book("Do androids dream of electric sheep?", 1960, "A dystopian novel about androids and humans");
        assertEquals(1960, b.getPublicationYear());
    }
}