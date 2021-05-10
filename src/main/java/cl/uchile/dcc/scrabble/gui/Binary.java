package cl.uchile.dcc.scrabble.gui;

public class Binary extends Numbers{
    private String Binary;
    public Binary(String Binary) {
        this.Binary = Binary;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Binary){
            var o = (Binary) obj;
            return o.Binary.equals(this.Binary);
        }
        return false;
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



    /*
    Estas funciones no tienen que estar implementadas para la entrega parcial 1
    @Override
    public Float transformtoFloat(){
        return algo;
    }
    @Override
    public Int transformtoInt(){
        return algo;
    }
     */

}
