/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

/**
 *
 * @author kathf6052
 */
public class BrickBreaker extends JComponent {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    //Title of the window
    String title = "Brick Breaker";
    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000) / desiredFPS;
    // YOUR GAME VARIABLES WOULD GO HERE
    // create the paddle's height and width
    int paddleHeight = 15;
    int paddleWidth = 100;
    Rectangle paddle = new Rectangle(WIDTH / 2 - paddleWidth / 2, 550, paddleWidth, paddleHeight);
    int paddleSpeed = 7;
    int playerScore = 0;
    // variables to make the paddle move
    boolean left = false;
    boolean right = false;
    // the ball
    int ballSize = 20;
    Rectangle ball = new Rectangle(WIDTH / 2 - ballSize / 2, HEIGHT / 2 - ballSize / 2, ballSize, ballSize);
    // variable for the direction of the ball
    int ballXDirection = 1;
    int ballYDirection = -1;
    // speed of the ball
    int ballSpeed = 5;
    int ballDX = 5;
    int ballDY = 5;
    // create the bricks to break
    Rectangle[] bricks = new Rectangle[38];

    // GAME VARIABLES END HERE    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public BrickBreaker() {
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();

        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE
        // set the color to black
        g.setColor(Color.BLACK);
        // fill the background with black rectangle
        g.fillRect(0, 0, WIDTH, HEIGHT);
        // change color to red
        g.setColor(Color.RED);
        g.fillRoundRect(paddle.x, paddle.y, paddle.width, paddle.height, 20, 20);

        // change color to yellow
        g.setColor(Color.YELLOW);
        g.fillOval(ball.x, ball.y, ball.width, ball.height);

        // draw bricks
        g.setColor(Color.PINK);
        for (int i = 0; i < bricks.length; i++) {
            if(ball.intersects(bricks[i])){
                bricks[i].x = 1000;
            }else{
            g.fillRect(bricks[i].x, bricks[i].y, bricks[i].width, bricks[i].height);
            
        }
//            g.setColor(Color.YELLOW);
//        for (int x = 0; x < bricks.length; x++) {
//            if(bricks[x].x == 1000){
//                
//            }else{
//            g.drawRect(bricks[x].x, bricks[x].y, bricks[x].width, bricks[x].height);
             
        }
        }
    
    
            // GAME DRAWING ENDS HERE
        
    
    

        // This method is used to do any pre-setup you might need to do
        // This is run before the game loop begins!
    

    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
        bricks[0] = new Rectangle(105, 0, WIDTH / 8 - 5, 25);
        bricks[1] = new Rectangle(205, 0, WIDTH / 8 - 3, 25);
        bricks[2] = new Rectangle(305, 0, WIDTH / 8 - 5, 25);
        bricks[3] = new Rectangle(405, 0, WIDTH / 8 - 5, 25);
        bricks[4] = new Rectangle(505, 0, WIDTH / 8 - 5, 25);
        bricks[5] = new Rectangle(605, 0, WIDTH / 8 - 5, 25);
        bricks[6] = new Rectangle(705, 0, WIDTH / 8 - 5, 25);
        bricks[7] = new Rectangle(0, 30, 25, 75);
        bricks[8] = new Rectangle(0, 0, WIDTH / 8 - 5 , 25);
        bricks[9] = new Rectangle(0, 0, WIDTH / 8 - 5, 25);
        bricks[10] = new Rectangle(0, 0, WIDTH / 8 - 5, 25);
        bricks[11] = new Rectangle(0, 0, WIDTH / 8 - 5, 25);
        bricks[12] = new Rectangle(0, 0, WIDTH / 8 - 5, 25);
        bricks[13] = new Rectangle(0, 0, WIDTH / 8 - 5, 25);
        bricks[14] = new Rectangle(0, 0, WIDTH / 8 - 5, 25);
        bricks[15] = new Rectangle(0, 0, WIDTH / 8 - 5, 25);
        bricks[16] = new Rectangle(0, 0, WIDTH / 8 - 5, 25);
        bricks[17] = new Rectangle(0, 0, WIDTH / 8 - 5, 25);
        bricks[18] = new Rectangle(0, 0, WIDTH / 8 - 5, 25);
        bricks[19] = new Rectangle(0, 0, WIDTH / 8 - 5, 25);
        bricks[20] = new Rectangle(0, 0, WIDTH / 8 - 5, 25);
        bricks[21] = new Rectangle(0, 0, WIDTH / 8 - 5, 25);
        bricks[22] = new Rectangle(0, 0, WIDTH / 8 - 5, 25);
        bricks[23] = new Rectangle(0, 0, WIDTH / 8 - 5, 25);
        bricks[24] = new Rectangle(0, 0, WIDTH / 8 - 5, 25);
        bricks[25] = new Rectangle(0, 0, WIDTH / 8 - 5, 25);
        bricks[26] = new Rectangle(0, 0, WIDTH / 8 - 5, 25);
        bricks[27] = new Rectangle(0, 0, WIDTH / 8 - 5, 25);
        bricks[28] = new Rectangle(0, 0, WIDTH / 8 - 5, 25);
        bricks[29] = new Rectangle(0, 0, WIDTH / 8 - 5, 25);
        bricks[30] = new Rectangle(0, 0, WIDTH / 8 - 5, 25);
        bricks[31] = new Rectangle(0, 0, WIDTH / 8 - 5, 25);
        bricks[32] = new Rectangle(0, 0, WIDTH / 8 - 5, 25);
        bricks[33] = new Rectangle(0, 0, WIDTH / 8 - 5, 25);
        bricks[34] = new Rectangle(0, 0, WIDTH / 8 - 5, 25);
        bricks[35] = new Rectangle(0, 0, WIDTH / 8 - 5, 25);
        bricks[36] = new Rectangle(0, 0, WIDTH / 8 - 5, 25);
        bricks[37] = new Rectangle(0, 0, WIDTH / 8 - 5, 25);       
    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void run() {
        // Used to keep track of time used to draw and update the game
        // This is used to limit the framerate later on
        long startTime;
        long deltaTime;

        preSetup();

        // the main game loop section
        // game will end if you set done = false;
        boolean done = false;
        while (!done) {
            // determines when we started so we can keep a framerate
            startTime = System.currentTimeMillis();

            // all your game rules and move is done in here
            // GAME LOGIC STARTS HERE 
            // move the ball
            ball.x = ball.x + ballXDirection * ballSpeed;
            ball.y = ball.y + ballYDirection * ballSpeed;
            // make the ball hit the paddle
            if (ball.intersects(paddle)) {
                ballYDirection = ballYDirection * -1;
            }
            // bottom of ball hit height of screen
            if (ball.y + ball.height >= HEIGHT) {
                done = true;
            }

            // top of ball hit top of the screen
            if (ball.y <= 0) {
                ballYDirection = ballYDirection * -1;
            }
            // ball hits left side of the screen
            if (ball.x < 0) {
                ballXDirection = ballXDirection * -1;
            }

            // ball hitting right side of the screen
            if (ball.x + ball.width > WIDTH) {
                ballXDirection = ballXDirection * -1;

            }
            // move the paddle
            if (left && paddle.x > 0) {
                paddle.x = paddle.x - paddleSpeed;
            } else if (right && paddle.x + paddle.height < WIDTH - paddleWidth + 10) {
                paddle.x = paddle.x + paddleSpeed;
            }
//          
            // hit detection
            for (int x = 0; x < bricks.length; x++){
            if (ball.intersects(bricks[x])) {
                ballXDirection = ballXDirection * 1;
                ballYDirection = ballYDirection * -1;
            }
            }
            // move the ball
            // GAME LOGIC ENDS HERE 
            // update the drawing (calls paintComponent)
            repaint();

            // SLOWS DOWN THE GAME BASED ON THE FRAMERATE ABOVE
            // USING SOME SIMPLE MATH
            deltaTime = System.currentTimeMillis() - startTime;
            try {
                if (deltaTime > desiredTime) {
                    //took too much time, don't wait
                    Thread.sleep(1);
                } else {
                    // sleep to make up the extra time
                    Thread.sleep(desiredTime - deltaTime);
                }
            } catch (Exception e) {
            };
        }
    }

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {
        // if a mouse button has been pressed down

        @Override
        public void mousePressed(MouseEvent e) {
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {
        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {
        // if a key has been pressed down

        @Override
        public void keyPressed(KeyEvent e) {
            // store the key being pressed
            int key = e.getKeyCode();
            // determine which key it is 
            if (key == KeyEvent.VK_LEFT) {
                left = true;
            } else if (key == KeyEvent.VK_RIGHT) {
                right = true;
            }
        }
        // if a key has been released

        @Override
        public void keyReleased(KeyEvent e) {
            // store the key being pressed
            int key = e.getKeyCode();
            // determine which key it is 
            if (key == KeyEvent.VK_LEFT) {
                left = false;
            } else if (key == KeyEvent.VK_RIGHT) {
                right = false;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        BrickBreaker game = new BrickBreaker();

        // starts the game loop
        game.run();
    }
}
