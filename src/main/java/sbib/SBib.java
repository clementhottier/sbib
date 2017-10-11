import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
    BufferedReader bibReader = null;
    
    try {
      bibReader = new BufferedReader(new FileReader(new File(bibPath)));
    }

    catch (FileNotFoundException e){
      System.out.println("file "+bibPath+" not found");
    }
    
    finally{
      try {
        if (bibReader!=null){
          bibReader.close();
        }
      }
      catch(IOException e) {
        e.printStackTrace();
      }
    }

    return bibList;
  }
}
