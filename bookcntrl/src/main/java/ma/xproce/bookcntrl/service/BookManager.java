package ma.xproce.bookcntrl.service;

import lombok.AllArgsConstructor;
import ma.xproce.bookcntrl.dao.entities.Book;
import ma.xproce.bookcntrl.dao.repositories.BookRepository;
import ma.xproce.bookcntrl.dto.BookDTO;
import ma.xproce.bookcntrl.mapper.Bookmapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@AllArgsConstructor

public class BookManager implements BookService {

    private BookRepository bookRepository;
    private Bookmapper bookmapper;

    @Override
    public BookDTO saveBook(BookDTO bookDTO) {
        Book book = bookmapper.fromBookDTOToBook(bookDTO);
        book = bookRepository.save(book);
        bookDTO = bookmapper.fromBookToBookDTO(book);
        return bookDTO;
    }



        @Override
        public List<BookDTO> getBookByTitre(String titre) {
            List<Book> books = bookRepository.findByTitre(titre);
            List<BookDTO> bookDTOS = new ArrayList<>();
            for (Book book : books) {
                bookDTOS.add(bookmapper.fromBookToBookDTO(book));
            }
            return bookDTOS;
        }

}
