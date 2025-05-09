import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Recomendador recomendador = new Recomendador();
        Usuario usuario = new Usuario("Luis");

        System.out.println("Bienvenido a My SoulMate - Recomendador de Películas");
        System.out.print("¿Cómo te sientes hoy? (Feliz, Triste, Emocionado, Nostálgico, Reflexivo): ");
        String emocion = sc.nextLine();

        System.out.print("¿Qué género quieres ver? (Acción, Romance, Animación, Drama): ");
        String genero = sc.nextLine();

        System.out.println("\nBuscando recomendaciones...");
        List<Pelicula> sugerencias = recomendador.recomendar(emocion, genero, usuario);

        if (sugerencias.isEmpty())
        {
            System.out.println("Lo siento, no hay recomendaciones para hoy.");
        }
        else
        {
            System.out.println("Te recomendamos:");
            for (Pelicula p : sugerencias)
            {
                System.out.println("- " + p);
                usuario.marcarComoVista(p.getTitulo());
            }
        }

        sc.close();
    }
}
