@SessionScoped @ManagedBean( name="bookCtrl")
public class BookController {
  @PersistenceContext( unitName="MinimalApp")
  private EntityManager em;
  @Resource() UserTransaction ut;

  public List<Book> getBooks() {...}
  public void refreshObject( Book book) {...}
  public String add( String isbn, String title,
      int year) {...}
  public String update( String isbn,
      String title, int year) {...}
  public String destroy( String isbn) {...}
}
