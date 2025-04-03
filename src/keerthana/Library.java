package keerthana;

public class Library extends Book {


    public String inPersonKeerthana(String name, String author) {
        this.name = name;
        this.author = author;
        return "name : " + name + "author : " + author;
    }

    public Book inPerson(String name, String author) {
        Book newBook = new Book(name, author);
        return newBook;
    }

    ;

    public Book inComputer(String name, String author) {
        Book newBook = new Book(name, author);
        return newBook;
    }

    public static void main(String[] args) {
        Library library = new Library();

        /*List<String> strings = new LinkedList<>();
        strings.add(library.inPersonKeerthana("asd1", "asdd"));
        strings.add(library.inPersonKeerthana("asd2", "asdd"));
        strings.add(library.inPersonKeerthana("asd3", "asdd"));
        strings.add(library.inPersonKeerthana("asd4", "asdd"));
        */
       /* List<Book> books = new LinkedList<>();

        books.add(library.inPerson("A", "A"));
        books.add(library.inComputer("B", "B"));

        Book myBook = books.get(0);
        myBook.getAuthor();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number !!!!!!!!!!");

        int n = scanner.nextInt();
        if (n == 1){
            books.add(library.inPerson("C" , "C"));
        }else  if (n == 0){
            books.removeLast();
        }

        System.out.println("book list = " +  books);*/

        Book myBook = new Book("Tale of Barath","Barath");
        System.out.println("myBook = " + myBook);

    }


}
