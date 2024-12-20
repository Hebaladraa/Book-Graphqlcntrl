package ma.xproce.bookcntrl.dao.repositories;

import ma.xproce.bookcntrl.dao.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    public List<Book> findByTitre(String titre);


}
