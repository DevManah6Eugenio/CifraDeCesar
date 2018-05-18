package cesar;

public class CifraDeCesar {
    private int chave;
    private StringBuilder textoCifrado = null;
    private StringBuilder textoDecifrado = null;
    private int tamanhoTexto;
    
    public String encriptar(int chave, String texto) {
        
        if (textoCifrado == null){
            textoCifrado = new StringBuilder();
        } else {
            textoCifrado = limparStringBuilder(textoCifrado);
        }
        
        for (int c = 0; c < getTamanhoTexto(texto); c++) {
            int letraCifradaASCII = (((int)texto.charAt(c)) + chave);
            textoCifrado.append((char) letraCifradaASCII);
        }

        return textoCifrado.toString();
    }

    public String decriptar(int chave, String texto) {
        
        if (textoDecifrado == null){
            textoDecifrado = new StringBuilder();
        } else {
            textoDecifrado = limparStringBuilder(textoDecifrado);
        }
        
        chave *= -1;
        
        textoDecifrado.append(encriptar(chave, texto));
        
        return textoDecifrado.toString();
    }

    public int getTamanhoTexto(String texto) {
        tamanhoTexto = texto.length();
        return tamanhoTexto;
    }
    
    public StringBuilder limparStringBuilder(StringBuilder var){
        var.delete(0, var.length());
        return var;
    }
}
