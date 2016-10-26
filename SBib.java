import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class SBib {
  public static void main (String[] args){
    String bibPath = "biblio_these.bib";
    System.out.println("\tSBib launch :");

    readFile(bibPath);

  }

  public static ArrayList readFile(String bibPath){
  // method to read bibFile and put all the Entry in a list containing BibEntry instanc
  ArrayList bibList = new ArrayList();
    try {
      BufferedReader bibReader = new BufferedReader(new FileReader(new File(bibPath)));
    }
    catch (FileNotFoundException e){
      System.out.println("file "+bibFile.toString()+" not found");
    }
    finally{
      if (bibReader!=null){
        bibReader.close();
      }
    }
  return bibList;
  }
}
