package cl.uchile.dcc.scrabble.gui;

public class Binary extends Numbers{
    private String Binary;
    public Binary(String Binary) {
        this.Binary = Binary;
    }

    public String getBinary() {
        return Binary;
    }

    @Override
    public String toString() {
        return this.getBinary();
    }


    @Override
    public Binary transformtoBinary(){
        return this;
    }



}
