package ma.xproce.bookcntrl.mapper;
import ma.xproce.bookcntrl.dao.entities.Book;
import ma.xproce.bookcntrl.dto.BookDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class Bookmapper {

    private final ModelMapper mapper = new ModelMapper();
    public Book fromBookDTOToBook(BookDTO bookDTO){
        return mapper.map(bookDTO, Book.class);
    }

    public BookDTO fromBookToBookDTO(Book book){
        return mapper.map(book, BookDTO.class);
    }
}
