/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
import java.util.ArrayList;
import java.util.List;
@SuppressWarnings({"all","deprecation","unchecked"})
public class Author extends Person {
    private List books;
    @SuppressWarnings("all")
    public Author(String firstName, String lastName) {
        super(firstName, lastName);
        books = new ArrayList();
    }

    /**
     * @deprecated Use publishedBooks instead
     */
    @SuppressWarnings("all")
    @Deprecated
    public List<String> getBooks() {
        return books;
    }
    @SuppressWarnings("all")
    public List<String> publishedBooks() {
        return books;
    }
    @SuppressWarnings("all")
    public void addBook(String book) {
        books.add(book);
    }

//    @Override
@SuppressWarnings("all")
    public String sortName() {
        return String.format("%s, %s", lastName, firstName);
    }
}
