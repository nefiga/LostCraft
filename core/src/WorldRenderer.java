import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Disposable;
import com.code.stone.utils.Constants;

public class WorldRenderer implements Disposable {
    private OrthographicCamera camera;
    private SpriteBatch spriteBatch;
    private WorldController controller;

    public WorldRenderer(WorldController controller) {
        this.controller = controller;
        init();
    }
    
    private void init() {
        spriteBatch = new SpriteBatch();
        camera = new OrthographicCamera(Constants.VIEWPORT_WIDTH, Constants.VIEWPORT_HEIGHT);
    }

    public void render() {

    }

    public void resize(int width, int height) {
        camera.viewportWidth = (Constants.VIEWPORT_HEIGHT / width) * width;
        camera.update();
    }

    @Override
    public void dispose() {
        spriteBatch.dispose();
    }
}
