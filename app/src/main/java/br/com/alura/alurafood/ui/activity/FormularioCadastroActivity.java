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
        adicionaValidacaoPadrao(campoNomeCompleto);

        TextInputLayout textInputCpf = findViewById(R.id.formulario_cadastro_campo_cpf);
        EditText campoCpf = textInputCpf.getEditText();
        adicionaValidacaoPadrao(campoCpf);

        TextInputLayout textInputTelefoneComDdd = findViewById(R.id.formulario_cadastro_campo_telefone_com_ddd);
        EditText campoTelefoneComDdd = textInputTelefoneComDdd.getEditText();
        adicionaValidacaoPadrao(campoTelefoneComDdd);

        TextInputLayout textInputEmail = findViewById(R.id.formulario_cadastro_campo_email);
        EditText campoEmail = textInputEmail.getEditText();
        adicionaValidacaoPadrao(campoEmail);

        TextInputLayout textInputSenha = findViewById(R.id.formulario_cadastro_campo_senha);
        EditText campoSenha = textInputSenha.getEditText();
        adicionaValidacaoPadrao(campoSenha);
    }

    private void adicionaValidacaoPadrao(final EditText campo) {
        campo.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                String texto = campo.getText().toString();
                if(texto.isEmpty()){
                    campo.setError("Campo obrigatório");
                }
            }
        });
    }
}
