public class LibraryMain {
    public static void main(String[] args) {
        Author author1=new Author("JRR", "Tolkien", 1892);
        Author author2=new Author("Frank", "Herbert", 1920);
        Book book1=new Book("Le Seigneur des Anneaux ", author1, 1954,1600);
       // System.out.println(book1.toString());
        Book book2=new Book("Bilbo le Hobbit ", author1, 1937,408);
        Book book3=new Book("Dune", author2, 1965);
        Library library=new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        for (int i=0;i<library.getNbBooks();i++){
            Book ithBook=library.getBook(i);
            if (ithBook.getNbPages()!=0){
                System.out.println(ithBook.toString());

            }
        }

    }
    
}