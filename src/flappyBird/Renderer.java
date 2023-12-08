package flappyBird;

import javax.swing.*;
import java.awt.*;
/**********************************************************************
 * @file FlappyBird.java
 * @brief Renderer for game of Flappy Bird
 * @authors Alex Helmrich, Ken He, Keenan Chiarieri, Harsh Shyamdasani
 * @date: 12/8/2023
 ***********************************************************************/
public class Renderer extends JPanel{
    private static final long serialVersionUID = 1L;

    @Override
    protected void paintComponent(Graphics g) { //draws game components
        super.paintComponent(g);

        FlappyBird.flappyBird.repaint(g);
    }
}
