package sbib;
/**
 * Class which contain a bibEntry<ul>
 * <li> Author as string list</li>
 * <li> adsurl as String</li>
 * <li> year </li>
 * <li>editor </li>
 * <li> title </li>
 * <li> keywords</li>
 * <li> first author</li>
 * </ul>
 */
public class BibEntry {
  // class containning all interesting field of a bibtex entry 
  private String type;
  private String author[];
  private String firstAuthor;
  private String title;
  private int    year;
  private String editor;
  private String keyword[];
  private String adsurl;


  /**
   * Simple constructor
   */
  public BibEntry() {
  }

  /**
   * Construtor from many documented field
   * @param type the type of entry
   * @param title the title of entry
   * @param author list of author 
   * @param year the years of the article
   * @param editor the editor
   * @param keyword list of keywords
   * @param adsurl the ads url
   */
  public BibEntry(String type, String author[], String title, int year, String editor, String[] keyword, String adsurl) {
    this.type    = type;
    this.author  = author;
    this.title   = title;
    this.year    = year;
    this.editor  = editor;
    this.keyword = keyword;
    this.adsurl  = adsurl;
    this.setFirstAuthor();
  }




  /**
   * Create a String array from the true line in .bib file 
   * @param allAuthor a long string describing author like in bibEntry
   * @return the string array which correspond 
   */
  private String[] splitAuthor (String allAuthor){
    String tmpstr;

    tmpstr = allAuthor.replaceAll("\n","");
    tmpstr = tmpstr.replace("{","");
    tmpstr = tmpstr.replace("}","");
    tmpstr = tmpstr.replace(" ","");
    tmpstr = tmpstr.replace("~","");
    tmpstr = tmpstr.replace(".-","-");

    return  tmpstr.split("and");
  }

  /**
   * set the first author field
   */
  private void setFirstAuthor() {
    this.firstAuthor = author[0];
  }

  /**
   * Create a String array from the true line in .bib file 
   * @param allKeyword a long string describing keywords like in bibEntry
   * @return the string array which correspond 
   */
  private String[] setKeyword(String allKeyword){
    String tmpstr;

    tmpstr = allKeyword.replaceAll("\n","");
    tmpstr = tmpstr.replace("{","");
    tmpstr = tmpstr.replace("}","");

    return  tmpstr.split(", ");
  }

  /**
   * getter of type
   * @return type 
   */
  public String getType() {
    return type;
  }

  /**
   * getter of authors
   * @return authors
   */
  public String[] getAuthor() {
    return author;
  }

  /**
   * getter of all authors as one string
   * @return one long string of all author
   */
  public String getAuthorString(){
    String str="";
    int i=0;

    for (String bla : this.author){
      if (i<this.author.length-1){
        str += bla +" ";
      }
      else{
        str +="and " + bla;
      }
      i++;
    }

    return str;
  }

  /**
   * getter of the title
   * @return the title
   */
  public String getTitle() {
    return title;
  }

  /**
   * getter of the year
   * @return the year
   */
  public int getYear() {
    return year;
  }

  /**
   * getter of the editor
   * @return the editor
   */
  public String getEditor() {
    return editor;
  }

  
  /**
   * getter of keywords
   * @return keywords
   */
  public String[] getKeyword() {
    return keyword;
  }

  /**
   * getter of all keywords as one string
   * @return one long string of all keywords
   */
  public String getKeywordString(){
    String str="";
    int i=0;

    for (String bla : this.keyword){
      if (i < this.keyword.length-1){
      str += bla +", ";
      }
      else{
        str += bla;
      }
      i++;
    }

    return str;
  }

  /**
   * getter of the adsurl
   * @return the adsurl
   */
  public String getAdsurl() {
    return adsurl;
  }

  /**
   * getter of the first author
   * @return the first author
   */
  public String getFirstAuthor() {
    return firstAuthor;
  }

  /**
   * To string method
   * @return a string abstract of the entry
   */
  @Override
  public String toString(){
    String str;

    switch (this.type.toLowerCase()){
      case "article":
        str = "Article:\n";
        break;
      case "book":
        str = "Book:\n";
        break;
      default:
        str = "";
        break;
    }

    str += this.title +"\n";

    if (this.author.length>3){
      str+=this.firstAuthor+" et. al.\n";
    }
    else {
      str+=this.getAuthorString()+"\n";
    }

    str+= this.year+"\n";
    str+= this.editor+"\n";
    str+= "Keywords: "+this.getKeywordString()+"\n";
    str+= this.adsurl+"\n";

    return str;
  }

  /**
   * search if the iAuthor is in author list
   * @param iAuthor the author loked for
   * @return true if iAuthor is in the list false overwise 
   */
  public boolean isWritedBy(String iAuthor){
    return this.getAuthorString().toLowerCase().contains(iAuthor.toLowerCase());
  }

  public boolean isWritedBy(String[] iAuthor){
    // this method accept a table of author
    boolean tmp=true;

    for (String bla : iAuthor){
      tmp = tmp && this.getAuthorString().toLowerCase().contains(bla.toLowerCase());
    }

    return tmp;
  }

  /**
   * search if title contains iTitle
   * @param iTitle looked for title
   * @return true if iTitle is in title false overwise
   */
  public boolean isTitled(String iTitle){
  // is the iTitle is in the title ?
    return this.title.toLowerCase().contains(iTitle.toLowerCase());
  }

  /**
   * check the year 
   * @param iYear the year to test 
   * @return true if it is the correct year
   */
  public boolean isYeared(int iYear){
    return (iYear == this.year);
  }

  /**
   * search if keywords contains iKeywords 
   * @param iKeyword looked for keyword
   * @return true if iKeyword is in keyword false overwise
   */
  public boolean isKeyworded(String iKeyword){
    //check if iKeyword take place in the BibEntry keywords
    return this.getKeywordString().toLowerCase().contains(iKeyword.toLowerCase());
  }

  /**
   * search if keywords contains iKeywords 
   * @param iKeywords looked for keyword
   * @return true if iKeyword is in keyword false overwise
   */
  public boolean isKeyworded(String[] iKeywords){
    boolean tmp = true;

    for (String bla : iKeywords){
      tmp = tmp && this.getKeywordString().toLowerCase().contains(bla.toLowerCase());
    }

    return tmp;
  }
}
