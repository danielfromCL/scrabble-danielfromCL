package cl.uchile.dcc.scrabble.gui;

import java.util.Objects;


/**
 * Class that represents the Binary type for Scrabble.
 */
public class Binary extends Numbers implements ILogical{
    private String Binary;

    /**
     * Creates a Binary object.
     * Constructor that creates an object of the Binary type, which receives a java String as parameter.
     */
    public Binary(String Binary) {
        this.Binary = Binary;
    }

    /**
     * Returns the hash of the Binary class.
     */
    @Override
    public int hashCode(){
        return Objects.hash(Binary.class);
    }

    /**
     * Returns whether an object is equal to the Binary object that it's being compared to.
     */
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Binary){
            var o = (Binary) obj;
            return o.Binary.equals(this.Binary);
        }
        return false;
    }

    /**
     * Returns the Binary parameter.
     * Getter that returns the java type String parameter of the Binary object.
     */
    public String getBinary() {
        return Binary;
    }


    /**
     * Returns the Binary object representation as a java type String.
     */
    @Override
    public String toString() {
        return this.getBinary();
    }

    /**
     * Returns a copy of the Binary object.
     */
    @Override
    public Binary transformtoBinary(){
        return new Binary(this.getBinary());
    }

    @Override
    public Float transformtoFloat() {
        int i = toInt(this.getBinary());
        return new Float(i);
    }

    @Override
    public Int transformtoInt(){
        int i = toInt(this.getBinary());
        return new Int(i);
    }

    /**
     * Returns a new Binary object with the sum between the Binary object and an Int object.
     */
    @Override
    public INumbers sum(Int i){
        int bi = toInt(this.getBinary());
        int res = bi + i.getInt();
        String binary = intToBinary(res);
        return new Binary(binary);
    }
    /**
     * Returns a new Binary object with the sum between the Binary object and another Binary object.
     */
    @Override
    public INumbers sum(Binary bi){
        int b1 = toInt(this.getBinary());
        int b2= toInt(bi.getBinary());
        int res = b1 + b2;
        String binary = intToBinary(res);
        return new Binary(binary);
    }

    /**
     * Returns a new Binary object with the subtraction between the Binary object and an Int object.
     */
    @Override
    public INumbers sub(Int n) {
        int bi = toInt(this.getBinary());
        int res = bi - n.getInt();
        String binary = intToBinary(res);
        return new Binary(binary);
    }

    /**
     * Returns a new Binary object with the subtraction between the Binary object and another Binary object.
     */
    @Override
    public INumbers sub(Binary n) {
        int b1 = toInt(this.getBinary());
        int b2= toInt(n.getBinary());
        int res = b1 - b2;
        String binary = intToBinary(res);
        return new Binary(binary);
    }

    /**
     * Returns a new Binary object with the division between the Binary object and an Int object.
     */
    @Override
    public INumbers div(Int n) {
        int bi = toInt(this.getBinary());
        int res = bi / n.getInt();
        String binary = intToBinary(res);
        return new Binary(binary);
    }
    /**
     * Returns a new Binary object with the division between the Binary object and another Binary object.
     */
    @Override
    public INumbers div(Binary n) {
        int b1 = toInt(this.getBinary());
        int b2= toInt(n.getBinary());
        int res = b1 / b2;
        String binary = intToBinary(res);
        return new Binary(binary);
    }

    /**
     * Returns a new Binary object with the multiplication between the Binary object and an Int object.
     */
    @Override
    public INumbers mult(Int n) {
        int bi = toInt(this.getBinary());
        int res = bi * n.getInt();
        String binary = intToBinary(res);
        return new Binary(binary);
    }
    /**
     * Returns a new Binary object with the multiplication between the Binary object and another Binary object.
     */
    @Override
    public INumbers mult(Binary n) {
        int b1 = toInt(this.getBinary());
        int b2= toInt(n.getBinary());
        int res = b1 * b2;
        String binary = intToBinary(res);
        return new Binary(binary);
    }

    /**
     * Returns the negation of a Binary object.
     * The negation of a binary is made bit to bit.
     */
    @Override
    public ITypes neg(){
        String binary = this.getBinary();
        String res="";
        for(int i = 0; i<binary.length(); i++){
            if(binary.charAt(i)=='0'){
                res+='1';
            }
            else{
                res+='0';
            }
        }
        return new Binary(res);
    }

    /**
     * Returns a new Binary object with the logical operator "and" applied bit to bit between both Binary objects.
     */
    @Override
    public ILogical and(Binary b) {
        String binary1 = this.getBinary();
        String binary2 = b.getBinary();
        String res="";
        String bin1=binary1;
        String bin2=binary2;
        int length1 = binary1.length();
        int length2 = binary2.length();
        int max = Math.max(length1,length2);
        boolean neg1 = false;
        boolean neg2 = false;
        if(binary1.charAt(0)=='1'){
            neg1 = true;
        }
        if(binary2.charAt(0)=='1'){
            neg2 = true;
        }
        if(length1 < max){
            bin1="";
            int k = 0;
            while(k<length2-length1){
                if(neg1){
                    bin1+="1";
                }
                else{
                    bin1+="0";
                }
                k++;
            }
            bin1+=binary1;
        }
        if(length2 < max){
            bin2 = "";
            int k = 0;
            while(k<length1-length2){
                if(neg2){
                    bin2+="1";
                }
                else{
                    bin2+="0";
                }
                k++;
            }
            bin2+=binary2;
        }
        for(int i = 0; i<max; i++){
            if(bin1.charAt(i)=='1' && bin2.charAt(i)=='1'){
                res+='1';
            }
            else{
                res+='0';
            }
        }
        return new Binary(res);
    }

    /**
     * Returns a new Binary object with the logical operator "and" applied bit to bit between the Binary object and the boolean value from the Bool object.
     */
    @Override
    public ILogical and(Bool b) {
        String binary = this.getBinary();
        String res="";
        if(b.isBool()){
            for(int i = 0; i<binary.length(); i++){
                if(binary.charAt(i)=='0'){
                    res+='0';
                }
                else{
                    res+='1';
                }
            }
        }
        else{
            for(int i = 0; i<binary.length(); i++){
                res+='0';
            }
        }
        return new Binary(res);
    }

    /**
     * Returns a new Binary object with the logical operator "or" applied bit to bit between both Binary objects.
     */
    @Override
    public ILogical or(Binary b) {
        String binary1 = this.getBinary();
        String binary2 = b.getBinary();
        String res="";
        String bin1=binary1;
        String bin2=binary2;
        int length1 = binary1.length();
        int length2 = binary2.length();
        int max = Math.max(length1,length2);
        boolean neg1 = false;
        boolean neg2 = false;
        if(binary1.charAt(0)=='1'){
            neg1 = true;
        }
        if(binary2.charAt(0)=='1'){
            neg2 = true;
        }
        if(length1 < max){
            bin1="";
            int k = 0;
            while(k<length2-length1){
                if(neg1){
                    bin1+="1";
                }
                else{
                    bin1+="0";
                }
                k++;
            }
            bin1+=binary1;
        }
        if(length2 < max){
            bin2 = "";
            int k = 0;
            while(k<length1-length2){
                if(neg2){
                    bin2+="1";
                }
                else{
                    bin2+="0";
                }
                k++;
            }
            bin2+=binary2;
        }
        for(int i = 0; i<max; i++){
            if(bin1.charAt(i)=='1' || bin2.charAt(i)=='1'){
                res+='1';
            }
            else{
                res+='0';
            }
        }
        return new Binary(res);
    }

    /**
     * Returns a new Binary object with the logical operator "or" applied bit to bit between the Binary object and the boolean value from the Bool object.
     */
    @Override
    public ILogical or(Bool b) {
        String binary = this.getBinary();
        String res="";
        if(!(b.isBool())){
            for(int i = 0; i<binary.length(); i++){
                if(binary.charAt(i)=='0'){
                    res+='0';
                }
                else{
                    res+='1';
                }
            }
        }
        else{
            for(int i = 0; i<binary.length(); i++){
                res+='1';
            }
        }
        return new Binary(res);
    }
}
