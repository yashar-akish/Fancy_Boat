
package Boat;

import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Play extends javax.swing.JFrame {

    
    
    static int delay = 10;
    static int i = 100;
    //Runnable newDelay;
    //boolean state = false;
    static int HH ;//= 0;
    static int SS;
    //Time t1;
    TimeThread t1;
    //int S;
    //
    //private int spd = 500;
    private Timer tmr;
    //
    //Publisher pub =  new Publisher();
    //Listener move = new Listener(pub);
    static boolean move = true;
    
    public int x ;//= jLabel1.getLocation().x;
    public int y;// = jLabel1.getLocation().y;

    
    public Play() {
        initComponents();
        setSize(850, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        JPanel panel = new JPanel();
        panel.setSize(700, 400);
        panel.setLocation(20, 20);
        panel.setBackground(Color.gray);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.setLayout(new GridLayout(4,3,0,0));
        add(panel);
        panel.add(jLabel1);
        fast.setSelected(true);
        				
        speed.setText(String.valueOf(20));
 
        t1 = new TimeThread(jProgressBar1);
        t1.start();
    }

    
    class TimeThread extends Thread{
        JProgressBar bar;
        
        TimeThread(JProgressBar bar){
            bar = jProgressBar1;
        }
        public void run(){
            
            for(i = 100; i >= 0 ; i--){
                try {
                    xs.setText(String.valueOf(x));
                    ys.setText(String.valueOf(y));
                    jProgressBar1.setValue(i);
                    
                    if(i == 0){
                        jLabel1.setLocation(x, y);
                        tmr.stop();
                    }
                    if(move == false){
                        
                    }
                    sleep(delay*100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Play.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        fast = new javax.swing.JRadioButton();
        normal = new javax.swing.JRadioButton();
        slow = new javax.swing.JRadioButton();
        speed = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        xp = new javax.swing.JLabel();
        yp = new javax.swing.JLabel();
        xs = new javax.swing.JLabel();
        ys = new javax.swing.JLabel();
        refill = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boat/s.png"))); // NOI18N
        jLabel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel1KeyPressed(evt);
            }
        });

        jButton1.setText("Right ");
        jButton1.setToolTipText("");
        jButton1.setActionCommand("Right");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Left");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Up");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Down");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Stop");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        fast.setText("fast");
        fast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fastActionPerformed(evt);
            }
        });

        normal.setText("normal");
        normal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normalActionPerformed(evt);
            }
        });

        slow.setText("slow");
        slow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slowActionPerformed(evt);
            }
        });

        speed.setText("jLabel2");

        jLabel2.setText("speed:");

        jLabel3.setText("m / s");

        jLabel4.setText("Gas level");

        jProgressBar1.setForeground(new java.awt.Color(0, 255, 255));

        xp.setText("X:");

        yp.setText("Y:");

        refill.setText("refill");
        refill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(normal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(slow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(refill)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                                .addComponent(xp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(xs, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(yp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ys, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(speed, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(slow)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(normal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fast)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(speed, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yp)
                            .addComponent(refill)
                            .addComponent(xp))
                        .addComponent(xs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ys, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    ///******************************************************************key event
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

        
    }//GEN-LAST:event_formKeyPressed

    private void jLabel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel1KeyPressed

    }//GEN-LAST:event_jLabel1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ///RIGHT
        
        HH = 3;
        move = true;

        tmr = new Timer(delay , new ActionListener() {
                    
            Dimension scrn = Toolkit.getDefaultToolkit().getScreenSize();
                    
            @Override
            public void actionPerformed(ActionEvent e) {
                int maxX = scrn.width - jLabel1.getWidth() + 60;
                if (x < maxX && HH == 3) {
                    x++;
                    jLabel1.setLocation(x, y);
                } else {
                    ((Timer)e.getSource()).stop();
                }
            }
        });tmr.start();
        fast.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                SS=1;
                if(fast.isSelected()&&SS==1){
                    slow.setSelected(false);
                    normal.setSelected(false);
                }
                delay = 10;
                tmr.stop();
                tmr.setDelay( delay );
                speed.setText(String.valueOf(20));
                tmr.start();
            }
        });
        slow.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                SS=2;
                if(slow.isSelected()&&SS==2){
                    fast.setSelected(false);
                    normal.setSelected(false);
                }
                delay = 50;
                tmr.stop();
                tmr.setDelay( delay );
                speed.setText(String.valueOf(5));
               
                tmr.start();
            }
        });
        normal.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                SS=3;
                if(normal.isSelected()&&SS==3){
                    slow.setSelected(false);
                    fast.setSelected(false);
                }
                delay = 30;
                tmr.stop();
                tmr.setDelay( delay );
                speed.setText(String.valueOf(10));
                         
                tmr.start();
            }
        });   
         
      
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //LEFT
        HH = 4;
        move = true;
        tmr = new Timer(delay , new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (x > 10 && HH == 4) {
                    x--;
                    jLabel1.setLocation(x, y);
                } else {
                    ((Timer)e.getSource()).stop();
                }
            }
        });tmr.start();
        fast.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                SS=1;
                if(fast.isSelected()&&SS==1){
                    slow.setSelected(false);
                    normal.setSelected(false);
                }
                delay = 10;
                tmr.stop();
                tmr.setDelay( delay );
                speed.setText(String.valueOf(20));
                
                tmr.start();
            }
        });
        slow.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                SS=2;
                if(slow.isSelected()&&SS==2){
                    fast.setSelected(false);
                    normal.setSelected(false);
                }
                delay = 50;
                tmr.stop();
                tmr.setDelay( delay );
                speed.setText(String.valueOf(5));
               
                tmr.start();
            }
        });
        normal.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                SS=3;
                if(normal.isSelected()&&SS==3){
                    slow.setSelected(false);
                    fast.setSelected(false);
                }
                delay = 30;
                tmr.stop();
                tmr.setDelay(delay);
                speed.setText(String.valueOf(10));
                         
                tmr.start();
            }
        }); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //UP
        move = true;
        HH = 1;
        tmr = new Timer(delay , new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (y > -20 && HH == 1) {
                    y--;
                    jLabel1.setLocation(x, y);
                    } else {
                        ((Timer)e.getSource()).stop();
                    }
                }
        });tmr.start();
        fast.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                SS=1;
                if(fast.isSelected()&&SS==1){
                    slow.setSelected(false);
                    normal.setSelected(false);
                }
                delay = 10;
                tmr.stop();
                tmr.setDelay( delay );
                speed.setText(String.valueOf(20));
                
                tmr.start();
            }
        });
        slow.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                SS=2;
                if(slow.isSelected()&&SS==2){
                    fast.setSelected(false);
                    normal.setSelected(false);
                }
                delay = 50;
                tmr.stop();
                tmr.setDelay( delay );
                speed.setText(String.valueOf(5));
               
                tmr.start();
            }
        });
        normal.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                SS=3;
                if(normal.isSelected()&&SS==3){
                    slow.setSelected(false);
                    fast.setSelected(false);
                }
                delay = 30;
                tmr.stop();
                tmr.setDelay( 20 );
                speed.setText(String.valueOf(10));
                         
                tmr.start();
            }
        }); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        //DOWN
        HH = 2;
        move = true;
        tmr = new Timer(delay , new ActionListener() {
        Dimension scrn = Toolkit.getDefaultToolkit().getScreenSize();
        @Override
        public void actionPerformed(ActionEvent e) {
            int maxY = scrn.height - jLabel1.getHeight() - 300; 
                if (y < maxY && HH == 2) {
                    y++;
                    jLabel1.setLocation(x, y);
                } else {
                    ((Timer)e.getSource()).stop();
                }
            }
        });tmr.start();
        fast.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                SS=1;
                if(fast.isSelected()&&SS==1){
                    slow.setSelected(false);
                    normal.setSelected(false);
                }
                delay = 10;
                tmr.stop();
                tmr.setDelay( delay );
                speed.setText(String.valueOf(20));
                
                tmr.start();
            }
        });
        slow.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                SS=2;
                if(slow.isSelected()&&SS==2){
                    fast.setSelected(false);
                    normal.setSelected(false);
                }
                delay = 50;
                tmr.stop();
                tmr.setDelay( delay );
                speed.setText(String.valueOf(5));
               
                tmr.start();
            }
        });
        normal.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                SS=3;
                if(normal.isSelected()&&SS==3){
                    slow.setSelected(false);
                    fast.setSelected(false);
                }
                delay = 30;
                tmr.stop();
                tmr.setDelay( delay );
                speed.setText(String.valueOf(10));
                         
                tmr.start();
            }
        });  
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        //STOP
        HH = 5;
        jLabel1.setLocation(x, y);
        move = false;
                
    }//GEN-LAST:event_jButton5ActionPerformed

    private void slowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slowActionPerformed
        // TODO add your handling code here:
