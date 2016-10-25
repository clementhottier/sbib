public class BibEntry {
  // class containning all interesting field of a bibtex entry 
  private String auhtor[];
  private String firstAuthor;
  private String title;
  private int    year;
  private String editor;
  private String keyword[];
  private String adsurl;


  // constructor
  public BibEntry() {
  }

  public BibEntry(String auhtor[], String title, int year, String editor, String[] keyword, String adsurl) {
    this.auhtor = auhtor;
    this.title = title;
    this.year = year;
    this.editor = editor;
    this.keyword = keyword;
    this.adsurl = adsurl;
  }

  //setter
  public void setAuhtor(String[] auhtor) {
    this.auhtor = auhtor;
  }

  public void setFirstAuthor(String firstAuthor) {
    this.firstAuthor = firstAuthor;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void setEditor(String editor) {
    this.editor = editor;
  }

  public void setKeyword(String[] keyword) {
    //TODO : make another setter wich take only one string and cut it 
    this.keyword = keyword;
  }

  public void setAdsurl(String adsurl) {
    this.adsurl = adsurl;
  }

  //getter
  public String[] getAuhtor() {
    return auhtor;
  }

  public String getTitle() {
    return title;
  }

  public int getYear() {
    return year;
  }

  public String getEditor() {
    return editor;
  }

  public String[] getKeyword() {
    return keyword;
  }

  public String getAdsurl() {
    return adsurl;
  }

  public String getFirstAuthor() {
    return firstAuthor;
  }

}
