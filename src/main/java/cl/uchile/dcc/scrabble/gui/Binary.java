package cl.uchile.dcc.scrabble.gui;

import cl.uchile.dcc.scrabble.gui.ast.AST;

import java.util.Objects;


/**
 * Class that represents the Binary type for Scrabble.
 */
public class Binary extends Numbers implements ILogical, IntBinary{
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
    public boolean equals(Object obj) {
        if (obj instanceof Binary) {
            var o = (Binary) obj;
            String bin1 = this.getBinary();
            String bin2 = o.getBinary();
            int length1 = this.getBinary().length();
            int length2 = o.getBinary().length();
            int max = Math.max(length1, length2);
            boolean neg1 = false;
            boolean neg2 = false;
            if (this.getBinary().charAt(0) == '1') {
                neg1 = true;
            }
            if (o.getBinary().charAt(0) == '1') {
                neg2 = true;
            }
            if (neg1 != neg2) {
                return false;
            } else {
                if (length1 < max) {
                    bin1 = "";
                    int k = 0;
                    while (k < length2 - length1) {
                        if (neg1) {
                            bin1 += "1";
                        } else {
                            bin1 += "0";
                        }
                        k++;
                    }
                    bin1 += this.getBinary();
                }
                if (length2 < max) {
                    bin2 = "";
                    int k = 0;
                    while (k < length1 - length2) {
                        if (neg2) {
                            bin2 += "1";
                        } else {
                            bin2 += "0";
                        }
                        k++;
                    }
                    bin2 += o.getBinary();
                }
                return bin1.equals(bin2);
            }
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
    /**
     * Returns a new Float object with the Binary object's parameter in int form as its parameter.
     */
    @Override
    public Float transformtoFloat() {
        int i = toInt(this.getBinary());
        return new Float(i);
    }
    /**
     * Returns a new Int object with the Binary object's parameter in int form as its parameter.
     */
    @Override
    public Int transformtoInt(){
        int i = toInt(this.getBinary());
        return new Int(i);
    }
    /**
     * Returns the negation of a Binary object.
     * The negation of a binary is made bit to bit.
     */
    @Override
    public ILogical neg(){
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
     * Adds an IntBinary object's parameter to this Binary object's parameter.
     */
    public IntBinary sum(IntBinary n){
        return n.addingABinary(this);
    }
    /**
     * Returns a new Binary object with the sum between both Binary objects's parameters.
     */
    @Override
    public IntBinary addingABinary(Binary b){
        int bin1 = toInt(b.getBinary());
        int bin2 = toInt(this.getBinary());
        int res = bin1+bin2;
        return new Binary(intToBinary(res));
    }
    /**
     * Returns a new Int object with the sum between this object's parameter and the Int object's paramater.
     */
    @Override
    public INumbers addingAnInt(Int i){
        int bin1 = toInt(this.getBinary());
        return new Int(i.getInt()+bin1);
    }
    /**
     * Returns a new Float object with the sum between this object's parameter and the Float object's paramater.
     */
    @Override
    public INumbers addingAFloat(Float f){
        int bin1 = toInt(this.getBinary());
        return new Float(bin1+f.getFloat());
    }
    /**
     * Subtracts an IntBinary object's parameter from this Binary object's parameter.
     */
    public IntBinary sub(IntBinary n){
        return n.subtractingABinary(this);
    }
    /**
     * Returns a new Binary object with the subtraction between both Binary objects's parameters.
     */
    @Override
    public IntBinary subtractingABinary(Binary b){
        int b1 = toInt(b.getBinary());
        int b2 = toInt(this.getBinary());
        String res = intToBinary(b1-b2);
        return new Binary(res);
    }
    /**
     * Returns a new Float object with the subtraction between this object's parameter and the Float object's paramater.
     */
    @Override
    public INumbers subtractingAFloat(Float f) {
        int b = toInt(this.getBinary());
        return new Float(f.getFloat()-b);
    }
    /**
     * Returns a new Int object with the subtraction between this object's parameter and the Int object's paramater.
     */
    @Override
    public INumbers subtractingAnInt(Int i) {
        int b = toInt(this.getBinary());
        return new Int(i.getInt()-b);
    }
    /**
     * Multiplies an IntBinary object's parameter with this Binary object's parameter.
     */
    public IntBinary mult(IntBinary n){
        return n.multiplyingABinary(this);
    }
    /**
     * Returns a new Binary object with the multiplication between both Binary objects's parameters.
     */
    @Override
    public IntBinary multiplyingABinary(Binary b) {
        int b1= toInt(b.getBinary());
        int b2 = toInt(this.getBinary());
        int res = b1*b2;
        return new Binary(intToBinary(res));
    }
    /**
     * Returns a new Float object with the multiplication between this object's parameter and the Float object's paramater.
     */
    @Override
    public INumbers multiplyingAFloat(Float f) {
        int b1= toInt(this.getBinary());
        return new Float(f.getFloat()*b1);
    }
    /**
     * Returns a new Int object with the multiplication between this object's parameter and the Int object's paramater.
     */
    @Override
    public INumbers multiplyingAnInt(Int i) {
        int b1 = toInt(this.getBinary());
        return new Int(i.getInt()*b1);
    }
    /**
     * Divides this Binary object's parameter by an IntBinary object's parameter.
     */
    public IntBinary div(IntBinary n){
        return n.dividingABinary(this);
    }
    /**
     * Returns a new Float object with the division between this object's parameter and the Float object's paramater.
     */
    @Override
    public INumbers dividingAFloat(Float f) {
        int b = toInt(this.getBinary());
        return new Float(f.getFloat()/b);
    }
    /**
     * Returns a new Int object with the division between this object's parameter and the Int object's paramater.
     */
    @Override
    public INumbers dividingAnInt(Int i) {
        int b = toInt(this.getBinary());
        return new Int(i.getInt()/b);
    }
    /**
     * Returns a new Binary object with the division between both Binary objects's parameters.
     */
    @Override
    public IntBinary dividingABinary(Binary b) {
        int b1= toInt(b.getBinary());
        int b2 = toInt(this.getBinary());
        int res = b1/b2;
        return new Binary(intToBinary(res));
    }
    /**
     * Operates the logical "and" between this object's parameter and another ILogical object.
     */
    @Override
    public ILogical and(ILogical b){
        return b.andwithBinary(this);
    }
    /**
     * Returns a new Binary object with the logical operator "and" applied bit to bit between both Binary objects.
     */
    @Override
    public ILogical andwithBinary(Binary b) {
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
     * Returns a new Binary object with the logical operator "and" applied bit to bit between this Binary object and the boolean value from the Bool object.
     */
    @Override
    public ILogical andwithBool(Bool b) {
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
     * Operates the logical "or" between this object's parameter and another ILogical object.
     */
    public ILogical or(ILogical b){
        return b.orwithBinary(this);
    }
    /**
     * Returns a new Binary object with the logical operator "or" applied bit to bit between both Binary objects.
     */
    @Override
    public ILogical orwithBinary(Binary b) {
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
     * Returns a new Binary object with the logical operator "or" applied bit to bit between this Binary object and the boolean value from the Bool object.
     */
    @Override
    public ILogical orwithBool(Bool b) {
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
