package ma.xproce.bookcntrl;

import ma.xproce.bookcntrl.dto.BookDTO;
import ma.xproce.bookcntrl.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class BookcntrlApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookcntrlApplication.class, args);
    }

    @Bean
    CommandLineRunner start(BookService bookService) {
        return args -> {
            List<BookDTO> books = List.of(
                    BookDTO.builder()
                            .titre("Clean Code: A Handbook of Agile Software Craftsmanship")
                            .publisher("Robert C. Martin")
                            .datePublication(LocalDate.of(2008, 8, 11))
                            .price(35)
                            .resume("This book provides principles and best practices to write clean, efficient, and readable code.")
                            .build(),
                    BookDTO.builder()
                            .titre("The Pragmatic Programmer: Your Journey to Mastery")
                            .publisher("Andrew Hunt, David Thomas")
                            .datePublication(LocalDate.of(1999, 10, 30))
                            .price(45)
                            .resume("A classic book offering practical advice and insights for becoming a better software developer.")
                            .build(),
                    BookDTO.builder()
                            .titre("Design Patterns: Elements of Reusable Object-Oriented Software")
                            .publisher("Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides")
                            .datePublication(LocalDate.of(1994, 1, 1))
                            .price(50)
                            .resume("This book describes 23 classic software design patterns that help solve common problems in software design.")
                            .build(),
                    BookDTO.builder()
                            .titre("Refactoring: Improving the Design of Existing Code")
                            .publisher("Martin Fowler")
                            .datePublication(LocalDate.of(1999, 6, 1))
                            .price(40)
                            .resume("Refactoring is a book about improving code structure without changing its functionality. It provides practical techniques for refactoring legacy code.")
                            .build(),
                    BookDTO.builder()
                            .titre("Code Complete: A Practical Handbook of Software Construction")
                            .publisher("Steve McConnell")
                            .datePublication(LocalDate.of(2004, 6, 9))
                            .price(60)
                            .resume("This comprehensive book covers software construction and provides tips and techniques for writing high-quality code.")
                            .build()
            );

            books.forEach(bookService::saveBook);
        };
    }
}
