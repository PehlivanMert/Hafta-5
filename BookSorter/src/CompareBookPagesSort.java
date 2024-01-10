import java.util.Comparator;

public class CompareBookPagesSort implements Comparator<Books> {

    // Sayfa Sayısına göre sıralayan metot
    @Override
    public int compare(Books o1, Books o2) {
        return o1.getTotalNumberOfPages() - o2.getTotalNumberOfPages();
    }
}
