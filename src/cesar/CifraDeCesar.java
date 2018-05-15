package cesar;

public class CifraDeCesar {
    private int chave;
    private StringBuilder textoCifrado;
    private StringBuilder textoDecifrado;
    private int tamanhoTexto;
    
    public String encriptar(int chave, String texto) {
        
        textoCifrado = new StringBuilder();
        
        for (int c = 0; c < getTamanhoTexto(texto); c++) {
            int letraCifradaASCII = (((int)texto.charAt(c)) + chave);
            textoCifrado.append((char) letraCifradaASCII);
        }

        return textoCifrado.toString();
    }

    public String decriptar(int chave, String texto) {
        
        chave *= -1;
        textoDecifrado = new StringBuilder(encriptar(chave, texto));
        
        return textoDecifrado.toString();
    }

    public int getTamanhoTexto(String texto) {
        tamanhoTexto = texto.length();
        return tamanhoTexto;
    }
}
