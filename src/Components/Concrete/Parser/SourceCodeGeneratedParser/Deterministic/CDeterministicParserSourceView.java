/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Components.Concrete.Parser.SourceCodeGeneratedParser.Deterministic;

import Java.JCompilationUnit;
import Java.JFlattener;
import Java.JMethodDec;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.LinkedHashMap;
import javax.swing.DefaultListModel;

/**
 * A view for the source-code generated for a deterministic parser.
 * When linked to <code>DeterministicParser</code> component , it observes changes in the generated source-code and updates
 * its view.
 * 
 * @author Jackline Ssanyu (jssanyu@kyu.ac.ug)
 */
public class CDeterministicParserSourceView extends javax.swing.JPanel implements PropertyChangeListener{
     /**
     * A reference to SourceCodeDeterministicParserComp.
     */
    private ISourceCodeDeterministicParserComp DeterministicParser=null;
    
    private DefaultListModel<String> listModel;
    private JFlattener javaFlatener;
   
    /**
     * Creates new DeterministicParserSourceView.
     */
    public CDeterministicParserSourceView() {
        listModel = new DefaultListModel<String>();
        initComponents();
        javaFlatener = new JFlattener();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAllCode = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtProdCode = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstProductions = new javax.swing.JList(listModel);

        txtAllCode.setColumns(20);
        txtAllCode.setRows(5);
        jScrollPane3.setViewportView(txtAllCode);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("All code", jPanel1);

        jLabel1.setText("Production rules:");

        txtProdCode.setColumns(20);
        txtProdCode.setRows(5);
        jScrollPane2.setViewportView(txtProdCode);

        jLabel2.setText("Generated code:");

        lstProductions.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstProductions.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstProductionsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstProductions);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Code per Rule", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lstProductionsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstProductionsValueChanged
        // TODO add your handling code here:
        if((lstProductions.getModel().getSize()==DeterministicParser.getProdList().size()) && lstProductions.getSelectedIndex()>=0){ 
             if(!evt.getValueIsAdjusting()) { 
                String prod=(String)lstProductions.getSelectedValue();
                DeterministicParser.getProdList().entrySet().stream().forEach((_item) -> {
                    txtProdCode.setText(javaFlatener.f_MethodDeclaration(DeterministicParser.getProdList().get(prod),0));
                });
            }
    }//GEN-LAST:event_lstProductionsValueChanged
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList lstProductions;
    private javax.swing.JTextArea txtAllCode;
    private javax.swing.JTextArea txtProdCode;
    // End of variables declaration//GEN-END:variables

    /**
     * Get the SourceCodeDeterministicParser object.
     * @return the value of the SourceCodeDeterministicParser object
     */
    public ISourceCodeDeterministicParserComp getDeterministicParser() {
        return DeterministicParser;
    }
     
 /**
  * Links to <code>SourceCodeDeterministicParserComp</code> component via its interface -- Set the value of <code>DeterministicParser</code>.
  * Register for property change events and retrieve currently generated source-code of this Deterministic parser object and update the view.
  * 
  * @param aDeterministicParser source-code of the Deterministic parser
  */
   public void setDeterministicParser(ISourceCodeDeterministicParserComp aDeterministicParser){
       JCompilationUnit vParserSourceStructure;
       if(DeterministicParser!=null){
              DeterministicParser.removePropertyChangeListener(this);
       }
       DeterministicParser=aDeterministicParser;
       if(DeterministicParser!=null){
              DeterministicParser.addPropertyChangeListener(this);
              vParserSourceStructure=DeterministicParser.getParserSourceStructure();
              updateSourceCodeView(vParserSourceStructure);
              updateProductionsList(DeterministicParser.getProdList());
       }else{
            vParserSourceStructure=new JCompilationUnit("");
            updateSourceCodeView(vParserSourceStructure);
       }
     
    }
     /**
     * Receives property change events and handles them. If the property change is from the <code>SourceCodeDeterministicParser</code> component.
     * Retrieve the source-code and update this view. 
     * 
     * @param evt event object with the new value
     */
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        Object source=evt.getSource();
        if(source==DeterministicParser){
           updateSourceCodeView(DeterministicParser.getParserSourceStructure());
           updateProductionsList(DeterministicParser.getProdList());
        }
    }
    
    /**
     * Updates this view with the given parser source.
     * 
     * @param aParserSourceStructure the JCompilation unit for this parser.
     */
    public void updateSourceCodeView(JCompilationUnit aParserSourceStructure){
        if(aParserSourceStructure!=null){
          txtAllCode.setText(javaFlatener.f_CompilationUnit(aParserSourceStructure,1));
        }else txtAllCode.setText("");
    }
    
    /**
     *
     * @param aProdcutionsList
     */
    public void updateProductionsList(LinkedHashMap<String,JMethodDec> aProdcutionsList){
        listModel.clear();
        lstProductions.setSelectedIndex(-1);
        aProdcutionsList.entrySet().stream().forEach((me) -> {
            listModel.addElement(me.getKey());
        });
       lstProductions.setSelectedIndex(0); 
    }
    
    /**
     * Resets the view.
     */
    public void clear(){
        txtAllCode.setText(" ");
        listModel.clear();
        lstProductions.setSelectedIndex(-1);
        txtProdCode.setText(" ");
    }
    
}
