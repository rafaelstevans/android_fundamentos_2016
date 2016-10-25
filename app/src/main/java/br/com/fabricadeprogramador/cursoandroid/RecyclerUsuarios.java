package br.com.fabricadeprogramador.cursoandroid;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.RecyclerView;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;

        import java.util.ArrayList;
        import java.util.List;

        import butterknife.Bind;
        import butterknife.ButterKnife;
/**
 * Created by rafae on 21/10/2016.
 */

public class RecyclerUsuarios extends AppCompatActivity {

    List<Usuario> recyclerUsuarios = new ArrayList<>();

    @Bind(R.id.recycler_usuarios)
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reclycler_usuarios);
        ButterKnife.bind(this);
        criarUsuarios();
        //ArrayAdapter<Usuario> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaUsuarios);
        //UsuarioListAdapter adapter = new UsuarioListAdapter(this,recyclerUsuarios);
        recycler.setAdapter(new RecyclerAdapter(recyclerUsuarios, this));
    }
    public void criarUsuarios() {
        if (recyclerUsuarios.isEmpty()) {
            Usuario u1 = new Usuario();
            u1.setId(1L);
            u1.setNome("Virmerson");
            u1.setImagem(R.drawable.virmerson);
            recyclerUsuarios.add(u1);

            Usuario u2 = new Usuario();
            u2.setId(2L);
            u2.setNome("Maria");
            u2.setImagem(R.drawable.maria);
            recyclerUsuarios.add(u2);

            Usuario u3 = new Usuario();
            u3.setId(3L);
            u3.setNome("Jão");
            u3.setImagem(R.drawable.jao);
            recyclerUsuarios.add(u3);

            Usuario u4 = new Usuario();
            u4.setId(4L);
            u4.setNome("Jão4");
            u4.setImagem(R.drawable.jao);
            recyclerUsuarios.add(u4);

            Usuario u5 = new Usuario();
            u5.setId(5L);
            u5.setNome("Jão5");
            u5.setImagem(R.drawable.jao);
            recyclerUsuarios.add(u5);

            Usuario u6 = new Usuario();
            u6.setId(6L);
            u6.setNome("Jão6");
            u6.setImagem(R.drawable.jao);
            recyclerUsuarios.add(u6);

            Usuario u7 = new Usuario();
            u7.setId(7L);
            u7.setNome("Jão7");
            u7.setImagem(R.drawable.jao);
            recyclerUsuarios.add(u7);

            Usuario u8 = new Usuario();
            u8.setId(8L);
            u8.setNome("Jão8");
            u8.setImagem(R.drawable.jao);
            recyclerUsuarios.add(u8);

            Usuario u9 = new Usuario();
            u9.setId(9L);
            u9.setNome("Jão9");
            u9.setImagem(R.drawable.jao);
            recyclerUsuarios.add(u9);

            Usuario u10 = new Usuario();
            u10.setId(10L);
            u10.setNome("Jão10");
            u10.setImagem(R.drawable.jao);
            recyclerUsuarios.add(u10);
        }
    }

}