public class Test {
  public static void main (String[] args){
    String tabAuthor[] = {"Marshall","Robin"};
    String tabKey[] = {"Modeling","Galaxy"};
    String allAuthor = "{{Bovy}, J. and {Rix}, H.-W. and {Green}, G.~M. and {Schlafly}, E.~F. and \n{Finkbeiner}, D.~P.}";
    BibEntry article = new BibEntry(tabAuthor,"Modeling The Galaxy",2006,"AA",tabKey,"www.ads.com");


    BibEntry art = new BibEntry();
    art.setAuthor(allAuthor);
    for (String i : art.getAuthor()){
      System.out.println(i);
    }
  }

}
