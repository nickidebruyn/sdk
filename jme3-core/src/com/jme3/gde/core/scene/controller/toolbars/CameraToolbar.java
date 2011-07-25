
/*
 * NewJPanel.java <p/> Created on 20 juil. 2011, 14:50:22
 */
package com.jme3.gde.core.scene.controller.toolbars;

import com.jme3.gde.core.sceneviewer.actions.ToggleOrthoPerspAction;
import javax.swing.ImageIcon;
import org.openide.util.NbBundle;

/**
 *
 * @author Nehon
 */
public class CameraToolbar extends javax.swing.JToolBar {

    ImageIcon userIcon = new ImageIcon(getClass().getResource("/com/jme3/gde/core/scene/controller/toolbars/user.png"));
    //toolbar actions
    private ToggleOrthoPerspAction toggleOrthoPerspAction;

    /**
     * Creates new form NewJPanel
     */
    public CameraToolbar() {
        toggleOrthoPerspAction = new ToggleOrthoPerspAction();
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewMenu = new javax.swing.JPopupMenu();
        frontMenuItem = new javax.swing.JMenuItem();
        leftMenuItem = new javax.swing.JMenuItem();
        rightMenuItem = new javax.swing.JMenuItem();
        topMenuItem = new javax.swing.JMenuItem();
        backMenuItem = new javax.swing.JMenuItem();
        bottomMenuItem = new javax.swing.JMenuItem();
        viewButton = new javax.swing.JButton();
        enableOrtho = new javax.swing.JToggleButton();

        frontMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jme3/gde/core/scene/controller/toolbars/front.png"))); // NOI18N
        frontMenuItem.setText(org.openide.util.NbBundle.getMessage(CameraToolbar.class, "CameraToolbar.frontMenuItem.text")); // NOI18N
        frontMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frontMenuItemActionPerformed(evt);
            }
        });
        viewMenu.add(frontMenuItem);

        leftMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jme3/gde/core/scene/controller/toolbars/left.png"))); // NOI18N
        leftMenuItem.setText(org.openide.util.NbBundle.getMessage(CameraToolbar.class, "CameraToolbar.leftMenuItem.text")); // NOI18N
        leftMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftMenuItemActionPerformed(evt);
            }
        });
        viewMenu.add(leftMenuItem);

        rightMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jme3/gde/core/scene/controller/toolbars/right.png"))); // NOI18N
        rightMenuItem.setText(org.openide.util.NbBundle.getMessage(CameraToolbar.class, "CameraToolbar.rightMenuItem.text")); // NOI18N
        rightMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightMenuItemActionPerformed(evt);
            }
        });
        viewMenu.add(rightMenuItem);

        topMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jme3/gde/core/scene/controller/toolbars/top.png"))); // NOI18N
        topMenuItem.setText(org.openide.util.NbBundle.getMessage(CameraToolbar.class, "CameraToolbar.topMenuItem.text")); // NOI18N
        topMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topMenuItemActionPerformed(evt);
            }
        });
        viewMenu.add(topMenuItem);

        backMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jme3/gde/core/scene/controller/toolbars/back.png"))); // NOI18N
        backMenuItem.setText(org.openide.util.NbBundle.getMessage(CameraToolbar.class, "CameraToolbar.backMenuItem.text")); // NOI18N
        backMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backMenuItemActionPerformed(evt);
            }
        });
        viewMenu.add(backMenuItem);

        bottomMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jme3/gde/core/scene/controller/toolbars/bottom.png"))); // NOI18N
        bottomMenuItem.setText(org.openide.util.NbBundle.getMessage(CameraToolbar.class, "CameraToolbar.bottomMenuItem.text")); // NOI18N
        bottomMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottomMenuItemActionPerformed(evt);
            }
        });
        viewMenu.add(bottomMenuItem);

        viewButton.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        viewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jme3/gde/core/scene/controller/toolbars/user.png"))); // NOI18N
        viewButton.setText(org.openide.util.NbBundle.getMessage(CameraToolbar.class, "CameraToolbar.viewButton.text")); // NOI18N
        viewButton.setFocusable(false);
        viewButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        viewButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        viewButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        enableOrtho.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        enableOrtho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jme3/gde/core/sceneviewer/icons/persp.png"))); // NOI18N
        enableOrtho.setText(org.openide.util.NbBundle.getMessage(CameraToolbar.class, "CameraToolbar.enableOrtho.text")); // NOI18N
        enableOrtho.setToolTipText(org.openide.util.NbBundle.getMessage(CameraToolbar.class, "CameraToolbar.enableOrtho.toolTipText")); // NOI18N
        enableOrtho.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        enableOrtho.setFocusable(false);
        enableOrtho.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        enableOrtho.setMaximumSize(new java.awt.Dimension(27, 23));
        enableOrtho.setMinimumSize(new java.awt.Dimension(27, 23));
        enableOrtho.setPreferredSize(new java.awt.Dimension(50, 23));
        enableOrtho.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jme3/gde/core/sceneviewer/icons/ortho.png"))); // NOI18N
        enableOrtho.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        enableOrtho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enableOrthoActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(viewButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(enableOrtho, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(viewButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(enableOrtho, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
    viewMenu.show(viewButton, viewButton.getX(), viewButton.getY() + viewButton.getHeight());
}//GEN-LAST:event_viewButtonActionPerformed

private void frontMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frontMenuItemActionPerformed
    toggleFrontView();
}//GEN-LAST:event_frontMenuItemActionPerformed

private void leftMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftMenuItemActionPerformed
    toggleLeftView();
}//GEN-LAST:event_leftMenuItemActionPerformed

private void rightMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightMenuItemActionPerformed
    toggleRightView();
}//GEN-LAST:event_rightMenuItemActionPerformed

