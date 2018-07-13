package Model;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

public class Fracao {

    private int denominador;
    private int numerador;

    public Fracao(int numerador, int denominador) {
        if (denominador <= 0) {
            throw new ValueException("Denominador não pode ser zero");
        }else
            this.denominador = denominador;
            this.numerador = numerador;;
    }

    public String multiplicacao(Fracao fracao){
        String resultado;
        resultado = String.valueOf(this.numerador * fracao.numerador)+ "/";
        resultado += String.valueOf(this.denominador * fracao.denominador);

        return resultado;
    }

    public String divisao(Fracao fracao){
        return this.multiplicacao(new Fracao(fracao.denominador, fracao.numerador));
    }

    public String soma(Fracao fracao){
        float mmc = this.mmc(fracao.denominador,this.denominador);
        return String.valueOf(this.numerador + fracao.numerador)+"/"+mmc;
    }

    public String diferenca(Fracao fracao){
        float mmc = this.mmc(fracao.denominador,this.denominador);
        return String.valueOf(this.numerador - fracao.numerador)+"/"+mmc;
    }

    public float reduzida(){
        //Todo fazer a simplificação de uma fração.
        return 0;
    }

    public boolean aparente(){
        return (this.numerador % this.denominador == 0 )? true : false;
    }

    public float valorReal(){
        return (this.numerador / this.denominador);
    }


    public float mmc(float num1, float num2){
        float aux, i,mmc = 0;
        if(num1 != num2) {
            for (i = 2; i <= num2; i++) {
                aux = num1 * i;
                if ((aux % num2) == 0) {
                    mmc = aux;
                    i = num2 + 1;
                }
            }
            return mmc;
        }

        return num1;

    }
}
