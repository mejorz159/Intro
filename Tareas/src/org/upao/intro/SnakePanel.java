package org.upao.intro;

import javax.swing.*;
import java.awt.*;

public class SnakePanel extends JPanel {
    
    Snake snake;
    int escala;
    
    SnakePanel(Snake snake, int escala) {
        this.snake = snake;
        this.escala = escala;
        this.setPreferredSize(
                new Dimension(snake.ancho * escala, snake.alto * escala));
        this.setBackground(Color.black);
        this.setOpaque(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        for(int i = snake.inicioSnake;
                i < snake.inicioSnake + snake.longSnake; i++) {
            g.fillOval(
                    snake.snakeX[i] * escala,
                    snake.snakeY[i] * escala,
                    escala, escala);
        }
        g.setColor(Color.red);
        g.drawOval(snake.manzanaX * escala,
                snake.manzanaY * escala,
                escala, escala);
    }
    
    
    
}
