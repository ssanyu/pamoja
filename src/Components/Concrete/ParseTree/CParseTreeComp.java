/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Components.Concrete.ParseTree;


import Components.CPAMOJAComponent;
import Components.Concrete.Parser.IParserComp;
import Components.INodeObject;
import GrammarNotions.ECFGNodes.CECFGNode;
import GrammarNotions.Grammar.CGrammarNodeFactory;
import Nodes.CNode;
import Nodes.CNodeFactory;
import Nodes.CNodeRep;
import java.awt.Graphics;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * This component holds a parse tree generated by any of the parser components linked to it, and maintains consistency
 * between the textual and structural representation of the parse tree. <code>ParseTreeComp</code>
 * component has a property <code>Parser</code>, which is a reference to a parser component. When a
 * <code>ParseTreeComp</code> component observes a change in a parser component’s parse tree, it
 * updates its parse tree and notifies its observers.
 * 
 * @author Jackline Ssanyu (jssanyu@kyu.ac.ug)
 */
public class CParseTreeComp extends CPAMOJAComponent implements IParseTreeComp,INodeObject,PropertyChangeListener{
    /**
     * The internal structure of a parse tree.
     */

    private CECFGNode ParseTreeStructure;
    /**
     * The string representation of a parse tree.
     */
    private String ParseTreeText;
    /**
     * A reference to a Parser object.
     */
    private IParserComp Parser;
    /**
     * Creates a new instance of <code>CParseTreeComp</code>.
     */
    public CParseTreeComp() {
         super();
    }
    /**
     * Creates a new instance of <code>CParseTreeComp</code> with this internal structure of a parse tree. 
     * @param ParseTreeStructure the internal structure of a parse tree
     */
    public CParseTreeComp(CECFGNode ParseTreeStructure) {
        this.ParseTreeStructure = ParseTreeStructure;
    }
/**
     * Paints the UI of the ParseTree component object. 
     * 
     * @param g the Parse component object to paint.
     */
   @Override
    public void paintComponent(Graphics g) {
       super.paintComponent(g);
       g.drawString("ParseTree",10, 10);
    }
    /**
     * Get the value of Parser
     *
     * @return the value of Parser
     */
    @Override
    public IParserComp getParser() {
        return Parser;
    }

    /**
     * Link to a parser component via its interface -- Set the value of the parser.
     * Register for property change events and retrieve current internal structure of a parse tree and update the internal structure of this parse tree.
     *
     * @param aParser new value of Parser
     */
    @Override
    public void setParser(IParserComp aParser) {
       CECFGNode vParseTreeStructure;
       if(Parser!=null){
              Parser.removePropertyChangeListener(this);
       }
       Parser=aParser;
       if(Parser!=null){
           Parser.addPropertyChangeListener(this);
           vParseTreeStructure=(CECFGNode)Parser.getParserResult().getNode();
       }else{
            vParseTreeStructure=null;
       }
       setParseTreeStructure(vParseTreeStructure);
    }

    
     /**
     * Get the value of ParseTreeText
     *
     * @return the value of ParseTreeText
     */
    @Override
    public String getParseTreeText(){
        return ParseTreeText;
    }
    
    /**
     * Set the value of ParseTreeTex and notify observers about <code>ParseTreeText</code> property changes.
     *
     * @param aParseTreeText new value of ParseTreeText
     */
    @Override
    public void setParseTreeText(String aParseTreeText) {
        
         // keep the old value
        String oldParseTreeText=ParseTreeText;
        // save the new value
        ParseTreeText=aParseTreeText;
        
        //ParseTreeStructure=(CECFGNode)fromText(ParseTreeText);
        // fire the property change event, with a property that has changed
        support.firePropertyChange("ParseTreeText",oldParseTreeText,ParseTreeText);
    }
 
    
    /**
     * Get the value of ParseTreeStructure
     *
     * @return the value of ParseTreeStructure
     */
    @Override
    public CECFGNode getParseTreeStructure() {
        return ParseTreeStructure;
    }

    /**
     * Sets the value of ParseTreeStructure, generates the corresponding string representation of a parse tree structure and notifies observers about <code>ParseTreeStructure</code> property changes.
     *
     * @param aParseTreeStructure
     */
    @Override
    public void setParseTreeStructure(CECFGNode aParseTreeStructure) {
        
         // keep the old value
        CECFGNode oldParseTreeStructure=ParseTreeStructure;
        // save the new value
        ParseTreeStructure=aParseTreeStructure;
        ParseTreeText=toText();
        // fire the property change event, with a property that has changed
        support.firePropertyChange("ParseTreeStructure",oldParseTreeStructure,ParseTreeStructure);
    }
   /**
     * Receives property change events and handles them. 
     * If the property change is from a parser component,
     * retrieves the parse tree value of this parser and updates itself. 
     * 
     * @param evt event object with the new value
     */
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        Object source=evt.getSource();
        if(source==Parser)
           setParseTreeStructure((CECFGNode)Parser.getParserResult().getNode());
    }
    /**
     * Returns the internal structure of the parse tree.
     *
     * @return the internal structure of this parse tree
     */
    @Override
    public CNode getNode() {
         return (CNode)ParseTreeStructure;
    }
   /**
    * Returns string representation of this parse tree.
    * @return the string representation of a parse tree
    */
   public String toText(){
       return CNodeRep.nodeTreeToString(ParseTreeStructure);//.getNode(0));
   }
   /**
    * Returns internal representation of this parse tree's string representation.
     * @param aParseTextText
    * @return the internal representation of a parse tree
    */
    public CNode fromText(String aParseTextText){
        CNodeFactory vNodeFactory=new CGrammarNodeFactory();
        CNodeRep vNodeRep=new CNodeRep();
        
        return vNodeRep.stringToNodeTree(ParseTreeText, vNodeFactory);
        
    }
    
}