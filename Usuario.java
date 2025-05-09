import java.util.HashSet;
import java.util.Set;

public class Usuario
{
    private String nombre;
    private Set<String> peliculasVistas;

    public Usuario(String nombre)
    {
        this.nombre = nombre;
        this.peliculasVistas = new HashSet<>();
    }

    public void marcarComoVista(String titulo)
    {
        peliculasVistas.add(titulo);
    }

    public boolean yaVio(String titulo)
    {
        return peliculasVistas.contains(titulo);
    }

    public String getNombre() { return nombre; }
}
