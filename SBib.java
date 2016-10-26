import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class SBib {
  public static void main (String[] args){
    String bibPath = "biblio_these.bib";
    File bibFile = null;
    System.out.println("\tSBib launch :");

    bibFile = new File(bibPath);
    readFile(bibFile);

  }

  public static ArrayList readFile(File bibFile){
  // method to read bibFile and put all the Entry in a list containing BibEntry instanc
  ArrayList bibList = new ArrayList();
    try {
      BufferedReader bibReader = new BufferedReader(new FileReader(bibFile));
    }
    catch (FileNotFoundException e){
      System.out.println("file "+bibFile.toString()+" not found");
    }
  return bibList;
  }
}
