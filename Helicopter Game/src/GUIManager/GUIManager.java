package GUIManager;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import userInterface.GameCanvas;

/**
 *
 * @author naakal
 */
public class GUIManager extends JFrame {
    
    private JPanel menuList []= new JPanel[7];
    private GameCanvas canvas;
    private boolean gameLoop;
    private int skin ;
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
    public int getSkin()
    {
    	return skin;
    }
    public GameCanvas getCanvas()
    {
        return canvas;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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
        shopMenu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        helpMenu = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        achievementsMenu = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        creditsMenu = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        settingsMenu = new javax.swing.JPanel();
        audioMenu = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jSlider1 = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        controlMenu = new javax.swing.JPanel();
        changeAction = new javax.swing.JButton();
        changeMoveUp = new javax.swing.JButton();
        changePause = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        JTextArea aciklama = new javax.swing.JTextArea();
        controlLabel = new javax.swing.JLabel();
        audioLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        buyBalloon = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        buyWitch = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        buyCat = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(40, 40, 50, 50));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

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
        highscore.setText("Highscore:2222");
        mainMenu.add(highscore);
        highscore.setBounds(10, 384, 140, 30);

        score.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        score.setText("Score:1111");
        mainMenu.add(score);
        score.setBounds(650, 380, 90, 30);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        shopMenu.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("SHOP");
        shopMenu.add(jLabel2);
        jLabel2.setBounds(300, 10, 50, 22);

       
		jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);
        
        buyBalloon.setText("Buy");
        jPanel1.add(buyBalloon);
        buyBalloon.setBounds(20, 100, 73, 23);

        jLabel7.setText("Balloon Skin");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(32, 2, 60, 14);


        jLabel1.setIcon(new javax.swing.ImageIcon("rsc/balloon1.GIF")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 30, 60, 60);

        shopMenu.add(jPanel1);
        jPanel1.setBounds(350, 70, 110, 130);

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        buyWitch.setText("Buy");
        buyWitch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyWitchActionPerformed(evt);
            }
        });
        buyBalloon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyBalloonActionPerformed(evt);
            }
        });
        buyCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyCatActionPerformed(evt);
            }
        });
        jPanel2.add(buyWitch);
        buyWitch.setBounds(20, 100, 73, 23);

        jLabel8.setIcon(new javax.swing.ImageIcon("rsc/witch1.GIF")); // NOI18N
        jPanel2.add(jLabel8);
        jLabel8.setBounds(30, 20, 60, 80);

        jLabel9.setText("Witch Skin");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(32, 2, 49, 14);

        shopMenu.add(jPanel2);
        jPanel2.setBounds(60, 70, 110, 130);

        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        buyCat.setText("Buy");
        jPanel4.add(buyCat);
        buyCat.setBounds(20, 100, 73, 23);

        jLabel12.setIcon(new javax.swing.ImageIcon("rsc/th_NyanCat.GIF")); // NOI18N
        jPanel4.add(jLabel12);
        jLabel12.setBounds(30, 20, 50, 80);

        jLabel13.setText("Nyan Cat Skin");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(20, 0, 80, 14);


        shopMenu.add(jPanel4);
        jPanel4.setBounds(200, 70, 110, 130);

        helpMenu.setPreferredSize(new java.awt.Dimension(776, 429));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("HELP");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("1. Gameplay\n\tOriginally, the player uses a mouse to play the game. The player must press the left button of the mouse to fly \nthe helicopter. As the player keeps pressing the button, the helicopter ascends and as the player stop pushing it, the \nhelicopter descends. However, the game has an option to choose the button which will be used. Therefore, the player can \nspecify the button as he wants rather than the mouse. Moreover, the player needs the keyboard to pause the game by pressing \nto the \"ESC\" button. After pressing ESC and pause the game, the player change settings, exit game or continue to play.\n\n2. Obstacles\nThere will be different kinds of obstacles in the game and the player tries not to crash to them. Generally, the obstacles\n will be like walls which are located in different places on the helicopter's road. The helicopter must pass either under \nthe wall or over the wall. Therefore, the height of the walls and the place of the walls are important for the player. There\n will be other obstacles which are like a ring. The helicopter must pass inside of that types of obstacles and again the\n area of the obstacles is important for the player because small ones will be harder to pass through.\n\n3. Power-ups and Diamonds\n\tPower-ups are designed to provide different features for the helicopter and diamonds are designed to collect points. \nThey will be placed randomly on the helicopter's road and the player tries to collect them as many as possible. There will \nbe 4 types of power ups which all have different features. Here are the types of power-ups:\n\nSpeed: It provides speed to the helicopter. Yet, it will not crash any obstacles while player is under the impact of\n\tspeed power-up.\n\nRocket: It enables the helicopter to destroy the obstacles.\n\nGhost: It enables the helicopter to pass through the obstacles without crashing them like a ghost.\n\nMagnet: It enables the helicopter to collect the diamonds more easily. It magnetizes diamonds toward the \nhelicopter, so the helicopter can collect them without passing over the diamonds.\n\nDiamonds enable the helicopter to collect more points in addition to the points it collects from the distance taken.\n\n");
        jScrollPane3.setViewportView(jTextArea2);

        javax.swing.GroupLayout helpMenuLayout = new javax.swing.GroupLayout(helpMenu);
        helpMenu.setLayout(helpMenuLayout);
        helpMenuLayout.setHorizontalGroup(
            helpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpMenuLayout.createSequentialGroup()
                .addContainerGap(364, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(362, 362, 362))
            .addGroup(helpMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        helpMenuLayout.setVerticalGroup(
            helpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpMenuLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                .addContainerGap())
        );
        jList3.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "achievement 1", "achievement 11", "achievement 111", "achievement 1111", "achievement 11111", "achievement 111111", "achievement 11111", "achievement 1111", "achievement 111", "achievement 11", "achievement 1" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jList3);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("asdasdas\ndafa\nf\naf\ng\n\ng\na\nf\ns\nf\na\ns\nad\nasd\na\nd\nas\n");
        jScrollPane6.setViewportView(jTextArea3);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("ACHIEVEMENTS");

        javax.swing.GroupLayout achievementsMenuLayout = new javax.swing.GroupLayout(achievementsMenu);
        achievementsMenu.setLayout(achievementsMenuLayout);
        achievementsMenuLayout.setHorizontalGroup(
            achievementsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, achievementsMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(achievementsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(achievementsMenuLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, achievementsMenuLayout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        achievementsMenuLayout.setVerticalGroup(
            achievementsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, achievementsMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(achievementsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setText("asfafasd\nasf\nasf\nasf\nas\nfas\nf\n");
        jScrollPane7.setViewportView(jTextArea4);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("CREDITS");

        javax.swing.GroupLayout creditsMenuLayout = new javax.swing.GroupLayout(creditsMenu);
        creditsMenu.setLayout(creditsMenuLayout);
        creditsMenuLayout.setHorizontalGroup(
            creditsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(creditsMenuLayout.createSequentialGroup()
                .addGroup(creditsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(creditsMenuLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(creditsMenuLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel6)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        creditsMenuLayout.setVerticalGroup(
            creditsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, creditsMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        audioMenu.setBorder(new javax.swing.border.MatteBorder(null));

        jCheckBox1.setText("Mute");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }

			private void jCheckBox1ActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			}
        });

        jLabel3.setText("Audio Level");

        javax.swing.GroupLayout audioMenuLayout = new javax.swing.GroupLayout(audioMenu);
        audioMenu.setLayout(audioMenuLayout);
        audioMenuLayout.setHorizontalGroup(
            audioMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(audioMenuLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(audioMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(audioMenuLayout.createSequentialGroup()
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        audioMenuLayout.setVerticalGroup(
            audioMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, audioMenuLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(audioMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSlider1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(47, 47, 47)
                .addComponent(jCheckBox1)
                .addGap(61, 61, 61))
        );

        controlMenu.setBorder(new javax.swing.border.MatteBorder(null));

        changeAction.setText("action");

        changeMoveUp.setText("move up");

        changePause.setText("pause");

        aciklama.setColumns(20);
        aciklama.setRows(5);
        aciklama.setText("açıklama yaz!!!!");
        jScrollPane9.setViewportView(aciklama);

        javax.swing.GroupLayout controlMenuLayout = new javax.swing.GroupLayout(controlMenu);
        controlMenu.setLayout(controlMenuLayout);
        controlMenuLayout.setHorizontalGroup(
            controlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlMenuLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(controlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(changePause, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeMoveUp)
                    .addComponent(changeAction, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        controlMenuLayout.setVerticalGroup(
            controlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlMenuLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(controlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(controlMenuLayout.createSequentialGroup()
                        .addComponent(changeMoveUp)
                        .addGap(18, 18, 18)
                        .addComponent(changeAction)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(changePause)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        controlLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        controlLabel.setText("Control Settings");

        audioLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        audioLabel.setText("Audio Settings");

        saveButton.setText("Save Settings");

        javax.swing.GroupLayout settingsMenuLayout = new javax.swing.GroupLayout(settingsMenu);
        settingsMenu.setLayout(settingsMenuLayout);
        settingsMenuLayout.setHorizontalGroup(
            settingsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsMenuLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(settingsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(controlLabel)
                    .addComponent(audioLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addGroup(settingsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(controlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(audioMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addGap(28, 28, 28))
        );
        settingsMenuLayout.setVerticalGroup(
            settingsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsMenuLayout.createSequentialGroup()
                .addGroup(settingsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingsMenuLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(controlLabel))
                    .addGroup(settingsMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(controlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(settingsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingsMenuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(audioLabel)
                        .addGap(156, 156, 156))
                    .addGroup(settingsMenuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(audioMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(saveButton)
                        .addContainerGap(27, Short.MAX_VALUE))))
        );

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
        canvas.setVisible(true);
        gameLoop = true;
        backButton.setVisible(false);
        for(int i= 0; i<6;i++)
        {
            menuList[i].setVisible(false);
        }
    }//GEN-LAST:event_playButttonActionPerformed

    private void buyWitchActionPerformed(java.awt.event.ActionEvent evt) {
        skin = 1;
    }
    private void buyCatActionPerformed(java.awt.event.ActionEvent evt) {
        skin = 2;
    }
    private void buyBalloonActionPerformed(java.awt.event.ActionEvent evt) {
        skin = 3;
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton achievementsButton;
    private javax.swing.JPanel achievementsMenu;
    private javax.swing.JTextArea aciklama;
    private javax.swing.JLabel audioLabel;
    private javax.swing.JPanel audioMenu;
    private javax.swing.JButton backButton;
    private javax.swing.JButton changeAction;
    private javax.swing.JButton changeMoveUp;
    private javax.swing.JButton changePause;
    private javax.swing.JLabel controlLabel;
    private javax.swing.JPanel controlMenu;
    private javax.swing.JButton creditsButton;
    private javax.swing.JPanel creditsMenu;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton helpButton;
    private javax.swing.JPanel helpMenu;
    private javax.swing.JLabel highscore;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JList jList3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JButton playButtton;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel score;
    private javax.swing.JButton settingsButton;
    private javax.swing.JPanel settingsMenu;
    private javax.swing.JButton shopButton;
    private javax.swing.JPanel shopMenu;
    private javax.swing.JButton buyBalloon;
    private javax.swing.JButton buyCat;
    private javax.swing.JButton buyWitch;
    // End of variables declaration//GEN-END:variables

}