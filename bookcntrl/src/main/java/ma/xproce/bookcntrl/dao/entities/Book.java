package ma.xproce.bookcntrl.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Book {
    @Id
    @GeneratedValue
    Long id_book;
    String titre;
    String publisher;
    LocalDate datePublication;
    double price;
    String resume;


}
