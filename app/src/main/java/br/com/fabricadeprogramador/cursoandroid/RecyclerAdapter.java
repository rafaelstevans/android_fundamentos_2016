package br.com.fabricadeprogramador.cursoandroid;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by rafae on 21/10/2016.
 */

public class RecyclerAdapter extends RecyclerView.Adapter {

    private List<Usuario> usuarios;
    private Context context;

    public RecyclerAdapter(List<Usuario> usuarios, Context context) {
        this.usuarios = usuarios;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_usuario_lista, parent, false);

        RecyclerViewHolder holder = new RecyclerViewHolder(view);

        return holder;
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {

        RecyclerViewHolder holder = (RecyclerViewHolder) viewHolder;

        Usuario usuario  = usuarios.get(position) ;

        holder.nome.setText(usuario.getNome());
        holder.imagem.setImageResource(usuario.getImagem());

    }

    @Override
    public int getItemCount() {
        return usuarios.size();
    }
}
