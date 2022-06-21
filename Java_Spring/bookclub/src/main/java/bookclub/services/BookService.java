package bookclub.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bookclub.models.Book;
import bookclub.repositories.BookRepository;

@Service
public class BookService {
@Autowired
private BookRepository bookRepository;


public void Create(Book Book)
{
bookRepository.save(Book);
}
public void update(Book book)
{
	
	bookRepository.save(book);
}
public ArrayList<Book> findAll()
{
return bookRepository.findAll();
}
public Book findOne(Long id)
{

Optional<Book> book=bookRepository.findById(id);
return book.isPresent()?book.get():null;
}

public void deleteOne(Long id)
{
bookRepository.deleteById(id);
}
};
