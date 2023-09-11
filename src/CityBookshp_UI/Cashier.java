
package CityBookshp_UI;

import CityBookshop_class.*;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Cashier extends javax.swing.JFrame {
Book Addbook= new Book();
BookCategory AddCategory= new BookCategory();

    public Cashier() {
        initComponents();
      
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtBookId = new javax.swing.JTextField();
        txtBookName = new javax.swing.JTextField();
        txtBookQuantity = new javax.swing.JTextField();
        cmbBookCategory = new javax.swing.JComboBox();
        txtBookPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPublisherName = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtAuthorName = new javax.swing.JTextField();
        btnClear2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAllBook = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbSearchBooks = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        txtBookName3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtBookId3 = new javax.swing.JTextField();
        txtBookName2 = new javax.swing.JTextField();
        txtBookQuantity2 = new javax.swing.JTextField();
        txtBookPrice2 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtPublisherName2 = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        txtAuthorName2 = new javax.swing.JTextField();
        btnSearch2 = new javax.swing.JButton();
        txtBookName4 = new javax.swing.JTextField();
        btncClear = new javax.swing.JButton();
        txtBookCategory2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tbAllCategory = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCategoryId = new javax.swing.JTextField();
        txtCategoryName = new javax.swing.JTextField();
        btnCategory = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbAllCategory2 = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnCExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTabbedPane2.setBackground(new java.awt.Color(102, 102, 255));
        jTabbedPane2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add New Book");

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel2.setText("Book ID");

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel3.setText("Book Name");

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel4.setText("Book Category");

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel5.setText("Book Quantity");

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel6.setText("Book Price ( Rs. )");

        txtBookId.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N

        txtBookName.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N

        txtBookQuantity.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N

        cmbBookCategory.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N

        txtBookPrice.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel7.setText("Publisher Name");

        txtPublisherName.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N

        btnSubmit.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel9.setText("Author Name");

        txtAuthorName.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N

        btnClear2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnClear2.setText("Clear");
        btnClear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBookPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbBookCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBookId, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPublisherName, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAuthorName, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBookQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btnSubmit)
                                .addGap(31, 31, 31)
                                .addComponent(btnClear2)))))
                .addGap(0, 158, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBookId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbBookCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPublisherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAuthorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtBookQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtBookPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSubmit)
                    .addComponent(btnClear2))
                .addContainerGap(227, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Add New Book", jPanel1);

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        tbAllBook.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        tbAllBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Book ID", "Book Name", "Book Category ID", "Publisher Name", "Author Name", "Quantitiy", "Price"
            }
        ));
        jScrollPane1.setViewportView(tbAllBook);

        tbSearchBooks.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        tbSearchBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Book ID", "Book Name", "Book Category ID", "Publisher Name", "Author Name", "Quantitiy", "Price"
            }
        ));
        jScrollPane3.setViewportView(tbSearchBooks);

        btnSearch.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtBookName3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        jLabel14.setText("All Book Details");

        jLabel15.setFont(new java.awt.Font("Yu Gothic Medium", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("View All Books");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Enter The  Book Name");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel15))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtBookName3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearch))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel14)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBookName3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("View All Books", jPanel2);

        jPanel5.setBackground(new java.awt.Color(102, 102, 255));

        jLabel20.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel20.setText("Book ID");

        jLabel21.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel21.setText("Book Name");

        jLabel22.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel22.setText("Book Category ID");

        jLabel23.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel23.setText("Book Quantitiy");

        jLabel24.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel24.setText("Book Price ( Rs. )");

        txtBookId3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        txtBookName2.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        txtBookQuantity2.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        txtBookPrice2.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel25.setText("PublisherName");

        txtPublisherName2.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        btnUpdate.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel27.setText("Author Name");

        txtAuthorName2.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        btnSearch2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnSearch2.setText("Search");
        btnSearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch2ActionPerformed(evt);
            }
        });

        txtBookName4.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        btncClear.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btncClear.setText("Clear");
        btncClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncClearActionPerformed(evt);
            }
        });

        txtBookCategory2.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Yu Gothic Medium", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Update Books");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Enter The Book Name");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 246, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(200, 200, 200))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20)
                            .addComponent(jLabel22)
                            .addComponent(jLabel25)
                            .addComponent(jLabel27)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBookName2, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(txtPublisherName2)
                            .addComponent(txtAuthorName2)
                            .addComponent(txtBookQuantity2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBookPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBookCategory2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBookId3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBookName4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btnSearch2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btncClear))
                            .addComponent(jLabel18))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addGap(4, 4, 4)
                .addComponent(txtBookName4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch2)
                    .addComponent(btnUpdate)
                    .addComponent(btncClear))
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBookId3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(txtBookName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(txtBookCategory2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPublisherName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAuthorName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtBookQuantity2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtBookPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(383, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 723, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 899, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Update Books", jPanel3);

        tbAllCategory.setBackground(new java.awt.Color(102, 102, 255));

        jLabel8.setFont(new java.awt.Font("Yu Gothic Medium", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Add New Category");

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel10.setText("Category ID");

        jLabel11.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel11.setText("Category Name");

        txtCategoryId.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        txtCategoryName.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        btnCategory.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnCategory.setText("Submit");
        btnCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoryActionPerformed(evt);
            }
        });

        tbAllCategory2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        tbAllCategory2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Category ID", "Category Name"
            }
        ));
        jScrollPane2.setViewportView(tbAllCategory2);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 51, 204));
        jLabel19.setText("All Category");

        javax.swing.GroupLayout tbAllCategoryLayout = new javax.swing.GroupLayout(tbAllCategory);
        tbAllCategory.setLayout(tbAllCategoryLayout);
        tbAllCategoryLayout.setHorizontalGroup(
            tbAllCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbAllCategoryLayout.createSequentialGroup()
                .addGroup(tbAllCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tbAllCategoryLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel8))
                    .addGroup(tbAllCategoryLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(tbAllCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(tbAllCategoryLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(83, 83, 83)
                                .addGroup(tbAllCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCategoryId, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCategory)))))
                    .addGroup(tbAllCategoryLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tbAllCategoryLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel19)))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        tbAllCategoryLayout.setVerticalGroup(
            tbAllCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbAllCategoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tbAllCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCategoryId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tbAllCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCategory)
                .addGap(31, 31, 31)
                .addComponent(jLabel19)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(281, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Add New Category", tbAllCategory);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Script MT Bold", 1, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 204));
        jLabel12.setText("City BookShop");

        jLabel13.setFont(new java.awt.Font("Script MT Bold", 1, 36)); // NOI18N
        jLabel13.setText("Welcome, Cashier");

        btnCExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCExit.setForeground(new java.awt.Color(0, 0, 255));
        btnCExit.setText("Exit");
        btnCExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(179, 179, 179))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCExit)
                        .addContainerGap())))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(btnCExit))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 715, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
       boolean vaild=true;

        if(txtBookId.getText().toString().isEmpty() ||
            txtBookName.getText().toString().isEmpty() ||
            cmbBookCategory.getSelectedItem().toString().isEmpty()||
            txtPublisherName.getText().toString().isEmpty() ||
            txtAuthorName.getText().toString().isEmpty() ||
            txtBookQuantity.getText().toString().isEmpty() ||

            txtBookPrice.getText().toString().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "File shouldn't be Blank", "AddBook Form", JOptionPane.ERROR_MESSAGE);
            vaild =false;
        }
        if(vaild){
            Addbook.setBookId(txtBookId.getText().trim());
            Addbook.setBookName(txtBookName.getText());
            Addbook.setBookCategoryId(Addbook.BookCategoryId(cmbBookCategory.getSelectedItem().toString()));
            Addbook.setPublisherName(txtPublisherName.getText().trim());
            Addbook.setAuthorName(txtAuthorName.getText().trim());
            Addbook.setBookQuantitiy(Integer.parseInt(txtBookQuantity.getText().trim()));

            Addbook.setBookPrice(Integer.parseInt(txtBookPrice.getText().trim()));

            int noRows= Addbook.addBook();
            if(noRows>0){
                JOptionPane.showMessageDialog(rootPane,"New Book "+Addbook.getBookName()+" Details Inserted");
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Book Details are not Vaild", "AddBook Form", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       txtBookId.setText( Addbook.Auto_Id());
       txtCategoryId.setText(AddCategory.Auto_Id());
       String BookCategorynName[]=(Addbook.getCategoryName());
       cmbBookCategory.setModel(new javax.swing.DefaultComboBoxModel(BookCategorynName)); 
      
       
       try{
         ResultSet Allbook=Addbook.SearchAllBooks();
         int i=0;
         while(Allbook.next())
         {
             Object BookId = Allbook.getString("BookId");
             Object BookName=Allbook.getString("BookName");
             Object BookCategoryId = Allbook.getString("BookCategoryId");
             Object PublisherName = Allbook.getString("PublisherName");
             Object AuthorName = Allbook.getString("AuthorName");
             Object BookQuantity =Integer.parseInt(Allbook.getString("BookQuantitiy"));
             Object BookPrice = Integer.parseInt(Allbook.getString("BookPrice"));
            
             tbAllBook.getModel().setValueAt(BookId, i,0);
             tbAllBook.getModel().setValueAt(BookName, i,1);
             tbAllBook.getModel().setValueAt(BookCategoryId , i,2);
             tbAllBook.getModel().setValueAt(PublisherName, i,3);
             tbAllBook.getModel().setValueAt (AuthorName, i,4);
             tbAllBook.getModel().setValueAt(BookQuantity, i,5);
             tbAllBook.getModel().setValueAt(BookPrice, i,6);
            i++;
          
         }
      }
     
         catch(HeadlessException | SQLException e)
         {
                 JOptionPane.showMessageDialog(rootPane, "Error Searching Book","AllBook Form",JOptionPane.ERROR_MESSAGE);
         }
       
       
       try{
         ResultSet AllCategory=AddCategory.SearchAllCategory();
         int i=0;
         while(AllCategory.next())
         {
             Object BookCategoryId = AllCategory.getString("BookCategoryId");
             Object BookCategoryName= AllCategory.getString("BookCategorynName");
            
             tbAllCategory2.getModel().setValueAt(BookCategoryId, i,0);
             tbAllCategory2.getModel().setValueAt(BookCategoryName, i,1);
             
            i++;
          
         }
      }
     
         catch(HeadlessException | SQLException e)
         {
                 JOptionPane.showMessageDialog(rootPane, "Error searching Category","Category Form",JOptionPane.ERROR_MESSAGE);
         }
   
       
       
       
    }//GEN-LAST:event_formWindowOpened

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
          try{
         ResultSet SearchBook=Addbook.SearchBooks(txtBookName3.getText());
         int i=0;
         if(SearchBook.next())
         {
             Object BookId=SearchBook.getString("BookId");
             Object BookName=SearchBook.getString("BookName");
             Object BookCategoryId=SearchBook.getString("BookCategoryId");
             Object PublisherName= SearchBook.getString("PublisherName");
             Object AuthorName= SearchBook.getString("AuthorName");
             Object BookQuantity=Integer.parseInt(SearchBook.getString("BookQuantitiy"));
             Object BookPrice = Integer.parseInt(SearchBook.getString("BookPrice"));
           
                     
              tbSearchBooks.getModel().setValueAt(BookId, i,0);
              tbSearchBooks.getModel().setValueAt(BookName, i,1);
              tbSearchBooks.getModel().setValueAt(BookCategoryId , i,2);
              tbSearchBooks.getModel().setValueAt(PublisherName, i,3);
              tbSearchBooks.getModel().setValueAt (AuthorName, i,4);
              tbSearchBooks.getModel().setValueAt(BookQuantity, i,5);
              tbSearchBooks.getModel().setValueAt(BookPrice, i,6);
                i++;
                JOptionPane.showMessageDialog(rootPane, "Book Details Found");
         }
         else{
             JOptionPane.showMessageDialog(rootPane, "Book Details not Found","SearchBook Form",JOptionPane.ERROR_MESSAGE);
         
         }
     }
     
         catch(HeadlessException | SQLException e)
         {
                 JOptionPane.showMessageDialog(rootPane, "Error Searching Book Details","SearchBook Form",JOptionPane.ERROR_MESSAGE);
         
                 
                 }
     
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
  try{
          Addbook.setBookId(txtBookId3.getText().trim());
          Addbook. setBookName(txtBookName2.getText().trim());
          Addbook.setBookCategoryId(txtBookCategory2.getText().toString().trim());
          Addbook.setPublisherName(txtPublisherName2.getText().trim());
          Addbook.setAuthorName(txtAuthorName2.getText().trim());
          Addbook.setBookQuantitiy(Integer.parseInt(txtBookQuantity2.getText().trim()));
          Addbook.setBookPrice(Integer.parseInt(txtBookPrice2.getText().trim()));
    
      
      int noRows = Addbook. UpdateBook();
      if (noRows>0){
          JOptionPane.showMessageDialog(rootPane,"Book Details Updated");
      }
       }
     catch( HeadlessException ex){
          JOptionPane.showMessageDialog(rootPane,"Book Details are not Valid","Updatebook Form",JOptionPane.ERROR_MESSAGE);
      }
       
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch2ActionPerformed
           try{
                  
               ResultSet SearchBook= Addbook.SearchBooks(txtBookName4.getText());
                    if(SearchBook.next())
                    {
                       txtBookId3.setText(SearchBook.getString("BookId"));
                       txtBookName2.setText(SearchBook.getString("BookName"));
                       txtBookCategory2.setText(SearchBook.getString("BookCategoryId"));
                       txtPublisherName2.setText(SearchBook.getString("PublisherName"));
                       txtAuthorName2.setText(SearchBook.getString("AuthorName"));
                       txtBookQuantity2.setText(SearchBook.getString("BookQuantitiy"));
                       txtBookPrice2.setText(SearchBook.getString("BookPrice"));
                                         
                    JOptionPane.showMessageDialog(null,"Book Details Fount");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Book Details not found","UpdateBook Form ",JOptionPane.ERROR_MESSAGE);
                    }
            }
            catch(SQLException | HeadlessException ex){
                
                 JOptionPane.showMessageDialog(null,"Error Searching Data"+ex,"UpdateBook Form ",JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_btnSearch2ActionPerformed

    private void btncClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncClearActionPerformed
     txtBookName4.setText("");
        txtBookId3.setText("");
     txtBookName2.setText("");
      txtBookCategory2.setText("");
     txtPublisherName2.setText("");
     txtAuthorName2.setText("");
     txtBookQuantity2.setText("");
    txtBookPrice2.setText("");
     JOptionPane.showMessageDialog(rootPane, "Reset completed");
    }//GEN-LAST:event_btncClearActionPerformed

    private void btnClear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear2ActionPerformed
      
     txtBookName.setText("");
      cmbBookCategory.setSelectedItem("");
     txtPublisherName.setText("");
     txtAuthorName.setText("");
     txtBookQuantity.setText("");
    txtBookPrice.setText("");
     JOptionPane.showMessageDialog(rootPane, "Reset completed");
    }//GEN-LAST:event_btnClear2ActionPerformed

    private void btnCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryActionPerformed
      boolean vaild=true;
        
        if(txtCategoryId.getText().toString().isEmpty() ||
           txtCategoryName.getText().toString().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "File shouldn't be Blank", "Category Form", JOptionPane.ERROR_MESSAGE);
            vaild =false;
        }
         if(vaild){
            AddCategory.setBookCategoryId(txtCategoryId.getText().trim());
            AddCategory.setBookCategorynName(txtCategoryName.getText());
          
             int noRows= AddCategory.addCategory();
              if(noRows>0){
                  JOptionPane.showMessageDialog(rootPane,"New Category Inserted");
              }
              else{
                  JOptionPane.showMessageDialog(rootPane, "Category Details are not Valid", "Category Form", JOptionPane.ERROR_MESSAGE);
          }
        }  
    }//GEN-LAST:event_btnCategoryActionPerformed

    private void btnCExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCExitActionPerformed
        JFrame frame=new JFrame("Exit");
