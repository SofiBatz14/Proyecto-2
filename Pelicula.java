public class Pelicula
{
    private String titulo;
    private String genero;
    private String emocion;

    public Pelicula(String titulo, String genero, String emocion)
    {
        this.titulo = titulo;
        this.genero = genero;
        this.emocion = emocion;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getGenero() { return genero;}
    public void setGenero(String genero) { this.genero = genero; }
    public String getEmocion() { return emocion; }
    public void setEmocion(String emocion) { this.emocion = emocion; }

    @Override
    public String toString()
    {
        return titulo + " [" + genero + ", " + emocion + "]";
    }
}