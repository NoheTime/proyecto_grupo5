/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.banco;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Matias Segnini Lopez
 */

public class Config {
    public void createFile(){
        System.out.println("Creating config file!");
         try {
      File myObj = new File("configFile.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
    }
        System.out.println("Config file ready to set up!");
    }
    
    
    public void setUpConfig(){
        String bankName = JOptionPane.showInputDialog("Ingrese el nombre del banco");
        int boxes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de cajas para atencion de clientes no preferenciales"));
        int specialBoxes = 1;
        int fastBoxes = 1;
        
         try {
            try (FileWriter myWriter = new FileWriter("configFile.txt")) {
                myWriter.write("Nombre del banco: " + bankName + "\n");
                myWriter.write("Cajas estandar: "+ boxes + "\n");
                myWriter.write("Cajas preferenciales: "+ specialBoxes + "\n");
                myWriter.write("Cajas rapidas: "+ fastBoxes + "\n");
            }
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
    }
        
    }
    
}
