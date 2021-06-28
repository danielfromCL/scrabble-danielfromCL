package cl.uchile.dcc.scrabble.gui.types;


import static java.lang.Math.abs;

/**
 * Abstract class that represents every possible number type in Types.
 */
public abstract class Numbers extends Types{
    /**
     * Returns an integer from the String representation of a binary number.
     */
    public int toInt(String binary){
        if(bitToInt(binary.charAt(0))== 0){
            return positiveBinToInt(binary);
        }
        return negativeBinaryToInt(binary);
    }
    private int negativeBinaryToInt(String binary){
        int n = binary.length() -1;
        int w = -bitToInt(binary.charAt(0))*(int) Math.pow(2,n);
        for(int i = n, j = 0; i>0; i--, j++){
            w += (int) Math.pow(2,j) * (binary.charAt(i) == '1' ? 1:0);
        }
        return w;
    }
    private int positiveBinToInt(String binary){
        int w= 0;
        for (int i = binary.length()-1, j= 0; i>0; i--, j++){
            w+=(int) Math.pow(2,j) * bitToInt(binary.charAt(i));
        }
        return w;
    }
    private int bitToInt(char bit){
        return bit == '0' ? 0:1;
    }
    /**
     * Returns a String with the binary representation of an integer.
     */
    public String intToBinary(int i){
        if (i==0){
            return "0";
        }
        String b = positiveIntToBin(abs(i));
        if (i<0){
            b = twosComplement(b);
        }
        return b;
    }
    private String positiveIntToBin(int n){
        String integerString =n+"";
        return "0"+Integer.toBinaryString(Integer.parseInt(integerString));
    }
    private String twosComplement(String binary){
        StringBuilder str = new StringBuilder();
        str.append(binary);
        int n = str.length();
        int i;
        for (i = n-1 ; i >= 0 ; i--)
            if (str.charAt(i) == '1')
                break;
        if (i == -1)
            return "1" + str;
        for (int k = i-1 ; k >= 0; k--)
        {
            if (str.charAt(k) == '1')
                str.replace(k, k+1, "0");
            else
                str.replace(k, k+1, "1");
        }
        return str.toString();
    }



}
