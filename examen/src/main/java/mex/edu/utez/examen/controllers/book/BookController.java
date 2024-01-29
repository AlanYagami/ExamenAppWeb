package mex.edu.utez.examen.controllers.book;

import mex.edu.utez.examen.models.book.Book;
import mex.edu.utez.examen.services.book.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/book")
@CrossOrigin(origins = {"*"})
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    // get general
    @GetMapping("/")
    public List<Book> findAll(){
        return service.findAll();
    }

   // get mapping by id
    @GetMapping("/{id}")
    public List<Book> findBookById(Long id){
        return service.findBookById(id);
    }

    // get mapping by id
    @PostMapping("/")
    public Book save(@RequestBody Book book){
        return service.save(book);
    }

    // update mapping by id
    @PutMapping("/")
    public Book updateBookById(@RequestBody Book book){
        return service.updateBookById(book);
    }

    // delete mapping by id
    @DeleteMapping("/{id}")
    public void delete(Long id){
        service.deleteBookById(id);
    }

}
