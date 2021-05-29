package cl.uchile.dcc.scrabble.gui;

import java.util.Objects;

/**
 * Class that represents the Float type for Scrabble.
 */
public class Float extends Numbers{
    private double Float;

    /**
     * Creates a Float object.
     * Constructor that creates an object of the Float type, which receives a java double as parameter.
     */
    public Float(double Float) {
        this.Float=Float;
    }

    /**
     * Returns the hash of the Float class.
     */
    @Override
    public int hashCode(){
        return Objects.hash(Float.class);
    }

    /**
     * Returns whether an object is equal to the Float object that it's being compared to.
     */
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Float){
            var o = (Float) obj;
            return Math.abs(o.Float - this.Float) < 0.000001;
        }
        return false;
    }

    /**
     * Returns the Float parameter.
     * Getter that returns the java type double parameter of the Float object.
     */
    public double getFloat() {
        return Float;
    }


    /**
     * Returns the Float object representation as a java type String.
     */
    @Override
    public String toString() {
        return String.valueOf(this.getFloat());
    }

    /**
     * Returns a copy of the Float object.
     */
    @Override
    public Float transformtoFloat(){
        return this;
    }


    public Float sum(Int n){
        return new Float(this.getFloat()+ n.getInt());
    }

    public  Float sum(Float n){
        return new Float(this.getFloat()+n.getFloat());
    }
    /*
    public Binary sum(Binary n){
        return new Binary();
    }
*/

    public Float sub(Int n){
        return new Float(this.getFloat()- n.getInt());
    }

    public  Float sub(Float n){
        return new Float(this.getFloat()-n.getFloat());
    }
    /*
    public Binary sub(Binary n){
        return new Binary();
    }
*/

    public Float div(Int n){
        return new Float(this.getFloat()/n.getInt());
    }

    public  Float div(Float n){
        return new Float(this.getFloat()/n.getFloat());
    }
    /*
    public Binary sub(Binary n){
        return new Binary();
    }
*/

    public Float mult(Int n){
        return new Float(this.getFloat()*n.getInt());
    }

    public  Float mult(Float n){
        return new Float(this.getFloat()*n.getFloat());
    }
    /*
    public Binary mult(Binary n){
        return new Binary();
    }
*/
    /**
     * The negation of a Float is itself multiplied by -1.
     */
    @Override
    public ITypes neg(){
        return new Float(this.getFloat()*(-1));
    }
}
