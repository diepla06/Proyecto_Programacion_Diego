package Tema_7.serializacion;

import java.io.*;

public class ContactoImput {//DESERIALIZACION  Es el "tubo" que conecta tu programa con el archivo físico en el disco
    private FileInputStream file;
    private ObjectInputStream input;

    //Abrir fichero // Aquí preparas el terreno. Si el archivo clientes.ser no existe en la
    // carpeta, el programa dará un error aquí mismo
    public void abrir() throws IOException {

        file = new FileInputStream("clientes.ser");
        input = new ObjectInputStream(file);
    }

    //Cerrar el fichero
    public void cerrar() throws IOException{
        if(input!=null)
            input.close();
    }

    public Contacto leer() throws IOException, ClassNotFoundException{
        Contacto contacto = null;
        if(input!=null){
            try{
                contacto = (Contacto) input.readObject();
                System.out.println("contacto leido correctamente");

            }catch (EOFException eof){
                //Fin del fichero
            }
        }
        return contacto;
    }
}
