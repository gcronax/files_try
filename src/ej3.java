import java.io.*;

public class ej3 {

        public static void main(String[] args) {
            String nombreArchivo = "datos.csv";
            try {
                FileReader fileReader = new FileReader(nombreArchivo);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String linea;
                while ((linea = bufferedReader.readLine()) != null) {
                    String[] prueba = linea.split(",");
                    System.out.println(prueba[0]+"   "+prueba[1]+"   "+prueba[2]);
                }

                bufferedReader.close();



                System.out.println("Escritura de '" + nombreArchivo + "' OK");
            } catch (IOException e) {
                System.out.println("error: " + e.getMessage());
            }


        }
}
