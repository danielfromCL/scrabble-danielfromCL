package cl.uchile.dcc.scrabble.gui;

public class Int extends Numbers {
    private int Int;
    public Int(int Int) {
        this.Int = Int;
    }

    public int getInt() {
        return Int;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getInt());
    }

    @Override
    public Int transformtoInt(){
        return this;
    }

    @Override
    public Float transformtoFloat(){
        return new Float(this.getInt());
    }


    /*

    Esta función todavia no debe estar implementada para la entrega parcial 1
    @Override
    public Binary transformtoBinary(){
        aqui va el codigo
        return algo tipo binario
     */


}
