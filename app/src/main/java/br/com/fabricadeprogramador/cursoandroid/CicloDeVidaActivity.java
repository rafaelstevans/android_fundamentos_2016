package br.com.fabricadeprogramador.cursoandroid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Virmerson on 10/1/16.
 */
public class CicloDeVidaActivity  extends AppCompatActivity{
    private static final String TAG = "Ciclo de Vida";



    @OnClick(R.id.btn_ciclo_fechar)
    public void fechar(){
        Log.i(TAG, "Clicou botao fechar");
        finish();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       //Ativar Butter pra activity
        setContentView(R.layout.ciclodevida);
        Log.i(TAG, "Chamou On Create...");
        ButterKnife.bind(this);

       int flag =  getIntent().getFlags();
        if (flag==Flags.INTENT_MENU) {
            if (getIntent().getExtras() != null) {
                Bundle bundle = getIntent().getExtras();

                String nome = bundle.getString("nome");
                int idade = bundle.getInt("idade");

                String nomeIdad = nome + " "+ idade;
                bundle.putString("nomeidade", nomeIdad);

                Toast.makeText(CicloDeVidaActivity.this, "Nome:" + nome + " Idade:" + idade, Toast.LENGTH_SHORT).show();


            }
        }else if (flag==Flags.INTENT_CALC){
            Toast.makeText(CicloDeVidaActivity.this, "Me chamou da Calculadora", Toast.LENGTH_SHORT).show();

        }


        //
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
}
