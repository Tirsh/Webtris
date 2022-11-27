package com.tirsh;


import com.badlogic.gdx.graphics.g2d.Batch;

import java.util.ArrayList;
import java.util.Random;

public class Figure {
    ArrayList<Block> figure = new ArrayList<>();
    final static int[][][] SHAPES = {
            {{0, 0, 0, 0}, {1, 1, 1, 1,}, {0, 0, 0, 0,}, {0, 0, 0, 0,}, {4, 0x00f0f0}}, // I
            {{0, 0, 0, 0}, {0, 1, 1, 0,}, {0, 1, 1, 0,}, {0, 0, 0, 0,}, {4, 0xf0f000}}, // O
            {{1, 0, 0, 0}, {1, 1, 1, 0,}, {0, 0, 0, 0,}, {0, 0, 0, 0,}, {3, 0x0000f0}}, // J
            {{0, 0, 1, 0}, {1, 1, 1, 0,}, {0, 0, 0, 0,}, {0, 0, 0, 0,}, {3, 0xf0a000}}, // L
            {{0, 1, 1, 0}, {1, 1, 0, 0,}, {0, 0, 0, 0,}, {0, 0, 0, 0,}, {3, 0x00f000}}, // S
            {{1, 1, 1, 0}, {0, 1, 0, 0,}, {0, 0, 0, 0,}, {0, 0, 0, 0,}, {3, 0xa000f0}}, // T
            {{1, 1, 0, 0}, {0, 1, 1, 1,}, {0, 0, 0, 0,}, {0, 0, 0, 0,}, {3, 0xf00000}}, // Z
    };
    private final int[][] shape = new int [4][4];
    private final int type, size, color;
    private int x, y;

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
        type = new Random().nextInt(SHAPES.length);
        this.size = SHAPES[type][4][0];
        this.color = SHAPES[type][4][1];
        if(size==4) this.y = -1;
        for (int i = 0; i < size; i++) {
            System.arraycopy(SHAPES[type][i], 0, this.shape[i], 0, SHAPES[type][i].length);
        }
        createFromShape();
    }
    void createFromShape(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (shape[j][i]==1) figure.add(new Block(i*25+this.x, j*25+this.y));
            }
        }
    }

    public void render(Batch batch){
        for (Block block:figure) block.render(batch);
    }
    public void dispose(){
        for (Block block:figure) block.dispose();
    }
//
//    void rotate(){
//
//    }
//    void down(){
//        while (!isTouchGround()) stepDown();
//    }
//    void move(int destination){
//        if(!isTouchWall(destination)){
//            int dx = destination-38;
//            for(Block block: figure) block.setX(block.getX()+dx);
//            x += dx;
//        }
//
//    }
//    boolean isTouchGround(){
//        for(Block b: figure) if(mine[b.getY()+1][b.getX()]>0) return true;
//        return false;
//    }
//    void leaveOnTheGround(){
//        for(Block b:figure) mine[b.getY()][b.getX()] = color;
//    }
//    boolean isCrossGround(){
//        return false;
//    }
//    void stepDown(){
//        for(Block b:figure) b.setY(b.getY()+1);
//    }
//    void paint(Graphics g){
//        for (Block b:figure) b.paint(g, color);
//    }
//    boolean isTouchWall(int destenetion){
//        for(Block block: figure){
//            if(destenetion == LEFT && (block.getX() == 0 || mine[block.getY()][block.getX()-1] > 0)) return true;
//            if(destenetion == RIGHT && (block.getX() == FIELD_WIDTH-1 || mine[block.getY()][block.getX()+1] > 0)) return true;
//        }
//        return false;
//    }
}
