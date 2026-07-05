package edu.vitor.dio.controle_fluxo;

public class Contador {

    private int parametroUm;
    private int parametroDois;

    public Contador(){}

    public Contador(int parametroUm, int parametroDois) {
        this.parametroUm = parametroUm;
        this.parametroDois = parametroDois;
    }



    public int getParametroUm() {
        return parametroUm;
    }

    public void setParametroUm(int parametroUm) {
        this.parametroUm = parametroUm;
    }

    public int getParametroDois() {
        return parametroDois;
    }

    public void setParametroDois(int parametroDois) {
        this.parametroDois = parametroDois;
    }

    public void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        int contagem = parametroUm - parametroDois;
        if (parametroUm < parametroDois){
            throw new ParametrosInvalidosException("O primeiro parâmetro deve ser maior do que o segundo.");
        }
    }
    
}
