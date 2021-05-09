package cl.uchile.dcc.scrabble.gui;

public class Binary extends numero{
    public java.lang.String Binary;
    public Binary(java.lang.String Binary) {
        this.Binary = Binary;
    }

    public java.lang.String getBinary() {
        return Binary;
    }

    @Override
    public java.lang.String toString() {
        return "Binary es: " + this.getBinary();
    }
    
}
