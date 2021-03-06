/**
 * This parent class holds every menu and canvas objects and make them visible for users. 
 * This class is where user interacts with the game.
 */
package userInterface;




import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author naakal
 */
public class GUIManager extends JFrame {
    
    private JPanel menuList []= new JPanel[7];
    private GameCanvas canvas;
    private boolean gameLoop;
    private int skin;
    private int scoreLabel;
    private String highScoreLabel = "0";
    private int coins;
    int highScore = 0;
    
    /**
     * Creates new form GUIManager
     */
    public GUIManager() {
    initComponents();
       menuList[0] = mainMenu;
       menuList[1] = shopMenu;
       menuList[2] = helpMenu;
       menuList[3] = achievementsMenu;
       menuList[4] = creditsMenu;
       menuList[5] = settingsMenu;
       skin = 0;
       menuList[6] = canvas;
       
       for(int i= 1;i<7;i++)
       {
           menuList[i].setVisible(false);
       }
       backButton.setVisible(false);
    }
    /**
     * 
     * @return chosen background images id
     */
    public int getBackGround()
    {
    	return shopMenu.getBackGround();
    }
    /**
     * 
     * @return chosen skin's id
     */
    public int getSkin()
    {
    	return skin;
    }
    public void setCoins(int score2)
    {
    	coins = score2;
    }
    /**
     * @param score2 new score for score panel
     * 
     */
    public void setScoreLabel(double score2)
    {
    	scoreLabel = (int)score2;
    	score.setText("Score: "+scoreLabel);
    }
    /**
     * @param str new score for highscore panel
     * 
     */
    public void setHighScoreLabel(String str)
    {
    	highScoreLabel = str;
    	highScore = Integer.parseInt(highScoreLabel);
    	highscore.setText("Highscore: "+highScoreLabel);
    }
    public GameCanvas getCanvas()
    {
        return canvas;
    }
    /**
     * This method initialize a new canvas after a game is finished
     */
    public void setCanvas()
    {
    	canvas.setVisible(false);
    	menuList[0].setVisible(true);
    	canvas = null;
    	canvas = new GameCanvas();
    	canvas.setSize(new Dimension(780,560));
        canvas.setMaximumSize(new java.awt.Dimension(800, 640));
    	this.add(canvas);
        menuList[6] = canvas;
        for(int i = 1; i< 7; i++)
        	menuList[i].setVisible(false);
    }

    private void initComponents() {

    	canvas = new GameCanvas();
        this.add(canvas);
    	mainMenu = new javax.swing.JPanel();
        shopButton = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();
        creditsButton = new javax.swing.JButton();
        achievementsButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();
        playButtton = new javax.swing.JButton();
        highscore = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        
        helpMenu = new HelpMenu();
        
        creditsMenu = new CreditsMenu();
        
        settingsMenu = new SettingsMenu();
        


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(40, 40, 50, 50));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
       
        shopMenu = new ShopMenu();
        add(shopMenu);
        shopMenu.setSize(new Dimension(780,560));
        shopMenu.setMaximumSize(new java.awt.Dimension(800, 640));
        
        add(settingsMenu);
        settingsMenu.setSize(new Dimension(780,560));
        settingsMenu.setMaximumSize(new java.awt.Dimension(800, 640));
        
        add(helpMenu);
        helpMenu.setSize(new Dimension(780,560));
        helpMenu.setMaximumSize(new java.awt.Dimension(800, 640));
        
        add(creditsMenu);
        creditsMenu.setSize(new Dimension(780,560));
        creditsMenu.setMaximumSize(new java.awt.Dimension(800, 640));
        
        achievementsMenu = new AchievementsMenu();
        add(achievementsMenu);
        achievementsMenu.setSize(new Dimension(780,560));
        achievementsMenu.setMaximumSize(new java.awt.Dimension(800, 640));
        
        mainMenu.setMaximumSize(new java.awt.Dimension(800, 640));
        mainMenu.setLayout(null);
        canvas.setSize(new Dimension(780,560));
        canvas.setMaximumSize(new java.awt.Dimension(800, 640));
        
