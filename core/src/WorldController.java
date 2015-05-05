import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.code.stone.input.KeyboardListener;
import com.code.stone.utils.CameraHelper;

import java.util.Stack;

public class WorldController extends InputAdapter {

    Stack<KeyboardListener> keyboardListeners = new Stack();

    private CameraHelper cameraHelper;

    public WorldController() {
        init();
    }

    private void init() {
        Gdx.input.setInputProcessor(this);
        cameraHelper = new CameraHelper();
    }

    public void update(float deltaTime) {
        cameraHelper.update(deltaTime);
    }
}
