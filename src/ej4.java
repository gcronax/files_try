import java.io.*;
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("dame el nombre del csv: ");
        String nombreArchivo= scan.next();
        String nombrehtml="tabla.html";
        int n=0;
        try {
            FileReader fileReader = new FileReader(nombreArchivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linea;

            FileWriter fileWriter = new FileWriter(nombrehtml, false);
            PrintWriter printWriter = new PrintWriter(fileWriter);



            printWriter.println("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <title>Title</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "\n" +
                    "<table border=\"1\">");

            while ((linea = bufferedReader.readLine()) != null) {
                String[] prueba = linea.split(",");
                if (n==0){

                    printWriter.println("    <tr>\n");
                    for (int i = 0; i < prueba.length; i++) {
                        printWriter.println("        <th>"+prueba[i]+"</th>\n");
                    }
                    printWriter.println("    </tr>");

                }else {
                    printWriter.println("    <tr>\n");
                    for (int i = 0; i < prueba.length; i++) {
                        printWriter.println("        <td>"+prueba[i]+"</td>\n");
                    }
                    printWriter.println("    </tr>");
                }



                n++;
            }

            printWriter.println("</table>\n" +
                    "</body>\n" +
                    "</html>");


            printWriter.close();



            bufferedReader.close();
            System.out.println("Escritura de '" + nombreArchivo + "' OK");
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }


    }
}
