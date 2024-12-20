package ma.xproce.bookcntrl.service;

import ma.xproce.bookcntrl.dto.BookDTO;

import java.util.List;

public interface BookService {

    public List<BookDTO> getBookByTitre(String titre);
    public BookDTO saveBook(BookDTO bookDTO);


}
