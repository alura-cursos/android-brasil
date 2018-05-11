package br.com.alura.alurafood.validator;

import android.support.design.widget.TextInputLayout;
import android.widget.EditText;

public class ValidaTelefoneComDdd {

    public static final String DEVE_TER_DEZ_OU_ONZE_DIGITOS = "Telefone deve ter entre 10 a 11 dígitos";
    private final TextInputLayout textInputTelefoneComDdd;
    private final EditText campoTelefoneComDdd;
    private final ValidacaoPadrao validacaoPadrao;

    public ValidaTelefoneComDdd(TextInputLayout textInputTelefoneComDdd) {
        this.textInputTelefoneComDdd = textInputTelefoneComDdd;
        this.campoTelefoneComDdd = textInputTelefoneComDdd.getEditText();
        this.validacaoPadrao = new ValidacaoPadrao(textInputTelefoneComDdd);
    }

    private boolean validaEntreDezOuOnzeDigitos(String telefoneComDdd){
        int digitos = telefoneComDdd.length();
        if(digitos < 10 || digitos > 11){
            textInputTelefoneComDdd.setError(DEVE_TER_DEZ_OU_ONZE_DIGITOS);
            return false;
        }
        return true;
    }

    public boolean estaValido(){
        if(!validacaoPadrao.estaValido()) return false;
        String telefoneComDdd = campoTelefoneComDdd.getText().toString();
        if(!validaEntreDezOuOnzeDigitos(telefoneComDdd)) return false;
        adicionaFormatacao(telefoneComDdd);
        return true;
    }

    private void adicionaFormatacao(String telefoneComDdd) {
        StringBuilder sb = new StringBuilder();
        int digitos = telefoneComDdd.length();
        for (int i = 0; i < digitos; i++) {
            if(i == 0){
                sb.append("(");
            }
            char digito = telefoneComDdd.charAt(i);
            sb.append(digito);
            if(i == 1){
                sb.append(") ");
            }
            if(digitos == 10 && i == 5 || digitos == 11 && i == 6){
                sb.append("-");
            }
        }
        String telefoneComDddFormatado = sb.toString();
        campoTelefoneComDdd.setText(telefoneComDddFormatado);
    }
}
