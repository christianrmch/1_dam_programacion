public class LDM {
    public static void main(String[] args) {
        System.out.println(serieDeTaylor(2,6));
    }

    private static Double serieDeTaylor(int x, int k) {
        int resultadoTaylor = 0;
        if(k==0){
            resultadoTaylor += (x^(k))/factorial(k);
        } else {
            resultadoTaylor += (x^(k))/factorial(k);
            serieDeTaylor(x, k-1);
        }
        return (double) resultadoTaylor;
    }

    private static int factorial(int k) {
        int resultado = 1;
        if (k==0){
            resultado *=1;
        } else{
            resultado *= k;
            factorial((k-1));
        }
        return resultado;
    }
}
