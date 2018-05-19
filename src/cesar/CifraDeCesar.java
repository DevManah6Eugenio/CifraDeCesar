package cesar;

public class CifraDeCesar {

    private int chave;
    private StringBuilder textoCifrado = null;
    private StringBuilder textoDecifrado = null;

    public String encriptar(int chave, String texto) {

        textoCifrado = limparStringBuilder(textoCifrado);

        for (int c = 0; c < tamanhoDoTexto(texto); c++) {
            int letraCifradaASCII = (((int) texto.charAt(c)) + chave);
            textoCifrado.append((char) letraCifradaASCII);
        }

        return textoCifrado.toString();
    }

    public String decriptar(int chave, String texto) {

        textoDecifrado = limparStringBuilder(textoDecifrado);

        chave *= -1;

        for (int c = 0; c < tamanhoDoTexto(texto); c++) {
            int letraDecifradaASCII = (((int) texto.charAt(c)) + chave);
            textoDecifrado.append((char) letraDecifradaASCII);
        }
       
        return textoDecifrado.toString();
    }

    public int tamanhoDoTexto(String texto) {
        int tamanhoTexto = texto.length();
        return tamanhoTexto;
    }

    //verifica se a variavel ja foi iniciada se ja limpa a memoria usada 
    //pela variavel para ser usada novamente
    public StringBuilder limparStringBuilder(StringBuilder variavelStringBuilder) {
        if (variavelStringBuilder == null) {
            variavelStringBuilder = new StringBuilder();
        } else {
            variavelStringBuilder.delete(0, variavelStringBuilder.length());
        }
        return variavelStringBuilder;
    }
}