/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CashierSystem;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.event.DocumentEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 * 
 */

//Created and Design by Aldi Musneldi's team

public class CashierSystem extends javax.swing.JFrame {

    /**
     * Creates new form CashierSystem
     */
    
    //Berfungsi untuk merubah format angka kedalam bentuk uang, jadi ketika angka yang keluar melebihi ribuan maka akan menjadi 1.000 bukan 1000
    NumberFormat nf =NumberFormat.getNumberInstance(new Locale("in", "ID"));
    public CashierSystem() {
        initComponents();
        
        //Membuat menu tampil ditengah layar
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        int x = layar.width / 2 - this.getSize().width/2;
        int y = layar.height / 2 - this.getSize().height / 2;
        this.setLocation(x,y);
        
        //Untuk memproses transaksi ketika di inputkan kode barang
        kodeBarang();
        //Untuk memproses transaksi ketika diinputkan banyaknya barang yang dibeli
        Total();
    }   
    
    private void Total(){
        txtQTY.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent de) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                //Untuk menampilkan jumlah harga dari banyaknya barang yang dibeli
                try {
                    int hasil = 0;
                    if(txtQTY.getText().equals("")){
                        hasil = Integer.parseInt(txtharga.getText().replace(".", "")) * 0;
                    }else{
                        hasil = Integer.parseInt(txtharga.getText().replace(".", "")) * Integer.parseInt(txtQTY.getText());
                    }
                    txtjumlahharga.setText(nf.format(hasil));
                } catch (Exception e) {
                }
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                //Untuk menampilkan jumlah harga dari banyaknya barang yang dibeli
                try {
                    int hasil = 0;
                    if(txtQTY.getText().equals("")){
                        hasil = Integer.parseInt(txtharga.getText().replace(".", "")) * 0;
                    }else{
                        hasil = Integer.parseInt(txtharga.getText().replace(".", "")) * Integer.parseInt(txtQTY.getText());
                    }
                    txtjumlahharga.setText(nf.format(hasil));
                } catch (Exception e) {
                }
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    private void  kodeBarang(){
        txtkode.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent de) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                //Data barang untuk ditampilkan pada Informasi Barang ketika menginputkan kode barang
                String kodeBarang;
                kodeBarang = (String) txtkode.getText();
                
