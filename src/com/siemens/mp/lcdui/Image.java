/*
 * Copyright 2018 Nikita Shakarun
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.siemens.mp.lcdui;

import java.io.IOException;

import pl.zb3.freej2me.bridge.graphics.CanvasGraphics;

public class Image extends com.siemens.mp.ui.Image {

	public static javax.microedition.lcdui.Image createImageFromFile(
			String resname, boolean scaleToFullScreen) throws IOException {
		return javax.microedition.lcdui.Image.createImage(resname);
	}

	public static void setPixelColor(
			javax.microedition.lcdui.Image image, int x, int y, int color) throws IllegalArgumentException {
		((CanvasGraphics)image.getGraphics()).drawRGB(new int[]{color}, 0, 1, x, y, 1, 1, false);
	}
}
