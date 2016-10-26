public class Test {
  public static void main (String[] args){
    String tabAuthor[] = {"Marshall","Robin"};
    String tabKey[] = {"Modeling","Galaxy"};
    String allAuthor = "{{Bovy}, J. and {Rix}, H.-W. and {Green}, G.~M. and {Schlafly}, E.~F. and \n{Finkbeiner}, D.~P.}";
    String allKey = "{dust, extinction, Galaxy: kinematics and dynamics, Galaxy:\nstructure, methods: data analysis, stars: statistics, surveys}";
    BibEntry article = new BibEntry("article",tabAuthor,"Modeling The Galaxy",2006,"AA",tabKey,"www.ads.com");
    BibEntry art = new BibEntry();

    art.setAuthor(allAuthor);
    art.setKeyword(allKey);
    System.out.println(art.getAuthorString());
    System.out.println(art.getKeywordString());
  }

}
