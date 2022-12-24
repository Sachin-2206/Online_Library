package com.comapany;
import java.util.Scanner;

class library {
    String[] books;
    int no_of_books;
Scanner sc = new Scanner(System.in);
    library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBooks() {
        this.books[no_of_books] = sc.nextLine();
        no_of_books++;
        System.out.println(this.books[no_of_books] + " is added!");
    }

    void showAvailableBooks() {
        for (String elements : this.books) {
            if (elements == null) {
                continue;
            }
            System.out.println("# " + elements);
        }
    }

    void issueBook() {
        for (int i = 0; i < this.books.length; i++) {
            String b = this.books[i];
            if (b == this.books[i]) {
                System.out.println("The Book is Issued");
                b = null;
                return;
            }
        }
        System.out.println("This Book Does'nt Exist");
    }

}
    public class Online_Library {
        public static void main(String[] args) {
            library central = new library();
            central.addBooks();
            central.showAvailableBooks();
            central.issueBook();
            central.showAvailableBooks();

        }
    }

