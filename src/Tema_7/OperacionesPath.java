package Tema_7;

import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OperacionesPath {

    public static void main(String[] args) throws IOException {

        // Para obtener un objeto Path utilizamos el método Path.of() o Paths.get()
        Path unPath = Path.of("/home/dieplamon/IdeaProjects/Proyecto_Diego");
        Path otroPath = Paths.get("/home/dieplamon/IdeaProjects/Proyecto_Diego");

        // Obtener el nombre de un fichero y unirlo a la ruta de otro directorio
        Path unFile = Path.of("/home/dieplamon/IdeaProjects/Proyecto_Diego/datosDiego.txt ");
        Path unDir = Path.of("/home/dieplamon/IdeaProjects/Proyecto_Diego ");
        // /home/user/file.txt
        System.out.println(unDir.resolve(unFile.getFileName() + "\n"));

        // Relativizar una ruta respecto a otra
        Path otroFile = Path.of("/home/dieplamon/IdeaProjects/Proyecto_Diego/datosDiego.txt ");
        Path otroDir = Path.of("/home/dieplamon/IdeaProjects/Proyecto_Diego ");
        // obtener c/d.txt
        System.out.println("no necesitas decir toda la dirección desde la raíz " + otroDir.relativize(otroFile));

        // La clase Files contiene métodos estáticos para realizar operaciones
        // sobre ficheros y directorios

        // Crear un directorio y sus ascendentes
        Files.createDirectories(Path.of("/home/dieplamon/IdeaProjects/NuevoDirectorio"));

        // Imprimir el contenido de un directorio
        Files.list(Path.of("/home/dieplamon/IdeaProjects/Proyecto_Diego")).forEach(System.out::println);

        // Obtener la lista de los contenidos anidados de un directorio
        List<Path> list = Files.walk(Paths.get("/home/dieplamon/IdeaProjects/Proyecto_Diego")).toList();

        // Imprimir los ficheros regulares de un directorio ordenados por tamaño
        Files.list(Path.of("/home/dieplamon/IdeaProjects/Proyecto_Diego"))
                .filter(Files::isRegularFile)
                .sorted(Comparator.comparingLong(path -> {
                    try {
                        return Files.size(path);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }))
                .forEach(System.out::println);

        //imprimir los ficheros regulares de un directorio ordenados por tamaño sin programación funcional
        Path directorio = Path.of("/home/dieplamon/IdeaProjects/Proyecto_Diego");
        // Lista para almacenar los archivos regulares
        List<Path> archivos = new ArrayList<>();

        // Recorrer el directorio y filtrar archivos regulares
        DirectoryStream<Path> stream = Files.newDirectoryStream(directorio);
        for (Path path : stream) {
            if (Files.isRegularFile(path)) {
                archivos.add(path);
            }
        }

        // Ordenar por tamaño
        Collections.sort(archivos, new Comparator<Path>() {
            @Override
            public int compare(Path p1, Path p2) {
                try {
                    return Long.compare(Files.size(p1), Files.size(p2));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        // Imprimir los archivos ordenados
        for (Path archivo : archivos) {
            System.out.println(archivo);
        }

        // Obtener el año, mes y día de la fecha de la última modificación
        Path file = Path.of("/home/dieplamon/IdeaProjects/Proyecto_Diego/datosDiego.txt");
        LocalDate time = LocalDate.parse(Files.getLastModifiedTime(file).toString(), DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(time.getYear());
        System.out.println(time.getMonthValue());
        System.out.println(time.getDayOfMonth());

        // Navegación entre rutas
        Path relative = Path.of(".");
        Path absolute = relative.toAbsolutePath().normalize();
        System.out.printf("Relative: %s%n", relative);
        System.out.printf("Absolute: %s%n", absolute);
        System.out.printf("Name count: %d%n", absolute.getNameCount());
        System.out.printf("Parent: %s%n", absolute.getParent());
        System.out.printf("Subpath(0, 2): %s%n", absolute.subpath(0, 2));

        // Operaciones con ficheros
        Path original = Path.of("datosDiego.txt");
        Path backup = Path.of("datosDiego.txt.backup");
        Path rename = Path.of("datosDiego.txt.backup.1");
        //copia el archivo de la ruta original a la ruta backup
        Files.copy(original, backup, StandardCopyOption.REPLACE_EXISTING);
        //mueve el archivo de la ruta backup a la ruta rename
        Files.move(backup, rename, StandardCopyOption.REPLACE_EXISTING);
        //borra el archivo de la ruta rename
        Files.delete(rename);
    }

}