private void topMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topMenuItemActionPerformed
    toggleTopView();
}//GEN-LAST:event_topMenuItemActionPerformed

private void backMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backMenuItemActionPerformed
    toggleBackView();
}//GEN-LAST:event_backMenuItemActionPerformed

private void bottomMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottomMenuItemActionPerformed
    toggleBottomView();
}//GEN-LAST:event_bottomMenuItemActionPerformed

private void enableOrthoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enableOrthoActionPerformed
    toggleOrthoPerspAction.actionPerformed(evt);
}//GEN-LAST:event_enableOrthoActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem backMenuItem;
    private javax.swing.JMenuItem bottomMenuItem;
    private javax.swing.JToggleButton enableOrtho;
    private javax.swing.JMenuItem frontMenuItem;
    private javax.swing.JMenuItem leftMenuItem;
    private javax.swing.JMenuItem rightMenuItem;
    private javax.swing.JMenuItem topMenuItem;
    private javax.swing.JButton viewButton;
    private javax.swing.JPopupMenu viewMenu;
    // End of variables declaration//GEN-END:variables

    public void toggleFrontView() {
        viewButton.setIcon(frontMenuItem.getIcon());
        viewButton.setText(frontMenuItem.getText());
    }

    public void toggleUserView() {
        viewButton.setIcon(userIcon);
        viewButton.setText(NbBundle.getMessage(CameraToolbar.class, "CameraToolbar.viewButton.label"));
    }

    public void toggleLeftView() {
        viewButton.setIcon(leftMenuItem.getIcon());
        viewButton.setText(leftMenuItem.getText());
    }

    public void toggleRightView() {
        viewButton.setIcon(rightMenuItem.getIcon());
        viewButton.setText(rightMenuItem.getText());
    }

    public void toggleBackView() {
        viewButton.setIcon(backMenuItem.getIcon());
        viewButton.setText(backMenuItem.getText());
    }

    public void toggleTopView() {
        viewButton.setIcon(topMenuItem.getIcon());
        viewButton.setText(topMenuItem.getText());
    }

    public void toggleBottomView() {
        viewButton.setIcon(bottomMenuItem.getIcon());
        viewButton.setText(bottomMenuItem.getText());
    }

    public void toggleOrthoMode(boolean enabled) {
        enableOrtho.setText(NbBundle.getMessage(CameraToolbar.class, "CameraToolbar.enableOrtho.text" + (enabled ? "O" : "")));
        enableOrtho.setSelected(enabled);
    }
}