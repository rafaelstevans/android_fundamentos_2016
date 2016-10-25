package br.com.fabricadeprogramador.cursoandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Virmerson on 9/24/16.
 */
public class MenuActivity extends AppCompatActivity {

    private static final String TAG = "MENU";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "Chamou On Create...");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        //Cammel Case
        Button btnCiclo =  (Button) findViewById(R.id.btn_ciclo);

        btnCiclo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Carregar uma nova tela
                Intent irParaCiclo = new Intent(MenuActivity.this, CicloDeVidaActivity.class);

                irParaCiclo.putExtra("nome", "Virmerson");
                irParaCiclo.putExtra("idade", 35);
                irParaCiclo.addFlags(Flags.INTENT_MENU);


                startActivityForResult(irParaCiclo, 1);

            }
        });


        Button btnCalc =  (Button) findViewById(R.id.btn_calc);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irParaCalc = new Intent(MenuActivity.this, CalculadoraActivity.class);
                startActivityForResult(irParaCalc, 2);
            }
        });

        Button btnListaUsuario =  (Button) findViewById(R.id.btn_lista_usuarios);

        btnListaUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irParaListaUsuarios = new Intent(MenuActivity.this, ListaUsuarios.class);
                startActivityForResult(irParaListaUsuarios, 3);
            }
        });

        Button btnRecyclerUsuario =  (Button) findViewById(R.id.btn_recycler_usuarios);

        btnRecyclerUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irParaRecyclerUsuarios = new Intent(MenuActivity.this, RecyclerUsuarios.class);
                startActivityForResult(irParaRecyclerUsuarios, 4);
            }
        });


    }

    @Override
    protected void onStart() {
        Log.i(TAG, "Chamou On Start...");
        super.onStart();
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG, "Chamou On Destroy...");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.i(TAG, "Chamou On Pause...");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.i(TAG, "Chamou On Resume...");
        super.onResume();
    }

    @Override
    protected void onStop() {
        Log.i(TAG, "Chamou On Stop...");
        super.onStop();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode==1){
            String nomeIdade = data.getExtras().getString("nomeidade");

            Toast.makeText(MenuActivity.this, "Resultado da Activity Ciclo : " + nomeIdade, Toast.LENGTH_SHORT).show();
        }

        if (requestCode==2){
            Toast.makeText(MenuActivity.this, "Resultado da Activity Calc", Toast.LENGTH_SHORT).show();
        }
    }
}
