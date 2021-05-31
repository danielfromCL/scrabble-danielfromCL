package cl.uchile.dcc.scrabble.gui;


/**
 * Abstract class that represents every possible number type in Types.
 */
public abstract class Numbers extends Types implements INumbers{

    public Numbers() {
    }

    /**
     * As default returns null.
     */
    @Override
    public INumbers sum(Float f){
        return null;
    }

    /**
     * As default returns null
     */
    @Override
    public INumbers sub(Float n){
        return null;
    }

    /**
     * As default returns null
     */
    @Override
    public INumbers div(Float n){
        return null;
    }

    /**
     * As default returns null
     */
    @Override
    public INumbers mult(Float n){
        return null;
    }

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
}
