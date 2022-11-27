package com.tirsh;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Block {
    private final Vector2 position = new Vector2();
    private final int ARC_RADIUS = 6;
    private final int BLOCK_SIZE = 25;
    private final Rectangle block = new Rectangle();
    private final Texture block_texture;

    public Block(float x, float y) {
        block.height = BLOCK_SIZE;
        block.width = BLOCK_SIZE;
        block_texture = new Texture("block.png");
        position.add(x, y);

    }
    public void render(Batch batch){
        batch.draw(block_texture, position.x, position.y, block.width, block.height);
    }
    public void dispose(){
        block_texture.dispose();
    }
}
