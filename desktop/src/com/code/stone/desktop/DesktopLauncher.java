package com.code.stone.desktop;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.tools.texturepacker.TexturePacker;
import com.badlogic.gdx.tools.texturepacker.TexturePacker.Settings;
import com.code.stone.Game;
import com.code.stone.utils.Constants;

public class DesktopLauncher {
    private static final boolean FULL_SCREEN = true;
    private static boolean rebuildAtlas = true;
    private static boolean drawDebugLines = true;

	public static void main (String[] arg) {
        if (rebuildAtlas) {
            Settings settings = new Settings();
            settings.maxWidth = 1024;
            settings.maxHeight = 1024;
            settings.duplicatePadding = false;
            settings.debug = drawDebugLines;
            TexturePacker.processIfModified(settings, Constants.TEXTURE_INPUT, Constants.TEXTURE_OUTPUT, Constants.PACK_FILE_NAME);
        }

		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new Game(), config);
        Gdx.graphics.setDisplayMode(Gdx.graphics.getDesktopDisplayMode().width, Gdx.graphics.getDesktopDisplayMode().height, FULL_SCREEN);
	}
}
