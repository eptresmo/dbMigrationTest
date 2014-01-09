package de.tresmo.dbmtest.controller

import de.tresmo.dbmtest.model.Author
import de.tresmo.dbmtest.model.Book

class TestController {

    def exec() {
		// flush all
    	Book.deleteAll(Book.all)
		Author.deleteAll(Author.all)

		// Process new
		def author = new Author(name: "AuthorName").save(flush: true)
		assert Author.count() == 1

		def book = new Book(title: "TitleBook").save(flush: true)
		assert Book.count() == 1
		
		author.addToBooks(book);
		
		log.debug "author.book.size: "+ author.books.size()
		
		render(status: 200, text: "Success")
	}
}
