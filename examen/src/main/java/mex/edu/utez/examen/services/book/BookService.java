package mex.edu.utez.examen.services.book;

import mex.edu.utez.examen.models.book.Book;
import mex.edu.utez.examen.models.book.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mex.edu.utez.examen.Funtions;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BookService {
    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public List<Book> findBookById(Long id){
        return repository.findBookById(id);
    }


    @Transactional(rollbackFor = {SQLException.class})
    public Book save(Book book){
        book.setFolio(Funtions.generateFolio(book.getTitle(), book.getAuthor(), book.getISBN(), book.getDate()));
        return repository.save(book);
    }

    @Transactional(rollbackFor = {SQLException.class})
    public void deleteBookById(Long id) {
        repository.deleteBookById(id);
    }

    @Transactional(rollbackFor = {SQLException.class})
    public Book updateBookById(Book book) {
        book.setFolio(Funtions.generateFolio(book.getTitle(), book.getAuthor(), book.getISBN(), book.getDate()));
        return repository.save(book);
    }

    // Obtener todos los libros
    public List<Book> findAll(){
        return repository.findAll();
    }

}
