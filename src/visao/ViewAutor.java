package visao;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Autor;
import model.dao.AutorDAO;

public class ViewAutor extends javax.swing.JInternalFrame {

    public ViewAutor() {
        initComponents();
        DefaultTableModel tableAutor= (DefaultTableModel) jTableAutor.getModel();
        jTableAutor.setRowSorter(new TableRowSorter(tableAutor));
        readjtable();
    }
    
    public void setPosicao() {
    Dimension d = this.getDesktopPane().getSize();
    this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jId = new javax.swing.JTextField();
        jNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jData = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCidade = new javax.swing.JComboBox<>();
        Jestado = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPais = new javax.swing.JComboBox<>();
        jBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAutor = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formulario Autor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel1.setText("id.:");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel2.setText("Nome.:");

        jId.setEditable(false);
        jId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIdActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel3.setText("Data Nascimento.:");

        jData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDataActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel4.setText("Cidade.:");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel5.setText("Estado.:");

        jCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Chapeco", "Xaxim", "Quilombo", "São Paulo", "Rio de Janeiro", "Minas Gerais", "outros" }));
        jCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCidadeActionPerformed(evt);
            }
        });

        Jestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Santa Catarina", "São Paulo", "Minas Gerais", "Paraná", "Rio Grande do Sul", "Rio de Janeiro" }));
        Jestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JestadoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel6.setText("Pais.:");

        jPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Brasil", "Estado Unidos", "Argentina", "Rusia", "Peru", "Chile", "Paraguai" }));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/zoom.png"))); // NOI18N
        btnBuscar.setText("Pesquisar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jId, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jNome)
                            .addComponent(Jestado, 0, 257, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(11, 11, 11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jData)
                            .addComponent(jPais, 0, 228, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addContainerGap())
        );

        jTableAutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Data Nascimento", "Cidade", "Estado", "Pais"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAutorMouseClicked(evt);
            }
        });
        jTableAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableAutorKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAutor);

        btnExcluir.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/delete.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnGravar.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        btnGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/disk.png"))); // NOI18N
        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icon/pencil.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 36, Short.MAX_VALUE))
        );

        setBounds(0, 0, 949, 574);
    }// </editor-fold>//GEN-END:initComponents

    private void jIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jIdActionPerformed

    private void jDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDataActionPerformed

    private void jCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCidadeActionPerformed

    private void JestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JestadoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(jTableAutor.getSelectedRow()!= -1){
            Autor autor = new Autor();
            AutorDAO dao = new AutorDAO();

            autor.setNome(jNome.getText());
            autor.setDt_nasc(jData.getText());
            autor.setCidade(jCidade.getSelectedItem().toString());
            autor.setEstado(Jestado.getSelectedItem().toString());
            autor.setPais(jPais.getSelectedItem().toString());
            autor.setId((int)jTableAutor.getValueAt(jTableAutor.getSelectedRow(), 0));
            
            dao.update(autor);

            jNome.setText("");
            jData.setText("");
            jCidade.setToolTipText("");
            Jestado.setToolTipText("");
            jPais.setToolTipText("");
       
            readjtable();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        Autor autor = new Autor();
        AutorDAO dao = new AutorDAO();

        autor.setNome(jNome.getText());
        autor.setDt_nasc(jData.getText());
        autor.setCidade(jCidade.getSelectedItem().toString());
        autor.setEstado(Jestado.getSelectedItem().toString());
        autor.setPais(jPais.getSelectedItem().toString());

        dao.create(autor);
                
        jNome.setText("");
        jData.setText("");
        jCidade.setToolTipText("");
        Jestado.setToolTipText("");
        jPais.setToolTipText("");
        
        readjtable();
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        readjtableBuscar(jBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jTableAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAutorMouseClicked
        if(jTableAutor.getSelectedRow()!= -1){
            jId.setText(jTableAutor.getValueAt(jTableAutor.getSelectedRow(), 0).toString());
            jNome.setText(jTableAutor.getValueAt(jTableAutor.getSelectedRow(), 1).toString());
            jData.setText(jTableAutor.getValueAt(jTableAutor.getSelectedRow(), 2).toString());
            jCidade.setSelectedItem(jTableAutor.getValueAt(jTableAutor.getSelectedRow(), 3));
            Jestado.setSelectedItem(jTableAutor.getValueAt(jTableAutor.getSelectedRow(), 4));
            jPais.setSelectedItem(jTableAutor.getValueAt(jTableAutor.getSelectedRow(), 5));
        }
    }//GEN-LAST:event_jTableAutorMouseClicked

    private void jTableAutorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableAutorKeyReleased
        if(jTableAutor.getSelectedRow()!= -1){
            jId.setText(jTableAutor.getValueAt(jTableAutor.getSelectedRow(), 0).toString());
            jNome.setText(jTableAutor.getValueAt(jTableAutor.getSelectedRow(), 1).toString());
            jData.setText(jTableAutor.getValueAt(jTableAutor.getSelectedRow(), 2).toString());
            jCidade.setSelectedItem(jTableAutor.getValueAt(jTableAutor.getSelectedRow(), 3));
            Jestado.setSelectedItem(jTableAutor.getValueAt(jTableAutor.getSelectedRow(), 4));
            jPais.setSelectedItem(jTableAutor.getValueAt(jTableAutor.getSelectedRow(), 5));
        }
    }//GEN-LAST:event_jTableAutorKeyReleased

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       if(jTableAutor.getSelectedRow()!= -1){
            Autor autor = new Autor();
            AutorDAO dao = new AutorDAO();

            autor.setId((int)jTableAutor.getValueAt(jTableAutor.getSelectedRow(), 0));
            
            dao.delete(autor);

            jNome.setText("");
            jData.setText("");
            jCidade.setToolTipText("");
            Jestado.setToolTipText("");
            jPais.setToolTipText("");

            readjtable();
        }else{
            JOptionPane.showMessageDialog(null, "Nescessario Selecionar o Registro a ser excluido!");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    public void readjtable(){
       // jTableAutor tableuser = (tableuser) usuario.getModel();
        DefaultTableModel tableAutor = (DefaultTableModel) jTableAutor.getModel();
        tableAutor.setNumRows(0);
        
        AutorDAO udao = new AutorDAO();
        for (Autor u: udao.read()){
            tableAutor.addRow(new Object[]{
                u.getId(),
                u.getNome(),
                u.getDt_nasc(),
                u.getCidade(),
                u.getEstado(),
                u.getPais()
            });
        }
    }
    
    public void readjtableBuscar(String Autor){
        DefaultTableModel tableAutor = (DefaultTableModel) jTableAutor.getModel();
        tableAutor.setNumRows(0);
        
        AutorDAO adao = new AutorDAO();
        for (Autor autor: adao.readBuscar(Autor)){
            tableAutor.addRow(new Object[]{
                autor.getId(),
                autor.getNome(),
                autor.getDt_nasc(),
                autor.getCidade(),
                autor.getEstado(),
                autor.getPais()
            });
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Jestado;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JTextField jBuscar;
    private javax.swing.JComboBox<String> jCidade;
    private javax.swing.JFormattedTextField jData;
    private javax.swing.JTextField jId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jNome;
    private javax.swing.JComboBox<String> jPais;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAutor;
    // End of variables declaration//GEN-END:variables
}
