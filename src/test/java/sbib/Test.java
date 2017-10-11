public class Test {
  public static void main (String[] args){
    String tabAuthor[] = {"Marshall","Robin"};
    String tabKey[] = {"Modeling","Galaxy"};
    String tabAuthor2[]={"bovy","Rix"};
    String allAuthor = "{{Bovy}, J. and {Rix}, H.-W. and {Green}, G.~M. and {Schlafly}, E.~F. and \n{Finkbeiner}, D.~P.}";
    String allKey = "{dust, extinction, Galaxy: kinematics and dynamics, Galaxy:\nstructure, methods: data analysis, stars: statistics, surveys}";
    String toto="Une longue phrase qui dure";
    String tata="phrase";
    BibEntry article = new BibEntry("article",tabAuthor,"Modeling The Galaxy",2006,"AA",tabKey,"www.ads.com");
    BibEntry art = new BibEntry();

    art.setAuthor(allAuthor);
    art.setKeyword(allKey);
    article.setAuthor(allAuthor);
    System.out.println(article.toString());
    System.out.println("test");
    System.out.println(article.isWritedBy(tabAuthor2));
  }


}
