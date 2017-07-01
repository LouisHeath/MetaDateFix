/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metadatefix;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Louis Heath
 */
public class fixer {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
      File[] files = new File("files").listFiles();
      List<String> dates = new ArrayList();
      
      for (File file : files) {
        if (file.isFile()) {
          String name = file.getName();
          System.out.println(name +" found");
          String date = getDate(name);
          System.out.println(date + " interpreted");
          dates.add(date);
        }
      }
    }
    
    public static String getDate (String name) {
        String date = "";

        String year = name.substring(4, 8);
        String month = name.substring(8, 10);
        String day = name.substring(10, 12);
        
        date = year + "." + month + "." + day;
      
        return date;
    }
}
