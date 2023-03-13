package org.tnsif.client;

import org.tnsif.service.BookService;
import org.tnsif.service.BookServicelmpl;

public class Client {
	public static void main(String[] args) {
		BookService service=new BookServicelmpl();
		System.out.println("Total no.of books: "+service.getCount());
		System.out.println("Book Id: "+service.getBookByIds(3));
		System.out.println("Price 100 to 600: "+service.getPrice(100f, 600f));
		System.out.println("Book author: "+service.getBooksAuthor("techneo"));
		System.out.println("All books: "+service.getAll());
	}
}
