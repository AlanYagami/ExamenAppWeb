package mex.edu.utez.examen.models.book;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "book")
@NoArgsConstructor
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 40, nullable = false)
    private String title;

    @Column(length = 40, nullable = false)
    private String ISBN;

    @Column(length = 40, nullable = false)
    private String author;

    @Column(length = 100, nullable = false)
    private int pages;

    @Column(length = 40, nullable = false)
    private String category;

    @Column(columnDefinition = "TIMESTAMP DEFAULT NOW()", insertable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private String date;

    @Column(length = 40, nullable = false)
    private String folio;
}
