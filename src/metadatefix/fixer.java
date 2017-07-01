/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metadatefix;
import java.io.File;

/**
 *
 * @author louis
 */
public class fixer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static void main (String[] args) {
      File[] files = new File("").listFiles();

      for (File file : files) {
        if (file.isFile()) {
          System.out.println(file.getName());
          //names.add(files.getName());
        }
      }
    }
}
