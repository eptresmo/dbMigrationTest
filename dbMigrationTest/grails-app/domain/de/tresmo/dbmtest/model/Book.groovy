package de.tresmo.dbmtest.model

class Book {
	
	String title
	
	static belongsTo = Author

    static constraints = {
    }
}
