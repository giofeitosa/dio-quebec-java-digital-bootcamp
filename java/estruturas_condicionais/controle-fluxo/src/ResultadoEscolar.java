public class ResultadoEscolar {
    public static void main(String[] args) {

        //condicional ternária - simplificando o código

        int nota = 4;
        String resultado = nota >= 7 ? "Aprovado" : nota >=5  && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
