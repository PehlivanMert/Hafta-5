import java.util.Comparator;
public class CompareBookNameSort implements Comparator<Books>{

    // Kitap ismine göre sıralayan metot
    @Override
    public int compare(Books o1, Books o2) {
        return o1.getBookName().compareTo(o2.getBookName());
    }
}