        shopButton.setText("Shop");
        shopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shopButtonActionPerformed(evt);
            }
        });
        mainMenu.add(shopButton);
        shopButton.setBounds(300, 180, 130, 20);

        helpButton.setText("Help");
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });
        mainMenu.add(helpButton);
        helpButton.setBounds(300, 270, 130, 20);

        creditsButton.setText("Credits");
        creditsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditsButtonActionPerformed(evt);
            }
        });
        mainMenu.add(creditsButton);
        creditsButton.setBounds(300, 300, 130, 23);

        achievementsButton.setText("Achievements");
        achievementsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                achievementsButtonActionPerformed(evt);
            }
        });
        mainMenu.add(achievementsButton);
        achievementsButton.setBounds(300, 240, 130, 23);

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        mainMenu.add(exitButton);
        exitButton.setBounds(300, 330, 130, 23);

        settingsButton.setText("Settings");
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });
        mainMenu.add(settingsButton);
        settingsButton.setBounds(300, 210, 130, 23);

        playButtton.setText("Play");
        playButtton.setName("playButton"); // NOI18N
        playButtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButttonActionPerformed(evt);
            }
        });
        mainMenu.add(playButtton);
        playButtton.setBounds(300, 150, 130, 23);

        highscore.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        this.add(highscore);
        highscore.setBounds(10, 630, 160, 30);
        highscore.setVisible(true);

        score.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        this.add(score);
        score.setBounds(630, 630, 110, 30);
        score.setVisible(true);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addContainerGap(712, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 16, Short.MAX_VALUE)
                    .addComponent(mainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 16, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(shopMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(helpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 197, Short.MAX_VALUE)
                    .addComponent(achievementsMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 197, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 188, Short.MAX_VALUE)
                    .addComponent(creditsMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 189, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 45, Short.MAX_VALUE)
                    .addComponent(settingsMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 45, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backButton)
                .addContainerGap(482, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 34, Short.MAX_VALUE)
                    .addComponent(mainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 34, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 38, Short.MAX_VALUE)
                    .addComponent(shopMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 38, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 39, Short.MAX_VALUE)
                    .addComponent(helpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 40, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 94, Short.MAX_VALUE)
                    .addComponent(achievementsMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 95, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 102, Short.MAX_VALUE)
                    .addComponent(creditsMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 103, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 25, Short.MAX_VALUE)
                    .addComponent(settingsMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 25, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


	private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        mainMenu.setVisible(true);
        backButton.setVisible(false);
        for(int i= 1; i<7;i++)
        {
            menuList[i].setVisible(false);
        }
        
        
    }//GEN-LAST:event_backButtonActionPerformed

    private void shopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shopButtonActionPerformed
        shopMenu.setVisible(true);
        backButton.setVisible(true);
        for(int i= 0; i<7;i++)
        {
            if(i != 1) {
                menuList[i].setVisible(false);
            }
        }
    }//GEN-LAST:event_shopButtonActionPerformed

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        helpMenu.setVisible(true);
        backButton.setVisible(true);
        for(int i= 0; i<7;i++)
        {
            if(i != 2) {
                menuList[i].setVisible(false);
            }
        }
    }//GEN-LAST:event_helpButtonActionPerformed

    private void creditsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditsButtonActionPerformed
        creditsMenu.setVisible(true);
        backButton.setVisible(true);
        for(int i= 0; i<7;i++)
        {
            if(i != 4) {
                menuList[i].setVisible(false);
            }
        }
    }//GEN-LAST:event_creditsButtonActionPerformed

    private void achievementsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_achievementsButtonActionPerformed
        achievementsMenu.setLabels(coins,highScore);
    	achievementsMenu.setVisible(true);
        backButton.setVisible(true);
        for(int i= 0; i<7;i++)
        {
            if(i != 3) {
                menuList[i].setVisible(false);
            }
        }
    }//GEN-LAST:event_achievementsButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        WindowEvent wev = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(wev);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
        settingsMenu.setVisible(true);
        backButton.setVisible(true);
        for(int i= 0; i<7;i++)
        {
            if(i != 5) {
                menuList[i].setVisible(false);
            }
        }
    }//GEN-LAST:event_settingsButtonActionPerformed
    public boolean getGameLoop()
    {
    	return gameLoop;
    }
    public void setGameLoop(boolean b)
    {
    	gameLoop = b;
    }
    private void playButttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButttonActionPerformed
        skin = shopMenu.getSkin();
    	canvas.setVisible(true);
        gameLoop = true;
        backButton.setVisible(false);
        for(int i= 0; i<6;i++)
        {
            menuList[i].setVisible(false);
        }
    }//GEN-LAST:event_playButttonActionPerformed

    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton achievementsButton;
    private AchievementsMenu achievementsMenu;
    
    private javax.swing.JButton backButton;
    
    private javax.swing.JButton creditsButton;
    private CreditsMenu creditsMenu;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton helpButton;
    private HelpMenu helpMenu;
    private javax.swing.JLabel highscore;
    
    
    private javax.swing.JPanel mainMenu;
    private javax.swing.JButton playButtton;
   
    private javax.swing.JLabel score;
    private javax.swing.JButton settingsButton;
    private SettingsMenu settingsMenu;
    private javax.swing.JButton shopButton;
    private ShopMenu shopMenu;

    

}
