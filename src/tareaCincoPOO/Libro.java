package tareaCincoPOO;


public class Libro {
    private String titulo;
    private String autor;
    private String isbn;

    public Libro(String titulo, String autor, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        if (isbn.length() == 10) {
            if(compruebaisbn10(isbn)){
                this.isbn = isbn;
            } else System.out.println("ISBN no válido");
        } else if(isbn.length() == 13){
            if (compruebaisbn13(isbn)){
                this.isbn = isbn;
            }else System.out.println("ISBN no válido");
        } else System.out.println("ERROR, no tiene los números necesarios para ser un código ISBN");
    }

    public Libro() {}

    private static boolean compruebaisbn13(String isbn) {
        String refactorizedISBN = isbn.replace("-", "").replace(" ", "");
        int suma = 0, resto;
        for (int i = 0; i < 12; i++){
            if((i + 1) % 2 != 0){
                suma += Character.getNumericValue(refactorizedISBN.charAt(i));
            } else if((i + 1) % 2 == 0){
                suma += Character.getNumericValue(refactorizedISBN.charAt(i)) * 3;
            }
        }
        resto = suma % 10;
        return 10 - resto == Character.getNumericValue(refactorizedISBN.charAt(refactorizedISBN.length() - 1));
    }

   private static boolean compruebaisbn10(String isbn) {
        String refactorizedISBN = isbn.replace("-", "").replace(" ", "");
        int suma = 0;
        for (int i = 0; i < 10; i++) {
            suma += Character.getNumericValue(refactorizedISBN.charAt(i)) * (i + 1);
        }
        return suma % 11 == 0;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo (String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor (String autor){
        this.autor = autor;
    }

    public String getISBN(){
        return this.isbn;
    }

    public void setISBN ( String isbn){
        if (isbn.length() == 10) {
            if(compruebaisbn10(isbn)){
                this.isbn = isbn;
            } else System.out.println("ISBN no válido");
        } else if(isbn.length() == 13){
            if (compruebaisbn13(isbn)){
                this.isbn = isbn;
            }else System.out.println("ISBN no válido");
        } else System.out.println("ERROR, no tiene los números necesarios para ser un código ISBN");
    }

        @Override
        public String toString() {
            StringBuilder stringBuilder;
            stringBuilder = new StringBuilder();
            stringBuilder.append("\nTitulo: ");
            stringBuilder.append(this.titulo);
            stringBuilder.append("\nAutor: ");
            stringBuilder.append(this.autor);
            stringBuilder.append("\nISBN: ");
            stringBuilder.append(this.isbn);
            return stringBuilder.toString();
        }
}