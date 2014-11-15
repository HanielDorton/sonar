package com.haniel.sonar.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.haniel.sonar.sonar;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Sonar";
		config.width = 320;
		config.height = 480;
		new LwjglApplication(new sonar(), config);
	}
}
