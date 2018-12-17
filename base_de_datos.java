package proyecto_juego;
import java.util.*;
public class base_de_datos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		import java.io.BufferedReader;
		import java.io.BufferedWriter;
		import java.io.File;
		import java.io.FileNotFoundException;
		import java.io.FileReader;
		import java.io.FileWriter;
		import java.io.IOException;
		
		public class ficheros {

    	public static void main(String[] args) {

		// ESCRIBIR DATOS EN TXT 
		BufferedWriter bw = null;
		FileWriter fw = null;
		File file = new File("BaseDatos.txt");

		String data = "ESCRIBIENDO EN EL ARCHIVO DE TEXTO";
		System.out.println("\n");
		System.out.println("*************************************************************");
		System.out.println("Creacion de Archivo y escritura de datos");
		System.out.println("*************************************************************");
		try {
		// CONSULTO SI EXISTE EL ARCHIVO TXT
		// Si el archivo no existe, se crea!
		if (!file.exists()) {
		System.out.println("Amigo el archivo txt no existe, ahora ha sido creado");
		file.createNewFile();
		}else {System.out.println("Amigo el archivo ya existe, y esta listo para usarse");}
		// FIN DE CONSULTA O CREACION DEL TXT


		// ESCRITURA DE DATOS EN EL ARCHIVO TXT
		System.out.println("\n");
		System.out.println("*************************************************************");
		System.out.println("Escritura de datos en archivo txt");
		System.out.println("*************************************************************");
		// getAbsoluteFile(), devuelve la ruta absoluta del archivo, true permite append
		fw = new FileWriter(file.getAbsoluteFile(), true);
		// Guardo documento en el buffer
		bw = new BufferedWriter(fw);
		// Escribo los datos en el archivo
		bw.write(data);
		bw.newLine();
		// limpio el buffer
		bw.flush();
		System.out.println("una linea a sido agregada al documento!");
		} catch (IOException e) {
		e.printStackTrace();
		// Independiente de si hay excepciones o no simpre se ejecuta el bloque finally
		} finally {

		try {
		//Cierra instancias de FileWriter y BufferedWriter
		if (bw != null)
		bw.close();
		if (fw != null)
		fw.close();
		} catch (IOException ex) {
		ex.printStackTrace();
		}

		}

		// LEER DATOS DE TXT
		System.out.println("\n");
		System.out.println("*************************************************************");
		System.out.println("Lectura del archivo");
		System.out.println("*************************************************************");
		FileReader fr=null;
		BufferedReader br=null;
		try {
		fr = new FileReader(file.getAbsoluteFile());
		br=new BufferedReader(fr);
		String lectura_linea=br.readLine();
		int conta=1;
		while(lectura_linea!=null){
		System.out.println("linea "+conta+"-"+lectura_linea);
		lectura_linea=br.readLine();
		conta++;
		}
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}


	}

}

	