package cl.uchile.dcc.scrabble.gui;


public interface ITypes {

    TString transformtoString();

    Bool transformtoBool();

    Int transformtoInt();

    Float transformtoFloat();

    Binary transformtoBinary();

    @Override
    int hashCode();
    @Override
    boolean equals(Object o);

}
