/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;

import static compiler.Main.FindToken;
import static compiler.Main.IsCons;
import static compiler.Main.isIdentifier;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.input.KeyCode;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.jdesktop.swingx.autocomplete.*;

/**
 *
 * @author pc
 */
public class p extends javax.swing.JFrame {

    private KeyCode output;

    /**
     * Creates new form p
     */
    public p() {
        initComponents();
                String[] Lexemes={"Divisio","InferedFrom","WhetherDo","Else","Ire","Sire","Clo","SetOfClo","FBU","SFBU","NoneValue","TerminateThisNow","RingWhen","BackedValue","STT","Check","CaseOf","Beginning","End","Using"};
              List lsit = new ArrayList();
           Collections.addAll(lsit, Lexemes);
           AutoCompleteDecorator.decorate(jTextArea1, lsit, false, ObjectToStringConverter.DEFAULT_IMPLEMENTATION);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 65, 86));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 216, 118)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Goudy Stout", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 216, 118));
        jLabel1.setText("WELCOME TO SCANNER");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 252, 187), 4));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 216, 118));
        jLabel2.setText("INPUT LINES");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 216, 118), 3));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(254, 216, 118));
        jButton1.setText("SCAN");
        jButton1.setActionCommand("SCCAN");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 216, 118), 3));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 216, 118));
        jLabel3.setText("SELECT FROM PC");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 216, 118), 3));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(254, 216, 118));
        jButton2.setText("BROWSE");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 216, 118), 3));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 216, 118)));

        jTextArea1.setBackground(new java.awt.Color(0, 65, 86));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(167, 167, 167))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(322, 322, 322))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
