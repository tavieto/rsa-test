package dev.tavieto.cryptotest;

public class FuncoesComplexas {

    // Função complexa 1
    public static double funcaoComplexa1(int x) {
        double resultado = Math.sin(Math.toRadians(x)) * Math.exp(x / 10.0) + Math.sqrt(x);
        resultado = Math.pow(resultado, 2) / (1 + Math.abs(Math.cos(Math.toRadians(x))));
        resultado = resultado + Math.atan(Math.pow(Math.E, resultado));
        resultado = Math.log(resultado + 1) * Math.cbrt(resultado);
        resultado = resultado * Math.PI / 180.0;
        resultado = Math.hypot(resultado, Math.cos(Math.toRadians(resultado)));
        resultado = Math.ceil(resultado * Math.pow(2, resultado));

        // Cálculos manuais adicionados
        resultado = resultado + 5;
        resultado = resultado * 3;
        resultado = resultado - 7;

        resultado = Math.cos(resultado);
        resultado = Math.tan(resultado);
        resultado = Math.floorMod((int) resultado, 50);
        resultado = Math.sqrt(resultado);
        resultado = Math.cbrt(resultado);
        resultado = Math.pow(resultado, 2);
        resultado = Math.round(resultado);
        resultado = Math.floor(resultado);
        resultado = Math.abs(resultado);

        return resultado;
    }

    // Função complexa 2 (reversa da função 1)
    public static int funcaoComplexa2(double y) {
        y = y / Math.pow(2, y);
        y = Math.toRadians(y);
        y = y / Math.PI;
        y = Math.pow(Math.E, Math.atan(y));
        y = Math.pow(y, 1 / 3.0);
        y = Math.sqrt(y);
        y = Math.asin(y - 1) * 180.0 / Math.PI;

        // Cálculos manuais adicionados
        y = y - 5;
        y = y / 3;
        y = y + 7;

        y = Math.cos(y);
        y = Math.tan(y);
        y = Math.floorMod((int) y, 50);
        y = Math.sqrt(y);
        y = Math.cbrt(y);
        y = Math.pow(y, 2);
        y = Math.round(y);
        y = Math.floor(y);
        y = Math.abs(y);

        return (int) Math.round(y);
    }

    public static void main(String[] args) {
        // Exemplo de uso das funções
        int original = 117;
        double x = funcaoComplexa1(original);
        int y = funcaoComplexa2(x);

        // Verificando se a propriedade original == y é verdadeira
        System.out.println("Original == y: " + (original == y));
    }
}