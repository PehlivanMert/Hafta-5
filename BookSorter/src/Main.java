import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // TreeSetleri oluşturuyoruz

        TreeSet<Books> books1 = new TreeSet<>(new CompareBookNameSort());
        books1.add(new Books("Hobbit", 336, "J. R. R. Tolkien.", "1937"));
        books1.add(new Books("Iki Şehrin Hikayesi", 464, "Charles Dickens", "1857"));
        books1.add(new Books("On Küçük Zenci", 224, "Agatha Christie", "1939"));
        books1.add(new Books("Hayvanlardan Tanrılara Sapiens", 412, "Yuval Noah Harari", "2015"));

        //Kitapları isme göre sıralıp ekrana yazdırıyoruz.

        System.out.println("Kitabın Adı\n-----------");
        for (Books book : books1) {
            System.out.println(book.getBookName() +"\n");
        }
        System.out.println("\n================\n");

         //TreeSeti Başka Bir TreeSete Kopyalıyoruz

        TreeSet<Books> books2 = new TreeSet<>(new CompareBookPagesSort());
        books2.addAll(books1);

        // //Kitapları sayfa sayısına göre sıralıp ekrana yazdırıyoruz.

        System.out.println("Kitabın Adı || Sayfa Sayısı\n--------------------------");
        for (Books book : books2) {
            System.out.println(book.getBookName() + "\nSayfa : " + book.getTotalNumberOfPages() +"\n-------------");
        }
    }
}