                switch (kodeBarang){
                    case "A001" :
                        txtnama.setText("Agar-agar Powder");
                        txtharga.setText(nf.format(5000));
                        txtsatuan.setText("pcs");
                        txtQTY.grabFocus();
                        break;
                    case "A002" :
                        txtnama.setText("BOOM");
                        txtharga.setText(nf.format(5000));
                        txtsatuan.setText("pcs");
                        txtQTY.grabFocus();
                        break;
                    case "A003" :
                        txtnama.setText("Bihun");
                        txtharga.setText(nf.format(7000));
                        txtsatuan.setText("Kg");
                        txtQTY.grabFocus();
                        break;
                    case "A004" :
                        txtnama.setText("Kerupuk Merah");
                        txtharga.setText(nf.format(14000));
                        txtsatuan.setText("Kg");
                        txtQTY.grabFocus();
                        break;
                    case "A005" :
                        txtnama.setText("Mie Kuning");
                        txtharga.setText(nf.format(14000));
                        txtsatuan.setText("Kg");
                        txtQTY.grabFocus();
                        break;
                    case "A006" :
                        txtnama.setText("Pop Mie");
                        txtharga.setText(nf.format(5000));
                        txtsatuan.setText("pcs");
                        txtQTY.grabFocus();
                        break;
                    case "A007" :
                        txtnama.setText("Sari Murni");
                        txtharga.setText(nf.format(25000));
                        txtsatuan.setText("L");
                        txtQTY.grabFocus();
                        break;
                    case "A008" :
                        txtnama.setText("Shinzui");
                        txtharga.setText(nf.format(5000));
                        txtsatuan.setText("pcs");
                        txtQTY.grabFocus();
                        break;
                    case "A009" :
                        txtnama.setText("Aqua");
                        txtharga.setText(nf.format(3000));
                        txtsatuan.setText("Botol");
                        txtQTY.grabFocus();
                        break;
                   case "A010" :
                        txtnama.setText("Sirup ABC");
                        txtharga.setText(nf.format(13000));
                        txtsatuan.setText("Botol");
                        txtQTY.grabFocus();
                        break;
                    case "A011" :
                        txtnama.setText("Sirup Marjan");
                        txtharga.setText(nf.format(20000));
                        txtsatuan.setText("Botol");
                        txtQTY.grabFocus();
                        break;
                    case "A012" :
                        txtnama.setText("Spon");
                        txtharga.setText(nf.format(5000));
                        txtsatuan.setText("pcs");
                        txtQTY.grabFocus();
                        break;
                    case "A013" :
                        txtnama.setText("Susu Tiga Sapi");
                        txtharga.setText(nf.format(12000));
                        txtsatuan.setText("Botol");
                        txtQTY.grabFocus();
                        break;
                    case "A014" :
                        txtnama.setText("Tepung Beras");
                        txtharga.setText(nf.format(7000));
                        txtsatuan.setText("pcs");
                        txtQTY.grabFocus();
                        break;
                    case "A015" :
                        txtnama.setText("Tepung Ketan");
                        txtharga.setText(nf.format(13000));
                        txtsatuan.setText("pcs");
                        txtQTY.grabFocus();
                        break;
                    case "A016" :
                        txtnama.setText("Tepung Terigu");
                        txtharga.setText(nf.format(10000));
                        txtsatuan.setText("Kg");
                        txtQTY.grabFocus();
                        break;
                    case "A017" :
                        txtnama.setText("Beras");
                        txtharga.setText(nf.format(13500));
                        txtsatuan.setText("Kg");
                        txtQTY.grabFocus();
                        break;
                    default:
                        txtnama.setText("");
                        txtharga.setText("");
                        txtsatuan.setText("");
                }
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                //Data barang untuk ditampilkan pada Informasi Barang ketika menginputkan kode barang
                String kodeBarang;
                kodeBarang = (String) txtkode.getText();
                
