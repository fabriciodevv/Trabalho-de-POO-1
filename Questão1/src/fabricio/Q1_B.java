package fabricio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Q1_B {
    
    public static void main(String[]args) throws ParseException{
        Scanner ler = new Scanner(System.in);
       
        String data;

        System.out.println("Digite uma data no formato (MM/dd/yyyy)");
        data = ler.next();
        ler.close();
        
        Date convertdata = new SimpleDateFormat("MM/dd/yyyy").parse(data);

      String dataformatada = new SimpleDateFormat("MMMM dd, yyyy").format(convertdata);
      System.out.println("\n NOVO FORMATO:");
      System.out.println(dataformatada);
    }
}
