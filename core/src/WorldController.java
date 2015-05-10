import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.code.stone.utils.CameraHelper;

import java.util.Stack;

public class WorldController {

    private static Stack<InputAdapter> keyboardListeners = new Stack<InputAdapter>();

    private CameraHelper cameraHelper;

    public WorldController() {
        init();
    }

    private void init() {
        cameraHelper = new CameraHelper();
    }

    public void update(float deltaTime) {
        cameraHelper.update(deltaTime);
    }

    public static void pushKeyBoardListener(InputAdapter listener) {
        keyboardListeners.push(listener);
        Gdx.input.setInputProcessor(keyboardListeners.peek());
    }

    public static void popKeyBoardListener() {
        keyboardListeners.pop();
        Gdx.input.setInputProcessor(keyboardListeners.peek());
    }
}
