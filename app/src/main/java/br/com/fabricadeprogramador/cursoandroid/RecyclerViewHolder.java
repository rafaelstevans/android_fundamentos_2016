package br.com.fabricadeprogramador.cursoandroid;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

//import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by rafae on 21/10/2016.
 */

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    /*
    @Bind(R.id.usuario_imagem)
    ImageView imagem;
    @Bind(R.id.usuario_nome)
    TextView nome;*/

    final TextView nome;
    final ImageView imagem;


    public RecyclerViewHolder(View view) {
        super(view);
        nome = (TextView) view.findViewById(R.id.usuario_nome);
        imagem = (ImageView) view.findViewById(R.id.usuario_imagem);

    }

}