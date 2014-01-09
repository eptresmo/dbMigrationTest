package de.tresmo.dbmtest.model

class Author {
	
	String name

	static hasMany = [books: Book]
	
    static constraints = {
    }
}
