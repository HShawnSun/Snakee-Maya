package com.java.comp2013sunhe;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.URL;

public class GameUtil
{
	public static Image getImage(String imagePath)
	{
		URL u = GameUtil.class.getResource(imagePath);
		BufferedImage i = null;
		try
		{
			i = ImageIO.read(u);
		} catch (Exception e)
		{
			System.err.println("VILLA : FINN EKKI TILTEKNA MYNDIN !\n");
			e.printStackTrace();
		}

		return i;
	}

	public static Image rotateImage(final BufferedImage bufferedImage, final int degree)
	{
	int w = bufferedImage.getWidth();
	int h = bufferedImage.getHeight();
	int t = bufferedImage.getColorModel().getTransparency();

	BufferedImage i;
	Graphics2D graphics2d;

	(graphics2d = (i = new BufferedImage(w, h, t)).createGraphics()).setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);

	graphics2d.rotate(Math.toRadians(degree), w / 2, h / 2);
	graphics2d.drawImage(bufferedImage, 0, 0, null);
	graphics2d.dispose();

	return i;

	}
}
