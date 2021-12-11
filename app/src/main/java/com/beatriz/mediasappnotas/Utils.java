package com.beatriz.mediasappnotas;

import android.widget.EditText;

public class Utils {

    public float converteValor(EditText caixaDeTexto){
        float valorMedia = Float.parseFloat(caixaDeTexto.getText().toString());
        return valorMedia;
    }

    public float calcularMedia(EditText notaP, EditText notaS, EditText notaT, EditText notaQ){
        float notaPrimeiroConvertida = converteValor(notaP);
        float notaSegundoConvertido = converteValor(notaS);
        float notaTerceiroConvertido = converteValor(notaT);
        float notaQuartaConvertido = converteValor(notaQ);

        float notasSomadas = notaPrimeiroConvertida + notaSegundoConvertido + notaTerceiroConvertido
                + notaQuartaConvertido;

        float media = notasSomadas / 4;
        return media;
    }
}