if(JOptionPane.showConfirmDialog(rootPane,"Confirm if you want Exit","Exit",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
{
  System.exit(0);
}   
    }//GEN-LAST:event_btnCExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cashier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCExit;
    private javax.swing.JButton btnCategory;
    private javax.swing.JButton btnClear2;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearch2;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btncClear;
    private javax.swing.JComboBox cmbBookCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable tbAllBook;
    private javax.swing.JPanel tbAllCategory;
    private javax.swing.JTable tbAllCategory2;
    private javax.swing.JTable tbSearchBooks;
    private javax.swing.JTextField txtAuthorName;
    private javax.swing.JTextField txtAuthorName2;
    private javax.swing.JTextField txtBookCategory2;
    private javax.swing.JTextField txtBookId;
    private javax.swing.JTextField txtBookId3;
    private javax.swing.JTextField txtBookName;
    private javax.swing.JTextField txtBookName2;
    private javax.swing.JTextField txtBookName3;
    private javax.swing.JTextField txtBookName4;
    private javax.swing.JTextField txtBookPrice;
    private javax.swing.JTextField txtBookPrice2;
    private javax.swing.JTextField txtBookQuantity;
    private javax.swing.JTextField txtBookQuantity2;
    private javax.swing.JTextField txtCategoryId;
    private javax.swing.JTextField txtCategoryName;
    private javax.swing.JTextField txtPublisherName;
    private javax.swing.JTextField txtPublisherName2;
    // End of variables declaration//GEN-END:variables
}
