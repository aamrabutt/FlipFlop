package javaapplication7;
import java.io.*;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;
public class NewJFrame extends javax.swing.JFrame {
    
    static int interval;
    static Timer timer;
    int count,n1,n2;
    int arr1[];
    String arr2[];
    boolean check;
    int ifWin;
    
    public NewJFrame() {
              
        myTimer1();
        initComponents();

        count=0;
        n1=0;
        n2=0;
        ifWin=0;
        check=false;
        arr1=new int [18];            // array to keep track of picture
        arr2=new String [9];         // picture path
        arr2[0]="C:\\Users\\user\\Desktop\\s1.png";
        arr2[1]="C:\\Users\\user\\Desktop\\s2.png";
        arr2[2]="C:\\Users\\user\\Desktop\\s3.png";
        arr2[3]="C:\\Users\\user\\Desktop\\s4.png";
        arr2[4]="C:\\Users\\user\\Desktop\\s5.png";
        arr2[5]="C:\\Users\\user\\Desktop\\s6.png";
        arr2[6]="C:\\Users\\user\\Desktop\\s7.png";
        arr2[7]="C:\\Users\\user\\Desktop\\s8.png";
        arr2[8]="C:\\Users\\user\\Desktop\\s9.png";
        func();
  
    }
   void  myTimer1()
    {
        int delay = 1000;
        int period = 1000;
        timer = new Timer();
        interval = 180;
        timer.scheduleAtFixedRate(new TimerTask() {

        public void run() {
            jLabel3.setText(Integer.toString(setInterval()));

        }
    }, delay, period);

    }
   private static final int setInterval()
   {
        if (interval == 1)
        {
            timer.cancel();
            JOptionPane.showMessageDialog(null,"Time up!!! You lost");
        }
            
        return --interval;
    }

