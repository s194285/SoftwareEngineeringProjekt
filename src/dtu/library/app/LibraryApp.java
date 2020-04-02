package dtu.library.app;

import java.util.ArrayList;
import java.util.List;

public class LibraryApp {
	public List<Book> books = new ArrayList<>();

	public boolean adminLoggedIn = false;

	public void addBook(Book Book) throws OperationNotAllowedException {
		if(adminLoggedIn == true){
			books.add(Book);
		}


	}

	public boolean containsBookWithSignature(String signature) {
		if(books.contains(signature)) {
			return true;
		}
		return false;
	}

	public boolean adminLoggedIn() {

		return adminLoggedIn;
	}

	public boolean adminLogin(String password) {
		//adminLoggedIn = "adminadmin".equals(password);

		if (password.equals("adminadmin")) {
			adminLoggedIn = true;

		} else adminLoggedIn = false;
		return adminLoggedIn;
	}

	public void adminLogout() {
		adminLoggedIn = false;
	}


	/*public List<Book> search(String searchText) {
	}*/
}