//        if(slow.isSelected()){
//            fast.setSelected(false);
//            normal.setSelected(false);
//            delay = 20;
//            speed.setText(String.valueOf(5));
//            //Publisher pub =  new Publisher();
//            //pub.setDelay(20);
//            //Runnable delay = 
//            new TimeRefresh(pub,20);
//            //new Thread(delay).start();
//            //Listener move = new Listener(pub);
//        }
        
        //speed.setText(String.valueOf(5));
    }//GEN-LAST:event_slowActionPerformed

    private void normalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normalActionPerformed
        // TODO add your handling code here:
//        if(normal.isSelected()){
//            slow.setSelected(false);
//            fast.setSelected(false);
//            delay = 10;
//            speed.setText(String.valueOf(delay));
//            
//            //pub.setDelay(10);
//            Runnable Ndelay = new TimeRefresh(pub,10);
//            new Thread(Ndelay).start();
//            //Listener move = new Listener(pub);
//        }
    }//GEN-LAST:event_normalActionPerformed

    private void fastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fastActionPerformed
        // TODO add your handling code here:
//        if(fast.isSelected()){
//            slow.setSelected(false);
//            normal.setSelected(false);
//            delay  = 1;
//            speed.setText(String.valueOf(15));
//            //Publisher pub =  new Publisher();
//            //pub.setDelay(3);
//            Runnable Ndelay = new TimeRefresh(pub,3);
//            new Thread(Ndelay).start();
//            //Listener move = new Listener(pub);
//        }
    }//GEN-LAST:event_fastActionPerformed

    private void refillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refillActionPerformed
        // TODO add your handling code here:
        i = 100;
        jProgressBar1.setValue(i);
    }//GEN-LAST:event_refillActionPerformed
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=
    
    //+++++++++++++++++++++++++++++==
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
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Play().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton fast;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton normal;
    private javax.swing.JButton refill;
    private javax.swing.JRadioButton slow;
    private javax.swing.JLabel speed;
    private javax.swing.JLabel xp;
    private javax.swing.JLabel xs;
    private javax.swing.JLabel yp;
    private javax.swing.JLabel ys;
    // End of variables declaration//GEN-END:variables
}
