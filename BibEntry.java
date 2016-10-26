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


  // constructor
  public BibEntry() {
  }

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

  //setter
  public void setType(String type) {
    this.type = type;
  }

  public void setAuthor(String[] author) {
    this.author = author;
    this.setFirstAuthor();
  }

  public void setAuthor(String allAuthor){
    //this setter just need the author list, as one String, comming from bib file to create the author tab
    String tmpstr;

    tmpstr = allAuthor.replaceAll("\n","");
    tmpstr = tmpstr.replace("{","");
    tmpstr = tmpstr.replace("}","");
    tmpstr = tmpstr.replace(" ","");
    tmpstr = tmpstr.replace("~","");
    tmpstr = tmpstr.replace(".-","-");
    this.author= tmpstr.split("and");
    this.setFirstAuthor();
  }

  public void setFirstAuthor() {
    this.firstAuthor = author[0];
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
    this.keyword = keyword;
  }

  public void setKeyword(String allKeyword){
    // this setter is in order to set keyword from long string comming from bib file
    String tmpstr;

    tmpstr = allKeyword.replaceAll("\n","");
    tmpstr = tmpstr.replace("{","");
    tmpstr = tmpstr.replace("}","");
    this.keyword= tmpstr.split(", ");

  }

  public void setAdsurl(String adsurl) {
    this.adsurl = adsurl;
  }

  //getter
  public String getType() {
    return type;
  }

  public String[] getAuthor() {
    return author;
  }

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

  public String getAdsurl() {
    return adsurl;
  }

  public String getFirstAuthor() {
    return firstAuthor;
  }

  // Other method

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
}
