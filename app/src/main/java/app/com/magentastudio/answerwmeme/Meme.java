package app.com.magentastudio.answerwmeme;

/**
 * Created by SilvestreLottero on 12/8/16.
 */
public class Meme {
    private String titulo;
    private int img;

    public Meme(int img) {
        this.img = img;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
