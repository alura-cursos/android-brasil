package br.com.alura.alurafood.ui.activity;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import br.com.alura.alurafood.R;

public class FormularioCadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_cadastro);
        TextInputLayout textInputNomeCompleto = findViewById(R.id.formulario_cadastro_campo_nome_completo);
        EditText campoNomeCompleto = textInputNomeCompleto.getEditText();
        String nomeCompleto = campoNomeCompleto.getText().toString();
        if(nomeCompleto.isEmpty()){
            campoNomeCompleto.setError("Campo obrigatório");
        }
    }
}