ArrayList list=new ArrayList();
TokenData td=new TokenData();
        try {
      FileWriter myWriter = new FileWriter("E:/input.txt");
      myWriter.write(jTextArea1.getText());
      myWriter.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
        File text = new File("E:/input.txt");
        Scanner scnr = null;
        try {
            scnr = new Scanner(text);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(p.class.getName()).log(Level.SEVERE, null, ex);
        }
        String[] Lexemes={"Divisio","InferedFrom","WhetherDo","Else","Ire","Sire","Clo","SetOfClo","FBU","SFBU","NoneValue","TerminateThisNow","RingWhen","BackedValue","STT","Check","CaseOf","Beginning","End","Using"};
        String[] ReturnLexemes={"Class","Inheritance","Condition","Condition","Integer","SInteger","Character","String","Float","SFloat","Void","Break","Loop","Return","Struct","Switch","Switch","Start Statement","End Statement","Inclusion"};
        String[] singleChar={"*","+","-",".",";","@","'","\"","~","[","{","}","]","(",")",","};
        String[] ReturnsingleChar={"Arithmetic Operation","Arithmetic Operation","Arithmetic Operation","Access Operator","Delimiter","Delimiter","Quotation Mark","Quotation Mark","Logic operators","Braces","Braces","Braces","Braces","Braces","Braces","comma"};
        String[] doubleChar={"<=",">=","==","&&","||","!=","<",">","="};
        String[] RetrundoubleChar={"relational operators","relational operators","relational operators","Logic operators","Logic operators","Logic operators","relational operators","relational operators","Assignment operator"};
        int f=0,cnt_line=1;
        while(scnr.hasNextLine()) {
            int st = 0;
            String line = scnr.nextLine();
            if (f == 1) {
                String s = "";
                for (int i = 0; i < line.length() - 1; ++i) {
                    s += line.charAt(i);
                    s += line.charAt(i + 1);
                    if (s.equals("#/")) {
                        td=new TokenData(cnt_line,"#/","Matched",1,"Comment");
                        list.add(td);
                        st = i + 2;
                        f = 0;
                        break;
                    }
                    s = "";
                }
                if (f == 1) {
                    continue;
                }
            }
            String token = "";
            int pos_line = 1;
            for (int i = st; i < line.length(); ++i) {
                if (line.charAt(i) == ' ') {
                    continue;
                }
                token += line.charAt(i);
                if (FindToken(String.valueOf(line.charAt(i)), singleChar) != -1) {
                    if (token.length() >= 2) {
                        String check1 = token.substring(token.length() - 2, token.length());
                        if (check1.equals("/-")) {
                              td=new TokenData(cnt_line,"/-","Matched",(pos_line++),"Comment");
                                list.add(td);
                            break;
                        }
                    }
                    int pos = FindToken(String.valueOf(line.charAt(i)), singleChar);
                    token = token.substring(0, token.length() - 1);
                    if (!token.equals("")) {
                        if (FindToken(token, Lexemes) != -1) {
                            td=new TokenData(cnt_line,token,"Matched",(pos_line++),ReturnLexemes[FindToken(token, Lexemes)]);
                                list.add(td);
                        } else if (FindToken(token, doubleChar) != -1) {
                            int cur = FindToken(token, doubleChar);
                              td=new TokenData(cnt_line,token,"Matched",(pos_line++),RetrundoubleChar[cur]);
                                list.add(td);
                        } else if (isIdentifier(token)) {
                                 td=new TokenData(cnt_line,token,"Matched",(pos_line++),"Identifier");
                                list.add(td);
                        } else if (IsCons(token)) {
                             td=new TokenData(cnt_line,token,"Matched",(pos_line++),"constant");
                                list.add(td);
                        } else {
                            char lst = token.charAt(token.length() - 1);
                            if (lst == '=' || lst == '>' || lst == '<') {
                                token = token.substring(0, token.length() - 1);
                                if (!token.equals("")) {
                                    if (FindToken(token, Lexemes) != -1) {
                                            td=new TokenData(cnt_line,token,"Matched",(pos_line++),ReturnLexemes[FindToken(token, Lexemes)]);
                                list.add(td);
                                    } else if (FindToken(token, doubleChar) != -1) {
                                        int cur = FindToken(token, doubleChar);
                                          td=new TokenData(cnt_line,token,"Matched",(pos_line++),RetrundoubleChar[cur]);
                                list.add(td);
                                    } else if (isIdentifier(token)) {
                                         td=new TokenData(cnt_line,token,"Matched",(pos_line++),"Identifier");
                                list.add(td);
                                    } else if (IsCons(token)) {
                                           td=new TokenData(cnt_line,token,"Matched",(pos_line++),"constant");
                                           list.add(td);
                                    } else {
                                           td=new TokenData(cnt_line,token,"Not Matched",(pos_line++),"error");
                                          list.add(td);
                                    }
                                }
                                int cur = FindToken(String.valueOf(lst), doubleChar);
                                td=new TokenData(cnt_line,doubleChar[cur]," Matched",(pos_line++),RetrundoubleChar[cur]);
                                          list.add(td);
                            } else {
                                   td=new TokenData(cnt_line,token,"Not Matched",(pos_line++),"error");
                                          list.add(td);
                            }
                        }
                    }
                     td=new TokenData(cnt_line,singleChar[pos]," Matched",(pos_line++),ReturnsingleChar[pos]);
                                          list.add(td);
                    token = "";
                }
                if (token.length() >= 2) {
                    String check1 = token.substring(token.length() - 2, token.length());
                    if (check1.equals("/-")) {
                            td=new TokenData(cnt_line,"/-","Matched",(pos_line++),"Comment");
                                list.add(td);
                        break;
                    } else if (check1.equals("/#")) {
                            td=new TokenData(cnt_line,"/#","Matched",(pos_line++),"Comment");
                                list.add(td);
                        f = 1;
                        break;
                    }
                    String check2 = token.substring(token.length() - 2, token.length() - 1);
                    if (FindToken(check1, doubleChar) != -1) {
                        int pos = FindToken(check1, doubleChar);
                        token = token.substring(0, token.length() - 2);
                        if (!token.equals("")) {
                            if (FindToken(token, Lexemes) != -1) {
                                  td=new TokenData(cnt_line,token,"Matched",(pos_line++),ReturnLexemes[FindToken(token, Lexemes)]);
                                list.add(td);
                            } else if (isIdentifier(token)) {
                           td=new TokenData(cnt_line,token,"Matched",(pos_line++),"Identifier");
                                list.add(td);
                            } else if (IsCons(token)) {
                             td=new TokenData(cnt_line,token,"Matched",(pos_line++),"constant");
                                           list.add(td);
                            } else {
                           td=new TokenData(cnt_line,token,"Not Matched",(pos_line++),"error");
                                          list.add(td);
                            }
                        }
                         td=new TokenData(cnt_line,doubleChar[pos] ," Matched",(pos_line++),RetrundoubleChar[pos]);
                                          list.add(td);
                        token = "";
                    } else if (FindToken(check2, doubleChar) != -1) {
                        int pos = FindToken(check2, doubleChar);
                        token = token.substring(0, token.length() - 2);
                       if (!token.equals("")){
                        if (FindToken(token, Lexemes) != -1) {
                           td=new TokenData(cnt_line,token,"Matched",(pos_line++),ReturnLexemes[FindToken(token, Lexemes)]);
                                list.add(td);
                            
                        } else if (isIdentifier(token)) {
                          td=new TokenData(cnt_line,token,"Matched",(pos_line++),"Identifier");
                                list.add(td);
                        } else if (IsCons(token)) {
                           td=new TokenData(cnt_line,token,"Matched",(pos_line++),"constant");
                                           list.add(td);
                        } else {
                           td=new TokenData(cnt_line,token,"Not Matched",(pos_line++),"error");
                                          list.add(td);
                        }
                      td=new TokenData(cnt_line,doubleChar[pos] ," Matched",(pos_line++),RetrundoubleChar[pos]);
                                          list.add(td);
                        token = "";
                        i--;
                    }
                    }
                }
            }
            cnt_line++;
        }
        output op=new output(list);
        op.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
ArrayList list=new ArrayList();
TokenData td=new TokenData();
        JFileChooser ch=new JFileChooser();
FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
ch.setFileFilter(filter);
ch.showOpenDialog(null);
File file=ch.getSelectedFile();
String filename=file.getAbsolutePath();
File text = new File(filename);
        Scanner scnr = null;
        try {
            scnr = new Scanner(text);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(p.class.getName()).log(Level.SEVERE, null, ex);
        }
      String[] Lexemes={"Divisio","InferedFrom","WhetherDo","Else","Ire","Sire","Clo","SetOfClo","FBU","SFBU","NoneValue","TerminateThisNow","RingWhen","BackedValue","STT","Check","CaseOf","Beginning","End","Using"};
        String[] ReturnLexemes={"Class","Inheritance","Condition","Condition","Integer","SInteger","Character","String","Float","SFloat","Void","Break","Loop","Return","Struct","Switch","Switch","Start Statement","End Statement","Inclusion"};
        String[] singleChar={"*","+","-",".",";","@","'","\"","~","[","{","}","]","(",")",","};
        String[] ReturnsingleChar={"Arithmetic Operation","Arithmetic Operation","Arithmetic Operation","Access Operator","Delimiter","Delimiter","Quotation Mark","Quotation Mark","Logic operators","Braces","Braces","Braces","Braces","Braces","Braces","comma"};
        String[] doubleChar={"<=",">=","==","&&","||","!=","<",">","="};
        String[] RetrundoubleChar={"relational operators","relational operators","relational operators","Logic operators","Logic operators","Logic operators","relational operators","relational operators","Assignment operator"};
        int f=0,cnt_line=1;
        while(scnr.hasNextLine()) {
            int st = 0;
            String line = scnr.nextLine();
            if (f == 1) {
                String s = "";
                for (int i = 0; i < line.length() - 1; ++i) {
                    s += line.charAt(i);
                    s += line.charAt(i + 1);
                    if (s.equals("#/")) {
                        td=new TokenData(cnt_line,"#/","Matched",1,"Comment");
                        list.add(td);
                        st = i + 2;
                        f = 0;
                        break;
                    }
                    s = "";
                }
                if (f == 1) {
                    continue;
                }
            }
            String token = "";
            int pos_line = 1;
            for (int i = st; i < line.length(); ++i) {
                if (line.charAt(i) == ' ') {
                    continue;
                }
                token += line.charAt(i);
                if (FindToken(String.valueOf(line.charAt(i)), singleChar) != -1) {
                    if (token.length() >= 2) {
                        String check1 = token.substring(token.length() - 2, token.length());
                        if (check1.equals("/-")) {
                              td=new TokenData(cnt_line,"/-","Matched",(pos_line++),"Comment");
                                list.add(td);
                            break;
                        }
                    }
                    int pos = FindToken(String.valueOf(line.charAt(i)), singleChar);
                    token = token.substring(0, token.length() - 1);
                    if (!token.equals("")) {
                        if (FindToken(token, Lexemes) != -1) {
                            td=new TokenData(cnt_line,token,"Matched",(pos_line++),ReturnLexemes[FindToken(token, Lexemes)]);
                                list.add(td);
                        } else if (FindToken(token, doubleChar) != -1) {
                            int cur = FindToken(token, doubleChar);
                              td=new TokenData(cnt_line,token,"Matched",(pos_line++),RetrundoubleChar[cur]);
                                list.add(td);
                        } else if (isIdentifier(token)) {
                                 td=new TokenData(cnt_line,token,"Matched",(pos_line++),"Identifier");
                                list.add(td);
                        } else if (IsCons(token)) {
                             td=new TokenData(cnt_line,token,"Matched",(pos_line++),"constant");
                                list.add(td);
                        } else {
                            char lst = token.charAt(token.length() - 1);
                            if (lst == '=' || lst == '>' || lst == '<') {
                                token = token.substring(0, token.length() - 1);
                                if (!token.equals("")) {
                                    if (FindToken(token, Lexemes) != -1) {
                                            td=new TokenData(cnt_line,token,"Matched",(pos_line++),ReturnLexemes[FindToken(token, Lexemes)]);
                                list.add(td);
                                    } else if (FindToken(token, doubleChar) != -1) {
                                        int cur = FindToken(token, doubleChar);
                                          td=new TokenData(cnt_line,token,"Matched",(pos_line++),RetrundoubleChar[cur]);
                                list.add(td);
                                    } else if (isIdentifier(token)) {
                                         td=new TokenData(cnt_line,token,"Matched",(pos_line++),"Identifier");
                                list.add(td);
                                    } else if (IsCons(token)) {
                                           td=new TokenData(cnt_line,token,"Matched",(pos_line++),"constant");
                                           list.add(td);
                                    } else {
                                           td=new TokenData(cnt_line,token,"Not Matched",(pos_line++),"error");
                                          list.add(td);
                                    }
                                }
                                int cur = FindToken(String.valueOf(lst), doubleChar);
                                td=new TokenData(cnt_line,doubleChar[cur]," Matched",(pos_line++),RetrundoubleChar[cur]);
                                          list.add(td);
                            } else {
                                   td=new TokenData(cnt_line,token,"Not Matched",(pos_line++),"error");
                                          list.add(td);
                            }
                        }
                    }
                     td=new TokenData(cnt_line,singleChar[pos]," Matched",(pos_line++),ReturnsingleChar[pos]);
                                          list.add(td);
                    token = "";
                }
                if (token.length() >= 2) {
                    String check1 = token.substring(token.length() - 2, token.length());
                    if (check1.equals("/-")) {
                            td=new TokenData(cnt_line,"/-","Matched",(pos_line++),"Comment");
                                list.add(td);
                        break;
                    } else if (check1.equals("/#")) {
                            td=new TokenData(cnt_line,"/#","Matched",(pos_line++),"Comment");
                                list.add(td);
                        f = 1;
                        break;
                    }
                    String check2 = token.substring(token.length() - 2, token.length() - 1);
                    if (FindToken(check1, doubleChar) != -1) {
                        int pos = FindToken(check1, doubleChar);
                        token = token.substring(0, token.length() - 2);
                        if (!token.equals("")) {
                            if (FindToken(token, Lexemes) != -1) {
                                  td=new TokenData(cnt_line,token,"Matched",(pos_line++),ReturnLexemes[FindToken(token, Lexemes)]);
                                list.add(td);
                            } else if (isIdentifier(token)) {
                           td=new TokenData(cnt_line,token,"Matched",(pos_line++),"Identifier");
                                list.add(td);
                            } else if (IsCons(token)) {
                             td=new TokenData(cnt_line,token,"Matched",(pos_line++),"constant");
                                           list.add(td);
                            } else {
                           td=new TokenData(cnt_line,token,"Not Matched",(pos_line++),"error");
                                          list.add(td);
                            }
                        }
                         td=new TokenData(cnt_line,doubleChar[pos] ," Matched",(pos_line++),RetrundoubleChar[pos]);
                                          list.add(td);
                        token = "";
                    } else if (FindToken(check2, doubleChar) != -1) {
                        int pos = FindToken(check2, doubleChar);
                        token = token.substring(0, token.length() - 2);
                       if (!token.equals("")){
                        if (FindToken(token, Lexemes) != -1) {
                           td=new TokenData(cnt_line,token,"Matched",(pos_line++),ReturnLexemes[FindToken(token, Lexemes)]);
                                list.add(td);
                            
                        } else if (isIdentifier(token)) {
                          td=new TokenData(cnt_line,token,"Matched",(pos_line++),"Identifier");
                                list.add(td);
                        } else if (IsCons(token)) {
                           td=new TokenData(cnt_line,token,"Matched",(pos_line++),"constant");
                                           list.add(td);
                        } else {
                           td=new TokenData(cnt_line,token,"Not Matched",(pos_line++),"error");
                                          list.add(td);
                        }
                      td=new TokenData(cnt_line,doubleChar[pos] ," Matched",(pos_line++),RetrundoubleChar[pos]);
                                          list.add(td);
                        token = "";
                        i--;
                    }
                    }
                }
            }
            cnt_line++;
        }
         output op=new output(list);
        op.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(p.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(p.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(p.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(p.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new p().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
