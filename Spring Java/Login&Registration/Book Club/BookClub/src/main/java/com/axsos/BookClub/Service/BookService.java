package com.axsos.BookClub.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axsos.BookClub.Repository.BookRepository;
import com.axsos.BookClub.models.Book;

@Service
public class BookService {

	
	@Autowired
    private BookRepository bookRepo;
	
	  // returns all the books
    public List<Book> allBooks() {
        return bookRepo.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepo.save(b);
    }
	
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepo.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    public void updateBook(Book updatedBook, Long bookId) {

		Book book = this.findBook(bookId);
		book.setTitle(updatedBook.getTitle());
		book.setAutherName(updatedBook.getAutherName());
		book.setMyThought(updatedBook.getMyThought());
		bookRepo.save(book);
	}

	
}
