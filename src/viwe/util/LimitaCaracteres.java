package viwe.util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class LimitaCaracteres extends PlainDocument{
    
    public enum TipoEntrada {
        NUMEROINTEIRO,  NUMERODECIMAL, NOME, DATA, EMAIL;
    }
    
    private int qtdCaracteres;
    private TipoEntrada tpEntrada;

    public LimitaCaracteres(int qtdCaracteres, TipoEntrada tpEntrada) {
        this.qtdCaracteres = qtdCaracteres;
        this.tpEntrada = tpEntrada;
    }

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        
        
        super.insertString(offs, str, a); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
