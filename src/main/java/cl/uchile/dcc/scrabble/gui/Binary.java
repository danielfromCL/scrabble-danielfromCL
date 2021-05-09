package cl.uchile.dcc.scrabble.gui;

public class Binary extends numero{
    public String Binary;
    public Binary(String Binary) {
        this.Binary = Binary;
    }

    public String getBinary() {
        return Binary;
    }

    @Override
    public String toString() {
        return "Binary{" + this.getBinary() + "}";
    }

}
