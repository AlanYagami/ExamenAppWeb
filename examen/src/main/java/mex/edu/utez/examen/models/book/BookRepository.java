package mex.edu.utez.examen.models.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    //obtener todos los libros
    List<Book> findAll();

    // delete por id
    void deleteBookById(Long id);
    // findBookById
    List<Book> findBookById(Long id);




}


