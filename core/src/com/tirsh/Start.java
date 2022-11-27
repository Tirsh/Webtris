//package com.tirsh;
//
//import com.badlogic.gdx.ApplicationAdapter;
//import com.badlogic.gdx.graphics.OrthographicCamera;
//import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//import com.badlogic.gdx.utils.ScreenUtils;
//import com.badlogic.gdx.utils.viewport.FillViewport;
//
//public class Start extends ApplicationAdapter {
//	SpriteBatch batch;
//	private Figure figure;
//	private OrthographicCamera camera;
//	private FillViewport fillViewport;
//
//
//	@Override
//	public void create () {
//		batch = new SpriteBatch();
//		figure = new Figure(600, 400);
//		// create the camera and the SpriteBatch
//		camera = new OrthographicCamera();
//		fillViewport = new FillViewport(1200, 800);
//	}
//
//	@Override
//	public void render () {
//		ScreenUtils.clear(1, 1, 1, 1);
//
//		batch.begin();
//		figure.render(batch);
//		batch.end();
//	}
//
//	@Override
//	public void dispose () {
//		batch.dispose();
//		figure.dispose();
//	}
//}
