/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SLR.SLRGenerator;

/**
 *
 * @author jssanyu
 */
public class COutput {
    private int A;   // Number of a NonTerminal A
    private int i;   // index in a multistick expression
    private int l;  // length of a multidot expression
    
    /**
     *
     */
    public COutput(){
        A=-1;
        i=-1;
        l=-1;
    }
    
    /**
     *
     * @return
     */
    public int getA(){
        return A;
    }

    /**
     *
     * @param vA
     */
    public void setA(int vA){
        A=vA;
    }
    
    /**
     *
     * @return
     */
    public int getI(){
        return i;
    }

    /**
     *
     * @param aI
     */
    public void setI(int aI){
        i=aI;
    }

    /**
     *
     * @return
     */
    public int getL(){
        return l;
    }

    /**
     *
     * @param aL
     */
    public void setL(int aL){
        l=aL;
    }
    
    @Override
    public String toString(){
        return "("+ A +","+ i +"," + l +")";
    }
}
