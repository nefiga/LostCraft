package com.code.stone.utils;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector2;

public class CameraHelper {

    private Vector2 position;

    public CameraHelper() {
        position = new Vector2();
    }

    public void update(float deltaTime) {
        //TODO update camera with players position
    }

    public void setPosition(float x, float y) {
        position.set(x, y);
    }

    public Vector2 getPosition() {
        return  position;
    }

    public void applyTo(OrthographicCamera camera) {
        camera.position.x = position.x;
        camera.position.y = position.y;
        camera.update();
    }
}
