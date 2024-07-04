import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Formatear la fecha y hora actual para mostrarla de manera legible
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        
        // Obtener la fecha y hora actual
        LocalDateTime now = LocalDateTime.now();
        
        // Mostrar el saludo y la hora actual
        System.out.println("¡Hola DevOps! La hora actual es " + now.format(formatter));
    }
}
