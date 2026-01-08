package Tema_4.Persona;
public class MainPersona {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Ana";
        persona.edad = Integer.parseInt("35");
        persona.saludar();
        persona.presentarme();
        persona.saludarA("Ximo");
        persona.ShowdInfo();
    }
}