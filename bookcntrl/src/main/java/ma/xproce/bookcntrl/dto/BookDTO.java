package ma.xproce.bookcntrl.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class BookDTO {
    private String titre;
    private String publisher;
    private LocalDate datePublication;
    private double price;
    private String resume;
}
