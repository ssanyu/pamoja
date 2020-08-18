/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Components.Concrete.Parser.SourceCodeGeneratedParser.Deterministic;

import java.beans.*;

/**
 * An implementation of a Java's BeanInfo interface to restrict the SourceCodeDeterministicParser's features exposed to the public. That is, the properties, methods and events.
 *
 * 
 * 
 * @author Jackline Ssanyu (jssanyu@kyu.ac.ug)
 */
public class CSourceCodeDeterministicParserCompBeanInfo extends SimpleBeanInfo{
       // Bean descriptor information will be obtained from introspection.                          
    private static BeanDescriptor beanDescriptor = null;
    private static BeanDescriptor getBdescriptor(){
                              

    // Here you can add code for customizing the BeanDescriptor.
     // create the bean descriptor object
        beanDescriptor = new BeanDescriptor(CSourceCodeDeterministicParserComp.class,null);
        // set the display name
        beanDescriptor.setDisplayName("Rec.Des.Parser");
        beanDescriptor.setShortDescription("A component which generates source-code for a recursive deterministic parser from a given grammar.");
         return beanDescriptor;     }                         
    // Property identifiers
    private static final int PROPERTY_ParserName = 0;
    private static final int PROPERTY_Grammar = 1;
    private static final int PROPERTY_TreeBuilder = 2;
    //private static final int PROPERTY_UseLookAhead = 3;
    private static final int PROPERTY_TreeBuilding = 3;
    private static final int PROPERTY_ParserSourceText=4;
    private static final int PROPERTY_ParserSourceStructure=5;
    
   
    // Properties information will be obtained from introspection.                      
    private static PropertyDescriptor[] properties = null;
    private static PropertyDescriptor[] getPdescriptor(){
                          

    // Here you can add code for customizing the properties array.
         properties = new PropertyDescriptor[6];

        try {
             properties[PROPERTY_ParserName] = new PropertyDescriptor ( "ParserName", CSourceCodeDeterministicParserComp.class, "getParserName", "setParserName" ); // NOI18N
             properties[PROPERTY_Grammar] = new PropertyDescriptor ( "Grammar", CSourceCodeDeterministicParserComp.class, "getGrammar", "setGrammar" ); // NOI18N
             properties[PROPERTY_TreeBuilder] = new PropertyDescriptor ( "TreeBuilder", CSourceCodeDeterministicParserComp.class, "getTreeBuilder", "setTreeBuilder" ); // NOI18N
            // properties[PROPERTY_UseLookAhead] = new PropertyDescriptor ( "UseLookAhead", CLimBacktrackerParserComp.class, "isUseLookAhead", "setUseLookAhead" ); // NOI18N
             properties[PROPERTY_TreeBuilding] = new PropertyDescriptor ( "TreeBuilding", CSourceCodeDeterministicParserComp.class, "isTreeBuilding", "setTreeBuilding" ); // NOI18N
             properties[PROPERTY_ParserSourceText] = new PropertyDescriptor ( "ParserSourceText", CSourceCodeDeterministicParserComp.class, "getParserSourceText", "setParserSourceText" ); // NOI18N
             properties[PROPERTY_ParserSourceStructure] = new PropertyDescriptor ( "ParserSourceStructure", CSourceCodeDeterministicParserComp.class, "getParserSourceStructure", "setParserSourceStructure" ); // NOI18N
             properties[PROPERTY_ParserSourceStructure].setDisplayName ( "ParserSourceStructure" );
             properties[PROPERTY_ParserSourceStructure].setShortDescription ( "Internal representation (Java AST) of the Recursive descent Source code" );
          
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }

        return properties;     }                     
    // EventSet identifiers
    private static final int EVENT_propertyChangeListener = 0;
    // Event set information will be obtained from introspection.                  
    private static EventSetDescriptor[] eventSets = null;
    private static EventSetDescriptor[] getEdescriptor(){
                      

    // Here you can add code for customizing the event sets array.
      eventSets = new EventSetDescriptor[1];

        try {
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( CSourceCodeDeterministicParserComp.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }
        return eventSets;     }                 

    // Method information will be obtained from introspection.                   
    private static MethodDescriptor[] methods = null;
    private static MethodDescriptor[] getMdescriptor(){
                       

    // Here you can add code for customizing the methods array.
    
        return methods;     }                  

    private static java.awt.Image iconColor16 = null;                    
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;                  
    private static String iconNameC16 = null;                 
    private static String iconNameC32 = null;
    private static String iconNameM16 = null;
    private static String iconNameM32 = null;               

    private static int defaultPropertyIndex = -1;               
    private static int defaultEventIndex = -1;             

    
                      

    // Here you can add code for customizing the Superclass BeanInfo.

                     
	
    /**
     * Gets the bean's <code>BeanDescriptor</code>s.
     * 
     * @return BeanDescriptor describing the editable
     * properties of this bean.  May return null if the
     * information should be obtained by automatic analysis.
     */
    public BeanDescriptor getBeanDescriptor() {
	return getBdescriptor();
    }

    /**
     * Gets the bean's <code>PropertyDescriptor</code>s.
     * 
     * @return An array of PropertyDescriptors describing the editable
     * properties supported by this bean.  May return null if the
     * information should be obtained by automatic analysis.
     * <p>
     * If a property is indexed, then its entry in the result array will
     * belong to the IndexedPropertyDescriptor subclass of PropertyDescriptor.
     * A client of getPropertyDescriptors can use "instanceof" to check
     * if a given PropertyDescriptor is an IndexedPropertyDescriptor.
     */
    public PropertyDescriptor[] getPropertyDescriptors() {
	return getPdescriptor();
    }

    /**
     * Gets the bean's <code>EventSetDescriptor</code>s.
     * 
     * @return  An array of EventSetDescriptors describing the kinds of 
     * events fired by this bean.  May return null if the information
     * should be obtained by automatic analysis.
     */
    public EventSetDescriptor[] getEventSetDescriptors() {
	return getEdescriptor();
    }

    /**
     * Gets the bean's <code>MethodDescriptor</code>s.
     * 
     * @return  An array of MethodDescriptors describing the methods 
     * implemented by this bean.  May return null if the information
     * should be obtained by automatic analysis.
     */
    public MethodDescriptor[] getMethodDescriptors() {
	return getMdescriptor();
    }

    /**
     * A bean may have a "default" property that is the property that will
     * mostly commonly be initially chosen for update by human's who are 
     * customizing the bean.
     * @return  Index of default property in the PropertyDescriptor array
     * 		returned by getPropertyDescriptors.
     * <P>	Returns -1 if there is no default property.
     */
    public int getDefaultPropertyIndex() {
        return defaultPropertyIndex;
    }

    /**
     * A bean may have a "default" event that is the event that will
     * mostly commonly be used by human's when using the bean. 
     * @return Index of default event in the EventSetDescriptor array
     *		returned by getEventSetDescriptors.
     * <P>	Returns -1 if there is no default event.
     */
    public int getDefaultEventIndex() {
        return defaultEventIndex;
    }

    /**
     * This method returns an image object that can be used to
     * represent the bean in toolboxes, toolbars, etc.   Icon images
     * will typically be GIFs, but may in future include other formats.
     * <p>
     * Beans aren't required to provide icons and may return null from
     * this method.
     * <p>
     * There are four possible flavors of icons (16x16 color,
     * 32x32 color, 16x16 mono, 32x32 mono).  If a bean choses to only
     * support a single icon we recommend supporting 16x16 color.
     * <p>
     * We recommend that icons have a "transparent" background
     * so they can be rendered onto an existing background.
     *
     * @param  iconKind  The kind of icon requested.  This should be
     *    one of the constant values ICON_COLOR_16x16, ICON_COLOR_32x32, 
     *    ICON_MONO_16x16, or ICON_MONO_32x32.
     * @return  An image object representing the requested icon.  May
     *    return null if no suitable icon is available.
     */
    public java.awt.Image getIcon(int iconKind) {
        switch ( iconKind ) {
        case ICON_COLOR_16x16:
            if ( iconNameC16 == null )
                return null;
            else {
                if( iconColor16 == null )
                    iconColor16 = loadImage( iconNameC16 );
                return iconColor16;
            }
        case ICON_COLOR_32x32:
            if ( iconNameC32 == null )
                return null;
            else {
                if( iconColor32 == null )
                    iconColor32 = loadImage( iconNameC32 );
                return iconColor32;
            }
        case ICON_MONO_16x16:
            if ( iconNameM16 == null )
                return null;
            else {
                if( iconMono16 == null )
                    iconMono16 = loadImage( iconNameM16 );
                return iconMono16;
            }
        case ICON_MONO_32x32:
            if ( iconNameM32 == null )
                return null;
            else {
                if( iconMono32 == null )
                    iconMono32 = loadImage( iconNameM32 );
                return iconMono32;
            }
	default: return null;
        }
    }

    
}