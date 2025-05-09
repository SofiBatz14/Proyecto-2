import java.util.ArrayList;
import java.util.List;

public class Recomendador
{
    private List<Pelicula> catalogo;

    public Recomendador()
    {
        catalogo = new ArrayList<>();
        // Datos de ejemplo
        catalogo.add(new Pelicula("Intensamente", "Animación", "Feliz"));
        catalogo.add(new Pelicula("Titanic", "Romance", "Triste"));
        catalogo.add(new Pelicula("Avengers", "Acción", "Emocionado"));
        catalogo.add(new Pelicula("Soul", "Animación", "Reflexivo"));
        catalogo.add(new Pelicula("Coco", "Animación", "Nostálgico"));
        catalogo.add(new Pelicula("Joker", "Drama", "Triste"));
    }

    public List<Pelicula> recomendar(String emocion, String genero, Usuario usuario)
    {
        List<Pelicula> resultado = new ArrayList<>();

        for (Pelicula p : catalogo)
        {
            if (p.getGenero().equalsIgnoreCase(genero)
                    && p.getEmocion().equalsIgnoreCase(emocion)
                    && !usuario.yaVio(p.getTitulo()))
                    {
                resultado.add(p);
            }
        }

        return resultado;
    }
}