    void func()
    {
        int []arr=new int [9];
        for(int i=0;i<9;i++)
            arr[i]=0;
        int index=0;
        //Random rn=new Random();
        Random rn=new Random();
        for(int i=0;i<100;i++)
        {
            int nn= rn.nextInt((8 - 0) + 1) + 0;
            if(arr[nn]<=1)
            {
                arr[nn]=arr[nn]+1;
                arr1[index++]=nn;
                System.out.print(" n is :"+nn+"   ");
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton32 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(857, 530));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/smily.PNG"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/smily.PNG"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/smily.PNG"))); // NOI18N
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/smily.PNG"))); // NOI18N
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/smily.PNG"))); // NOI18N
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/smily.PNG"))); // NOI18N
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/smily.PNG"))); // NOI18N
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/smily.PNG"))); // NOI18N
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/smily.PNG"))); // NOI18N
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/smily.PNG"))); // NOI18N
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/smily.PNG"))); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/smily.PNG"))); // NOI18N
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/smily.PNG"))); // NOI18N
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/smily.PNG"))); // NOI18N
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/smily.PNG"))); // NOI18N
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/smily.PNG"))); // NOI18N
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/smily.PNG"))); // NOI18N
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication7/smily.PNG"))); // NOI18N
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(0, 255, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 204));
        jLabel1.setText("Time : ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 204));
        jLabel3.setText("0");

        jButton32.setText("Reset");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 309, Short.MAX_VALUE)
                .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // button no 12
        jButton21.setIcon(new ImageIcon (arr2[arr1[11]]));

        if(n1==0)
        {
            n1=12;
            count++;
        }
        else if(n2==0 && n1!=12)
        {
             n2=12;
             count++;
        }
        
        if(count==2)
        {
            //ifWin=ifWin+2;
            checkCards();
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // button no 18
        jButton31.setIcon(new ImageIcon (arr2[arr1[17]]));

        if(n1==0)
        {
            n1=18;
            count++;
        }
        else if(n2==0 && n1!=18)
        {
             n2=18;
             count++;
        }
        
        if(count==2)
        {
            //ifWin=ifWin+2;
            checkCards();
        }
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // Button no 1
        jButton14.setIcon(new ImageIcon (arr2[arr1[0]]));
//        String ss=jButton14.getIcon().toString();
//        System.out.print(ss);
        
        if(n1==0)
        {
            n1=1;
            count++;
        }
        else if(n2==0 && n1!=1)
        {
             n2=1;
             count++;
        }
        
        if(count==2)
        {
            //ifWin=ifWin+2;
            checkCards();
        }                                        
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // button no 5
        jButton18.setIcon(new ImageIcon (arr2[arr1[4]]));

        if(n1==0)
        {
            n1=5;
            count++;
        }
        else if(n2==0 && n1!=5)
        {
             n2=5;
             count++;
        }
        
        if(count==2)
        {
           // ifWin=ifWin+2;
            checkCards();
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // button no 2
        jButton15.setIcon(new ImageIcon (arr2[arr1[1]]));

        if(n1==0)
        {
            n1=2;
            count++;
        }
        else if(n2==0 && n1!=2)
        {
             n2=2;
             count++;
        }
        
        if(count==2)
        {
           // ifWin=ifWin+2;
            checkCards();
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // button no 3
        jButton17.setIcon(new ImageIcon (arr2[arr1[2]]));

        if(n1==0)
        {
            n1=3;
            count++;
        }
        else if(n2==0 && n1!=3)
        {
             n2=3;
             count++;
        }
        
        if(count==2)
        {
            //ifWin=ifWin+2;
            checkCards();
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // button no 4
        jButton20.setIcon(new ImageIcon (arr2[arr1[3]]));

        if(n1==0)
        {
            n1=4;
            count++;
        }
        else if(n2==0 && n1!=4)
        {
             n2=4;
             count++;
        }
        
        if(count==2)
        {
           // ifWin=ifWin+2;
            checkCards();
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // button no 6
        jButton23.setIcon(new ImageIcon (arr2[arr1[5]]));

        if(n1==0)
        {
            n1=6;
            count++;
        }
        else if(n2==0 && n1!=6)
        {
             n2=6;
             count++;
        }
        
        if(count==2)
        {
           // ifWin=ifWin+2;
            checkCards();
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // button no 7
        jButton19.setIcon(new ImageIcon (arr2[arr1[6]]));

        if(n1==0)
        {
            n1=7;
            count++;
        }
        else if(n2==0 && n1!=7)
        {
             n2=7;
             count++;
        }
        
        if(count==2)
        {
           // ifWin=ifWin+2;
            checkCards();
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // button no 8
        jButton26.setIcon(new ImageIcon (arr2[arr1[7]]));

        if(n1==0)
        {
            n1=8;
            count++;
        }
        else if(n2==0 && n1!=8)
        {
             n2=8;
             count++;
        }
        
        if(count==2)
        {
           // ifWin=ifWin+2;
            checkCards();
        }
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // button 9
        jButton24.setIcon(new ImageIcon (arr2[arr1[8]]));

        if(n1==0)
        {
            n1=9;
            count++;
        }
        else if(n2==0 && n1!=9)
        {
             n2=9;
             count++;
        }
        
        if(count==2)
        {
           // ifWin=ifWin+2;
            checkCards();
        }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // button 10
        jButton29.setIcon(new ImageIcon (arr2[arr1[9]]));

        if(n1==0)
        {
            n1=10;
            count++;
        }
        else if(n2==0 && n1!=10)
        {
             n2=10;
             count++;
        }
        
        if(count==2)
        {
          //  ifWin=ifWin+2;
            checkCards();
        }
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // button 11
        jButton16.setIcon(new ImageIcon (arr2[arr1[10]]));

        if(n1==0)
        {
            n1=11;
            count++;
        }
        else if(n2==0 && n1!=11)
        {
             n2=11;
             count++;
        }
        
        if(count==2)
        {
           // ifWin=ifWin+2;
            checkCards();
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // button  no 13
        jButton22.setIcon(new ImageIcon (arr2[arr1[12]]));

        if(n1==0)
        {
            n1=13;
            count++;
        }
        else if(n2==0 && n1!=13)
        {
             n2=13;
             count++;
        }
        
        if(count==2)
        {
            //ifWin=ifWin+2;
            checkCards();
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // button no 14
        jButton25.setIcon(new ImageIcon (arr2[arr1[13]]));

        if(n1==0)
        {
            n1=14;
            count++;
        }
        else if(n2==0 && n1!=14)
        {
             n2=14;
             count++;
        }
        
        if(count==2)
        {
           // ifWin=ifWin+2;
            checkCards();
        }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // button no 15
        jButton27.setIcon(new ImageIcon (arr2[arr1[14]]));

        if(n1==0)
        {
            n1=15;
            count++;
        }
        else if(n2==0 && n1!=15)
        {
             n2=15;
             count++;
        }
        
        if(count==2)
        {
           // ifWin=ifWin+2;
            checkCards();
        }
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // button no 16
        jButton28.setIcon(new ImageIcon (arr2[arr1[15]]));

        if(n1==0)
        {
            n1=16;
            count++;
        }
        else if(n2==0 && n1!=16)
        {
             n2=16;
             count++;
        }
        
        if(count==2)
        {
            //ifWin=ifWin+2;
            checkCards();
        }
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // button no 17
        jButton30.setIcon(new ImageIcon (arr2[arr1[16]]));

        if(n1==0)
        {
            n1=17;
            count++;
        }
        else if(n2==0 && n1!=17)
        {
             n2=17;
             count++;
        }
        
        if(count==2)
        {
            //ifWin=ifWin+2;
            checkCards();
        }
    }//GEN-LAST:event_jButton30ActionPerformed
    public void myFunc()
    {
        //f1.setVisible(false);
        timer.cancel();
        jLabel3.setText("0");
        myTimer1();
        count=0;
        n1=0;
        n2=0;
        ifWin=0;
        check=false;
        jButton14.setVisible(true);
        jButton15.setVisible(true);
        jButton16.setVisible(true);
        jButton17.setVisible(true);     
        jButton18.setVisible(true);
        jButton19.setVisible(true);
        jButton20.setVisible(true);
        jButton21.setVisible(true);
        jButton22.setVisible(true);
        jButton23.setVisible(true);
        jButton24.setVisible(true);
        jButton25.setVisible(true);
        jButton26.setVisible(true);
        jButton27.setVisible(true);
        jButton28.setVisible(true);
        jButton29.setVisible(true);
        jButton30.setVisible(true);
        jButton31.setVisible(true);
        
        jButton14.setIcon(img);
        jButton15.setIcon(img);
        jButton16.setIcon(img);
        jButton17.setIcon(img);
        jButton18.setIcon(img);
        jButton19.setIcon(img);
        jButton20.setIcon(img);
        jButton21.setIcon(img);
        jButton22.setIcon(img);
        jButton23.setIcon(img);
        jButton24.setIcon(img);
        jButton25.setIcon(img);
        jButton26.setIcon(img);
        jButton27.setIcon(img);
        jButton28.setIcon(img);
        jButton29.setIcon(img);
        jButton30.setIcon(img);
        jButton31.setIcon(img);
        func();
    }
    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // Reset
        myFunc();
    }//GEN-LAST:event_jButton32ActionPerformed
   

    void checkCards()
    {
        new Thread (new Runnable()
        {
            public void run()
            {
            try
            {
                Thread.sleep(1000); 
                update(); 
            }
            catch(Exception e)
            {
            }
        }
        }).start();
    }
    void update()
    {
        if(arr2[arr1[n1-1]].equals(arr2[arr1[n2-1]]))
            check=true;
        if(check==true)
        {
            //System.out.print("\n n1 is: "+n1+"n2 is : "+n2);
            //System.out.print("\n path1 is : "+arr2[arr1[n1-1]]);
            //System.out.print("\n path 2 is : "+arr2[arr1[n2-1]]);
            ifWin=ifWin+2;
            
            
            if(n1==1 || n2==1)
            {
                jButton14.setVisible(false);
            }
            if(n1==2  || n2==2)
            {
                jButton15.setVisible(false);
            }
            if(n1==3 || n2==3)
            {
                jButton17.setVisible(false);
            }
            if(n1==4 || n2==4)
            {
                jButton20.setVisible(false);
            }
            if(n1==5 || n2==5)
            {
                jButton18.setVisible(false);
            }
            if(n1==6 || n2==6)
            {
                jButton23.setVisible(false);
            }
            if(n1==7 || n2==7)
            {
                jButton19.setVisible(false);
            }
            if(n1==8 || n2==8)
            {
                jButton26.setVisible(false);
            }
            if(n1==9 || n2==9)
            {
                jButton24.setVisible(false);
            }
            if(n1==10 || n2==10)
            {
                jButton29.setVisible(false);
            }
            if(n1==11 || n2==11)
            {
                jButton16.setVisible(false);
            }
            if(n1==12 || n2==12)
            {
                jButton21.setVisible(false);
            }
            if(n1==13 || n2==13)
            {
                jButton22.setVisible(false);
            }
            if(n1==14 || n2==14)
            {
                jButton25.setVisible(false);
            }
            if(n1==15 || n2==15)
            {
                jButton27.setVisible(false);
            }
            if(n1==16 || n2==16)
            {
                jButton28.setVisible(false);
            }
            if(n1==17 || n2==17)
            {
                jButton30.setVisible(false);
            }
            if(n1==18 || n2==18)
            {
                jButton31.setVisible(false);
            }
        }
        if(check==false)
        {
            //System.out.print("does not match ");
            if(n1==1 || n2==1)
            {
                jButton14.setIcon(img);
            }
            if(n1==2  || n2==2)
            {
                jButton15.setIcon(img);
            }
            if(n1==3 || n2==3)
            {
                jButton17.setIcon(img);
            }
            if(n1==4 || n2==4)
            {
                jButton20.setIcon(img);
            }
            if(n1==5 || n2==5)
            {
                jButton18.setIcon(img);
            }
            if(n1==6 || n2==6)
            {
                jButton23.setIcon(img);
            }
            if(n1==7 || n2==7)
            {
                jButton19.setIcon(img);
            }
            if(n1==8 || n2==8)
            {
                jButton26.setIcon(img);
            }
            if(n1==9 || n2==9)
            {
                jButton24.setIcon(img);
            }
            if(n1==10 || n2==10)
            {
                jButton29.setIcon(img);
            }
            if(n1==11 || n2==11)
            {
                jButton16.setIcon(img);
            }
            if(n1==12 || n2==12)
            {
                jButton21.setIcon(img);
            }
            if(n1==13 || n2==13)
            {
                jButton22.setIcon(img);
            }
            if(n1==14 || n2==14)
            {
                jButton25.setIcon(img);
            }
            if(n1==15 || n2==15)
            {
                jButton27.setIcon(img);
            }
            if(n1==16 || n2==16)
            {
                jButton28.setIcon(img);
            }
            if(n1==17 || n2==17)
            {
                jButton30.setIcon(img);
            }
            if(n1==18 || n2==18)
            {
                jButton31.setIcon(img);
            }
        }
        count=0;
        n1=0;
        n2=0;
        check=false;
        if(ifWin==18)
        {
            
            String s;
            int score=1;
            s=jLabel3.getText();
            System.out.print(s);
            try{
            score=Integer.parseInt(s);
            score=180-score;
            score=(score*180)/100;
            
            FileWriter fw=new FileWriter("C:\\Users\\user\\documents\\jav\\input.txt",true);
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter pw=new PrintWriter(bw);
            pw.print(Integer.toString(score));
            }
            catch(Exception e){}
            JOptionPane.showMessageDialog(null," You Won  !!\n Your Score : "+score);
            jLabel3.setText("0");
            System.out.print("Score : "+score);
            System.exit(0);
        }
            
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
    javax.swing.Icon img=new javax.swing.ImageIcon(getClass().getResource("smily.png"));
}