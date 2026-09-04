public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Джейн", "Остин");
        Book book1 = new Book("Гордость и предубеждение", author1, 1813);
        System.out.println("Название книги: " + book1.getName());
        System.out.println("Автор: " + book1.getAuthor().getNameAuthor() + " " + book1.getAuthor().getSurenameAuthor());
        System.out.println("Год публикации: " + book1.getYear());
        System.out.println();

        Author author2 = new Author("Александр", "Пушкин");
        Book book2 = new Book("Евгений Онегин", author2, 1835);
        System.out.println("Название книги: " + book2.getName());
        System.out.println("Автор: " + book2.getAuthor().getNameAuthor() + " " + book2.getAuthor().getSurenameAuthor());
        System.out.println("Год публикации: " + book2.getYear());
        System.out.println();

        book2.setYear(1833);
        System.out.println("Название книги: " + book2.getName());
        System.out.println("Автор: " + book2.getAuthor().getNameAuthor() + " " + book2.getAuthor().getSurenameAuthor());
        System.out.println("Год публикации: " + book2.getYear());
    }
}