

package CityBookshp_UI;


import CityBookshop_class.*;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Manager extends javax.swing.JFrame {
UserInfo AddUser=new UserInfo();
 Book Addbook= new Book();  
 BookCategory AddCategory= new BookCategory(); 
 
 
    public Manager() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtConPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        cmbUserType = new javax.swing.JComboBox();
        btnRegister = new javax.swing.JButton();
        btnRest = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtBookId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtBookName = new javax.swing.JTextField();
        txtPublisherName = new javax.swing.JTextField();
        txtAuthorName = new javax.swing.JTextField();
        txtBookQuantity = new javax.swing.JTextField();
        txtBookPrice = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnClear2 = new javax.swing.JButton();
        cmbBookCategory = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSearchBooks = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbAllBook = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        txtBookName3 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtBookId3 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtBookName2 = new javax.swing.JTextField();
        txtPublisherName2 = new javax.swing.JTextField();
        txtAuthorName2 = new javax.swing.JTextField();
        txtBookQuantity2 = new javax.swing.JTextField();
        txtBookPrice2 = new javax.swing.JTextField();
        btncClear = new javax.swing.JButton();
        btnSearch2 = new javax.swing.JButton();
        txtBookName4 = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        txtBookCategory2 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtCategoryId = new javax.swing.JTextField();
        txtCategoryName = new javax.swing.JTextField();
        btnCategory = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbAllCategory = new javax.swing.JTable();
        jLabel32 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnMExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTabbedPane4.setBackground(new java.awt.Color(153, 153, 255));
        jTabbedPane4.setForeground(new java.awt.Color(0, 0, 153));
        jTabbedPane4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registration Form");

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel2.setText("User ID");

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel3.setText("Username");

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel4.setText("Password");

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel5.setText("Confoirm Password");

        txtUserId.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        txtUserName.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        txtConPassword.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel6.setText("User Type");

        cmbUserType.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        cmbUserType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cashier", "Manager" }));

        btnRegister.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnRest.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnRest.setText("Reset");
        btnRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(116, 116, 116)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRegister)
                                .addGap(41, 41, 41)
                                .addComponent(btnRest))
                            .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                            .addComponent(txtPassword)
                            .addComponent(txtUserName)
                            .addComponent(cmbUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegister)
                    .addComponent(btnRest))
                .addContainerGap(190, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("New User Registration", jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel7.setFont(new java.awt.Font("Yu Gothic Medium", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Add New Book");

        txtBookId.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel8.setText("Book ID");

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel9.setText("Book Name");

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel10.setText("Book Category");

        jLabel11.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel11.setText("Publisher Name");

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel12.setText("Author Name");

        jLabel14.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel14.setText("Book Quantitiy");

        jLabel15.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel15.setText("Book Price ( Rs. )");

        txtBookName.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        txtPublisherName.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        txtAuthorName.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        txtBookQuantity.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        txtBookPrice.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        btnSubmit.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnClear2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnClear2.setText("Reset");
        btnClear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear2ActionPerformed(evt);
            }
        });

        cmbBookCategory.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(127, 127, 127)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBookPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBookQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBookId, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBookName, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(txtPublisherName)
                            .addComponent(txtAuthorName)
                            .addComponent(cmbBookCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(btnSubmit)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear2)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtBookId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cmbBookCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtPublisherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtAuthorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtBookQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtBookPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(btnClear2))
                .addContainerGap(210, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Add New Book", jPanel2);

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));

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
        jScrollPane1.setViewportView(tbSearchBooks);

        tbAllBook.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
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
        jScrollPane2.setViewportView(tbAllBook);

        btnSearch.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtBookName3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        txtBookName3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtBookName3.setToolTipText("");

        jLabel29.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        jLabel29.setText("All Book Details");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("Enter The Book Name");

        jLabel31.setFont(new java.awt.Font("Yu Gothic Medium", 1, 36)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("View All Books");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jScrollPane2)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtBookName3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(233, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(296, 296, 296))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(231, 231, 231))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addGap(41, 41, 41)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBookName3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane4.addTab("View All Books", jPanel4);

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));

        jLabel16.setFont(new java.awt.Font("Yu Gothic Medium", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Update Book");

        txtBookId3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel17.setText("Book ID");

        jLabel18.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel18.setText("Book Name");

        jLabel19.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel19.setText("Book Category ID");

        jLabel20.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel20.setText("Publisher Name");

        jLabel21.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel21.setText("Author Name");

        jLabel23.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel23.setText("Book Quantitiy");

        jLabel24.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel24.setText("Book Price ( Rs. )");

        txtBookName2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtPublisherName2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtAuthorName2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtBookQuantity2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtBookPrice2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        btncClear.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btncClear.setText("Reset");
        btncClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncClearActionPerformed(evt);
            }
        });

        btnSearch2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnSearch2.setText("Search");
        btnSearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch2ActionPerformed(evt);
            }
        });

        txtBookName4.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        btnUpdate.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtBookCategory2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Enter The Book Name");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(jLabel24)
                    .addComponent(jLabel23)
                    .addComponent(jLabel21))
                .addGap(124, 124, 124)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAuthorName2)
                    .addComponent(txtPublisherName2)
                    .addComponent(txtBookName2)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBookQuantity2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBookId3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBookCategory2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBookPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(185, 185, 185))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(225, 225, 225))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnSearch2)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btncClear))
                    .addComponent(txtBookName4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(321, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBookName4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnUpdate)
                                    .addComponent(btncClear)
                                    .addComponent(btnSearch2))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(txtBookId3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(txtBookName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19))
                            .addComponent(txtBookCategory2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPublisherName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txtAuthorName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBookQuantity2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24))
                    .addComponent(txtBookPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(352, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Update Books", jPanel3);

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));

        jLabel25.setFont(new java.awt.Font("Yu Gothic Medium", 1, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Add New Category");

        jLabel26.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel26.setText("Category ID");

        jLabel27.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel27.setText("Category Name");

        txtCategoryId.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        txtCategoryName.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        btnCategory.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnCategory.setText("Submit");
        btnCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoryActionPerformed(evt);
            }
        });

        tbAllCategory.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        tbAllCategory.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        tbAllCategory.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tbAllCategory);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 153));
        jLabel32.setText("All Category");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel25))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27))
                        .addGap(110, 110, 110)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCategory)
                            .addComponent(txtCategoryId, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(jLabel32))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel25)
                .addGap(49, 49, 49)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel26)
                    .addComponent(txtCategoryId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnCategory)
                .addGap(43, 43, 43)
                .addComponent(jLabel32)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Add New Category", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Script MT Bold", 1, 48)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 255));
        jLabel22.setText("City BookShop");

        jLabel13.setFont(new java.awt.Font("Script MT Bold", 1, 36)); // NOI18N
        jLabel13.setText("Welcome, Manager");

        btnMExit.setBackground(new java.awt.Color(255, 255, 255));
        btnMExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMExit.setForeground(new java.awt.Color(0, 0, 255));
        btnMExit.setText("Exit");
        btnMExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMExit)
                        .addGap(68, 68, 68))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMExit)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
           boolean vaild=true;
        
        if(txtUserId.getText().toString().isEmpty() ||
          txtUserName.getText().toString().isEmpty() ||
           txtPassword.getText().toString().isEmpty() ||
           txtConPassword.getText().toString().isEmpty()||
              cmbUserType.getSelectedItem().toString().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "File shouldn't be Blank", "Register Form", JOptionPane.ERROR_MESSAGE);
            vaild =false;
       }
        if( txtPassword.getText().toString().length()<5){
              JOptionPane.showMessageDialog(rootPane, "Password must have more than 05 Characters", "Register Form", JOptionPane.ERROR_MESSAGE);
            vaild =false;
            
        }
       if(!txtPassword.getText().toString().equals( txtConPassword.getText().toString())){
           JOptionPane.showMessageDialog(rootPane, "Password and Confirm password should match", "Register Form", JOptionPane.ERROR_MESSAGE);
           vaild =false;
       }
       if(vaild){
       AddUser.setUserId(txtUserId.getText().trim());
       AddUser.setUserName(txtUserName.getText().trim());
       AddUser.setPassword(txtPassword.getText());
       AddUser. setUserType(cmbUserType.getSelectedItem().toString());
            
             int noRows=AddUser.addUser();
              if(noRows>0){
                  JOptionPane.showMessageDialog(rootPane,"New "+AddUser.getUserType()+": "+AddUser.getUserName() +" Registered");
              }
              else{
                  JOptionPane.showMessageDialog(rootPane, "New Registration is not Valid", "Register Form", JOptionPane.ERROR_MESSAGE);
          }
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
 txtUserId.setText(AddUser.Auto_Id());
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
                 JOptionPane.showMessageDialog(rootPane, "Error searching Book","Book Form",JOptionPane.ERROR_MESSAGE);
         }
       
   
   
    try{
         ResultSet AllCategory=AddCategory.SearchAllCategory();
         int i=0;
         while(AllCategory.next())
         {
             Object BookCategoryId = AllCategory.getString("BookCategoryId");
             Object BookCategoryName= AllCategory.getString("BookCategorynName");
            
             tbAllCategory.getModel().setValueAt(BookCategoryId, i,0);
             tbAllCategory.getModel().setValueAt(BookCategoryName, i,1);
             
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
             JOptionPane.showMessageDialog(rootPane, "Book Details not Found"," Searchbook Form",JOptionPane.ERROR_MESSAGE);
         
         }
     }
     
         catch(HeadlessException | SQLException e)
         {
                 JOptionPane.showMessageDialog(rootPane, "Error searching Book Details","Searchbook Form",JOptionPane.ERROR_MESSAGE);
         
                 
                 }
    }//GEN-LAST:event_btnSearchActionPerformed

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
                        JOptionPane.showMessageDialog(null,"Book Details not Found","Updatebook Form ",JOptionPane.ERROR_MESSAGE);
                    }
            }
            catch(SQLException | HeadlessException ex){
                
                 JOptionPane.showMessageDialog(null,"Error searching Book Details"+ex,"Updatebook Form ",JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_btnSearch2ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
 try{
           Addbook.setBookId(txtBookId3.getText().trim());
           Addbook. setBookName(txtBookName2.getText().trim());
           Addbook. setBookCategoryId(txtBookCategory2.getText().trim());
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

    private void btnRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestActionPerformed
     txtUserName.setText("");
     txtPassword.setText("");
     txtConPassword.setText("");
      JOptionPane.showMessageDialog(rootPane, "Reset completed");
    }//GEN-LAST:event_btnRestActionPerformed

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
                  JOptionPane.showMessageDialog(rootPane, "Category Details are not Vaild", "Category Form", JOptionPane.ERROR_MESSAGE);
          }
        }  
    }//GEN-LAST:event_btnCategoryActionPerformed

    private void btnClear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear2ActionPerformed
        txtBookName.setText("");
        cmbBookCategory.setSelectedItem("");
        txtPublisherName.setText("");
        txtAuthorName.setText("");
        txtBookQuantity.setText("");
        txtBookPrice.setText("");
        JOptionPane.showMessageDialog(rootPane, "Reset completed");
    }//GEN-LAST:event_btnClear2ActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        boolean vaild=true;

        if(txtBookId.getText().toString().isEmpty() ||
            txtBookName.getText().toString().isEmpty() ||
            cmbBookCategory.getSelectedItem().toString().isEmpty()||
            txtPublisherName.getText().toString().isEmpty() ||
            txtAuthorName.getText().toString().isEmpty() ||
            txtBookQuantity.getText().toString().isEmpty() ||
            txtBookPrice.getText().toString().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "File shouldn't be Blank", "Addbook Form", JOptionPane.ERROR_MESSAGE);
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
                JOptionPane.showMessageDialog(rootPane, "Book Details are not Valid", "Addbook Form", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnMExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMExitActionPerformed
JFrame frame=new JFrame("Exit");
if(JOptionPane.showConfirmDialog(frame,"Confirm If you want Exit","Exit",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
{
  System.exit(0);
}   
    }//GEN-LAST:event_btnMExitActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

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
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategory;
    private javax.swing.JButton btnClear2;
    private javax.swing.JButton btnMExit;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnRest;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearch2;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btncClear;
    private javax.swing.JComboBox cmbBookCategory;
    private javax.swing.JComboBox cmbUserType;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable tbAllBook;
    private javax.swing.JTable tbAllCategory;
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
    private javax.swing.JPasswordField txtConPassword;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPublisherName;
    private javax.swing.JTextField txtPublisherName2;
    private javax.swing.JTextField txtUserId;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
