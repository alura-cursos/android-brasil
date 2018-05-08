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
        adicionaValidacaoPadrao(textInputNomeCompleto);

        TextInputLayout textInputCpf = findViewById(R.id.formulario_cadastro_campo_cpf);
        adicionaValidacaoPadrao(textInputCpf);

        TextInputLayout textInputTelefoneComDdd = findViewById(R.id.formulario_cadastro_campo_telefone_com_ddd);
        adicionaValidacaoPadrao(textInputTelefoneComDdd);

        TextInputLayout textInputEmail = findViewById(R.id.formulario_cadastro_campo_email);
        adicionaValidacaoPadrao(textInputEmail);

        TextInputLayout textInputSenha = findViewById(R.id.formulario_cadastro_campo_senha);
        adicionaValidacaoPadrao(textInputSenha);
    }

    private void adicionaValidacaoPadrao(final TextInputLayout textInputCampo){
        final EditText campo = textInputCampo.getEditText();
        campo.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                String texto = campo.getText().toString();
                if(!hasFocus){
                    if(texto.isEmpty()){
                        textInputCampo.setError("Campo obrigatório");
                    } else {
                        textInputCampo.setError(null);
                        textInputCampo.setErrorEnabled(false);
                    }
                }
            }
        });
    }

}
