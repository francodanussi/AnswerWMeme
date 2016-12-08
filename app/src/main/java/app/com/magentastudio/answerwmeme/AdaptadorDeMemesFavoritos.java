package app.com.magentastudio.answerwmeme;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by SilvestreLottero on 12/8/16.
 */
public class AdaptadorDeMemesFavoritos extends RecyclerView.Adapter {
    private List<Meme>listaDeMemesFavoritos;
    private Context context;

    public AdaptadorDeMemesFavoritos(List<Meme> listaDeMemesFavoritos, Context context) {
        this.listaDeMemesFavoritos = listaDeMemesFavoritos;
        this.context = context;
    }

    @Override

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View viewDeLaCelda = inflater.inflate(R.layout.celda_recycler_meme,parent,false);
        MemeViewHolder memeViewHolder = new MemeViewHolder(viewDeLaCelda);
        return memeViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Meme unMeme = listaDeMemesFavoritos.get(position);
        MemeViewHolder memeViewHolder = (MemeViewHolder)holder;
        memeViewHolder.cargarMeme(unMeme);
    }

    @Override
    public int getItemCount() {
        return listaDeMemesFavoritos.size();
    }


    private class MemeViewHolder extends RecyclerView.ViewHolder {

        private ImageView img;

        public MemeViewHolder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.img);
        }

        public void cargarMeme(Meme unMeme){
            img.setImageResource(unMeme.getImg());
        }
    }
}
