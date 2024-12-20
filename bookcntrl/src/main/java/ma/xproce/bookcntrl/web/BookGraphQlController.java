package ma.xproce.bookcntrl.web;

import lombok.AllArgsConstructor;
import ma.xproce.bookcntrl.dto.BookDTO;
import ma.xproce.bookcntrl.service.BookService;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
@AllArgsConstructor
public class BookGraphQlController {

    private BookService bookService ;

    @MutationMapping
    public BookDTO saveBook(@Argument BookDTO book){
        return bookService.saveBook(book);
    }

    @QueryMapping
    public List<BookDTO> getBookByTitre(@Argument String titre){
        return bookService.getBookByTitre(titre);
    }


}