                switch (kodeBarang){
                    case "A001" :
                        txtnama.setText("Agar-agar Powder");
                        txtharga.setText(nf.format(5000));
                        txtsatuan.setText("pcs");
                        txtQTY.grabFocus();
                        break;
                    case "A002" :
                        txtnama.setText("BOOM");
                        txtharga.setText(nf.format(5000));
                        txtsatuan.setText("pcs");
                        txtQTY.grabFocus();
                        break;
                    case "A003" :
                        txtnama.setText("Bihun");
                        txtharga.setText(nf.format(7000));
                        txtsatuan.setText("Kg");
                        txtQTY.grabFocus();
                        break;
                    case "A004" :
                        txtnama.setText("Kerupuk Merah");
                        txtharga.setText(nf.format(14000));
                        txtsatuan.setText("Kg");
                        txtQTY.grabFocus();
                        break;
                    case "A005" :
                        txtnama.setText("Mie Kuning");
                        txtharga.setText(nf.format(14000));
                        txtsatuan.setText("Kg");
                        txtQTY.grabFocus();
                        break;
                    case "A006" :
                        txtnama.setText("Pop Mie");
                        txtharga.setText(nf.format(5000));
                        txtsatuan.setText("pcs");
                        txtQTY.grabFocus();
                        break;
                    case "A007" :
                        txtnama.setText("Sari Murni");
                        txtharga.setText(nf.format(25000));
                        txtsatuan.setText("L");
                        txtQTY.grabFocus();
                        break;
                    case "A008" :
                        txtnama.setText("Shinzui");
                        txtharga.setText(nf.format(5000));
                        txtsatuan.setText("pcs");
                        txtQTY.grabFocus();
                        break;
                    case "A009" :
                        txtnama.setText("Aqua");
                        txtharga.setText(nf.format(3000));
                        txtsatuan.setText("Botol");
                        txtQTY.grabFocus();
                        break;
                   case "A010" :
                        txtnama.setText("Sirup ABC");
                        txtharga.setText(nf.format(13000));
                        txtsatuan.setText("Botol");
                        txtQTY.grabFocus();
                        break;
                    case "A011" :
                        txtnama.setText("Sirup Marjan");
                        txtharga.setText(nf.format(20000));
                        txtsatuan.setText("Botol");
                        txtQTY.grabFocus();
                        break;
                    case "A012" :
                        txtnama.setText("Spon");
                        txtharga.setText(nf.format(5000));
                        txtsatuan.setText("pcs");
                        txtQTY.grabFocus();
                        break;
                    case "A013" :
                        txtnama.setText("Susu Tiga Sapi");
                        txtharga.setText(nf.format(12000));
                        txtsatuan.setText("Botol");
                        txtQTY.grabFocus();
                        break;
                    case "A014" :
                        txtnama.setText("Tepung Beras");
                        txtharga.setText(nf.format(7000));
                        txtsatuan.setText("pcs");
                        txtQTY.grabFocus();
                        break;
                    case "A015" :
                        txtnama.setText("Tepung Ketan");
                        txtharga.setText(nf.format(13000));
                        txtsatuan.setText("pcs");
                        txtQTY.grabFocus();
                        break;
                    case "A016" :
                        txtnama.setText("Tepung Terigu");
                        txtharga.setText(nf.format(10000));
                        txtsatuan.setText("Kg");
                        txtQTY.grabFocus();
                        break;
                    case "A017" :
                        txtnama.setText("Beras");
                        txtharga.setText(nf.format(13500));
                        txtsatuan.setText("Kg");
                        txtQTY.grabFocus();
                        break;    
                    default:
                        txtnama.setText("");
                        txtharga.setText("");
                        txtsatuan.setText("");
                }
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtkode = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        txtsatuan = new javax.swing.JTextField();
        txtnoFaktur = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        txtQTY = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtjumlahharga = new javax.swing.JTextField();
        txttagihan = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtbayar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtkembalian = new javax.swing.JTextField();
        btnHitung = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lbljumlahQty = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtkeseluruhan = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        txtnofaktur = new javax.swing.JTextField();
        txttanggal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBarang = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(10, 90, 255));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon1.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(34, 145, 216));

        jPanel3.setBackground(new java.awt.Color(34, 145, 216));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Informasi Barang", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setText("No. Faktur ");

        jLabel2.setText("Kode Barang");

        jLabel3.setText("Nama Barang");

        jLabel4.setText("Harga");

        jLabel5.setText("Satuan");

        jLabel6.setText("Qty");

        btnTambah.setText("Tambahkan");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        txtQTY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQTYActionPerformed(evt);
            }
        });

        jLabel7.setText("Jumlah Harga");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtsatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnoFaktur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtkode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtjumlahharga, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(txtQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtharga, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnoFaktur, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtkode, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtjumlahharga, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        txttagihan.setBackground(new java.awt.Color(34, 145, 216));
        txttagihan.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txttagihan.setForeground(new java.awt.Color(204, 0, 0));
        txttagihan.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Tagihan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        txttagihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttagihanActionPerformed(evt);
            }
        });

        jLabel8.setText("Bayar");

        jLabel9.setText("Kembalian");

        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jLabel10.setText("Barang Dibeli");

        jLabel11.setText("Jumlah Keseluruhan ");

        jPanel5.setBackground(new java.awt.Color(34, 145, 216));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Informasi Penjualan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        tblBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Kode Barang", "Nama Barang", "Harga", "Satuan", "Qty", "Total Harga"
            }
        ));
        jScrollPane1.setViewportView(tblBarang);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtnofaktur, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txttanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtnofaktur, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(txttanggal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbljumlahQty, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtkeseluruhan, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(229, 229, 229)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtkembalian)
                            .addComponent(txtbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHitung))
                        .addGap(0, 24, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txttagihan, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(txttagihan, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHitung)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtkeseluruhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbljumlahQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtQTYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQTYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQTYActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        //Menambahkan data Informasi barang yang diinputkan kedalam tabel ketika mengklik button Tambahkan
        if (txtQTY.getText().equals("")) {
            return;
        }else{
            DefaultTableModel model = (DefaultTableModel) tblBarang.getModel();

            Object obj [] = new Object[7];
            obj [1] = txtkode.getText();
            obj [2] = txtnama.getText();
            obj [3] = txtharga.getText();
            obj [4] = txtsatuan.getText();
            obj [5] = txtQTY.getText();
            obj [6] = txtjumlahharga.getText();

            model.addRow(obj);
            int baris = model.getRowCount();
            for(int a = 0; a < baris; a ++){
                String no = String.valueOf(a+1);
                model.setValueAt(no + ".", a, 0);
            }

            tblBarang.setRowHeight(30);
            //Menampilkan jumlah transaksi yang dilakukan
            lbljumlahQty.setText(String.valueOf(baris));
            
            //Tampilkan no faktur
            int noFaktur;
            noFaktur= Integer.parseInt(txtnoFaktur.getText());
            txtnofaktur.setText(nf.format(noFaktur));
            
            //Menampilkan tanggal
            Date tanggal = new Date();
            SimpleDateFormat tgl = new SimpleDateFormat("dd-MM-yyyy");
            txttanggal.setText(tgl.format(tanggal));
            
            //Menampilkan jumlah total keseluruhan barang dalam tabel
            jmlTotalKeseluruhan();
            //Menghapus data transaksi yang diinputkan dalam informasi barang 
            bersih();
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void txttagihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttagihanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttagihanActionPerformed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        // TODO add your handling code here:
        //Untuk melakukan proses perhitungan kembalian, jadi ketika memasukkan nominal uang bayar. Maka dengan mengklik tombol Hitung akan tampil kembalian
        int subTotal = 0;
        int kembalian;
        int Bayar;
        for (int a = 0; a < tblBarang.getRowCount(); a ++){
            subTotal += Integer.parseInt((String)
                tblBarang.getValueAt(a, 6).toString().replace(".", ""));
        }

        txtkeseluruhan.setText(nf.format(subTotal));
        Bayar = Integer.parseInt(txtbayar.getText());
        kembalian = Bayar - subTotal;
        txtkembalian.setText("Rp " + nf.format(kembalian));
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        //Untuk Menghapus semua data transaksi yang telah diinputkan ketika mengklik button Hapus
        ((DefaultTableModel)tblBarang.getModel()).setNumRows(0);

        txttagihan.setText("");
        txtkeseluruhan.setText("");
        lbljumlahQty.setText("");
        txtbayar.setText("");
        txtkembalian.setText("");
        txtnoFaktur.setText("");
        txtnofaktur.setText("");
        txttanggal.setText("");
    }//GEN-LAST:event_btnHapusActionPerformed

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
            java.util.logging.Logger.getLogger(CashierSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lbljumlahQty;
    private javax.swing.JTable tblBarang;
    private javax.swing.JTextField txtQTY;
    private javax.swing.JTextField txtbayar;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtjumlahharga;
    private javax.swing.JTextField txtkembalian;
    private javax.swing.JTextField txtkeseluruhan;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnoFaktur;
    private javax.swing.JTextField txtnofaktur;
    private javax.swing.JTextField txtsatuan;
    private javax.swing.JTextField txttagihan;
    private javax.swing.JTextField txttanggal;
    // End of variables declaration//GEN-END:variables

    private void jmlTotalKeseluruhan() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //Untuk menjumlahkan dan menampilkan jumlah keseluruhan harga dalam tabel ke jumlah keseluruhan
        int subTotal = 0;
        for (int a = 0; a < tblBarang.getRowCount(); a ++){
            subTotal += Integer.parseInt((String) 
                    tblBarang.getValueAt(a, 6).toString().replace(".", ""));
        }
        txtkeseluruhan.setText(nf.format(subTotal));
        
        //Untuk menampilkan tagihan
        txttagihan.setText("Rp "+ nf.format(subTotal));
    }

    private void bersih() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //Untuk menghilangkan data yang diinputkan ketika mengklik fitur Tambahkan
        txtkode.setText("");
        txtkode.grabFocus();
        txtQTY.setText("");
        txtjumlahharga.setText("");
    }
}
