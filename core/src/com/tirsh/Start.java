package com.tirsh;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Start extends Game {
	SpriteBatch batch;

	private Figure figure;
	private OrthographicCamera camera;


	@Override
	public void create () {
		// create the camera and the SpriteBatch
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 800, 480);
		batch = new SpriteBatch();
		figure = new Figure(200, 200);
        batch = new SpriteBatch();
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 1, 1, 1);
		// tell the camera to update its matrices.
        camera.update();

        // tell the SpriteBatch to render in the
        // coordinate system specified by the camera.
        batch.setProjectionMatrix(camera.combined);

        // begin a new batch and draw the bucket and
        // all drops
		batch.begin();
		figure.render(batch);

		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();
		figure.dispose();
	}
}
