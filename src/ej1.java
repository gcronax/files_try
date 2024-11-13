import java.io.File;
import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fdir="/";

        int n;
        File[] raices;
        do{
            raices = new File(fdir).listFiles();
            System.out.println("Lista de ficheros y directorios del directorio: "+fdir);
            System.out.println("_________________________________________________");
            int count=1;
            System.out.println("0.-  Directorio padre");
            for (File raiz : raices) {
                System.out.print(count++ +".- "+ raiz.getName());
                if (raiz.isDirectory()){
                    System.out.println(" <Directorio>");
                } else if (raiz.isFile()) {
                    System.out.println(" "+raiz.length() +" bytes");
                }
            }
            System.out.print("Introduce una opcion (-1 para salir): ");
            n= scan.nextInt();
            if (fdir=="/"){
                fdir="";
            }
            if (n==0){
                File aux= new File(raices[n].getParent());
                fdir=String.valueOf(aux.getParent());
                System.out.println(fdir);
            } else {
                fdir= String.valueOf(raices[n-1]);
                if (raices[n-1].isFile()){
                    n=-1;
                    System.out.println("no es un directorio");
                }
            }



        }while (n!=-1);
    }
}
