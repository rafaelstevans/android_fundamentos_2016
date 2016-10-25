package br.com.fabricadeprogramador.cursoandroid;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

import static android.R.attr.resource;

/**
 * Created by rafae on 19/10/2016.
 */

public class UsuarioListAdapter extends ArrayAdapter<Usuario> {

    public UsuarioListAdapter(Context context, List<Usuario> usuarioList) {
        super(context, R.layout.item_usuario_lista, usuarioList);
    }

    @Override
    //a cada nova View (cada linha da ListView) será executado este método getView. convertView é uma view de reaproveitamento.
    //o ViewGroup parent passa o layout pai da lista
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;
        //Se a View atual não tiver formato, infla a convertView com o layout xml item_usuario_lista
        if (convertView==null){
            convertView = View.inflate(getContext(),R.layout.item_usuario_lista, null);
            //Carrega o componente (holder) que tem o link para os componentes gráficos
            holder = new ViewHolder();
            //vincula o objeto holder ao layout do momento. Agora temos um holder com os ponteiros para a View
            ButterKnife.bind (holder, convertView);
            //Vinculando o holder ao convertView
            convertView.setTag(holder);

        } else {
            //reaproveita o holder já criado. Pega ele de dentro da ConvertView que foi setada (setTag) da primeira vez.
            holder = (ViewHolder)convertView.getTag();
        }

        //o getItem procura dentro da Lista usuarioList a posição atual do objeto
        Usuario usuario = getItem(position);
        //Se a posição não for nula, os atributos do holder recebem os valores dos atributos do objeto atual
        if (usuario!=null){
            holder.nome.setText(usuario.getNome());
            holder.imagem.setImageResource(usuario.getImagem());
        }

        //retorna a view com as informações
        return convertView;
    }
    //O holder tem um ponteiro para cada view, ou seja, conhece o objeto dele
    //É o holder que permite acessar o layout
   class ViewHolder {
       @Bind(R.id.usuario_imagem)
       ImageView imagem;
       @Bind(R.id.usuario_nome)
       TextView nome;
   }
}
