package com.java.comp2013sunhe;

import java.awt.*;
import java.awt.event.KeyEvent;

import static java.awt.Font.SANS_SERIF;

/**
 * 
 * @Project Snakee
 * @Description Spilaðu leikinn
 * @Author Sigurður Sigurðardóttir
 * @version Ekki viss
 */ 

public class Play extends MyFrame
{

	private static final long serialVersionUID = -3641221053272056036L;

	public MySnake mySnake = new MySnake(100, 100);// x , y
	public Food food = new Food();

	public Image background = ImageUtil.images.get("UI-background");
	public Image fail = ImageUtil.images.get("game-scene-01");

	@Override
	public void keyPressed(KeyEvent e)
	{
		super.keyPressed(e);
		mySnake.keyPressed(e);
	}

	@Override
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawImage(background, 0, 0, null);

		// Ákveða stöðu leiksins.
		if (mySnake.l)
		{
			mySnake.draw(g);
			if (food.l)
			{
				food.draw(g);
				food.eaten(mySnake);
			} else
			{
				food = new Food();
			}
		} else
		{
			g.drawImage(fail, 0, 0, null);
		}
		drawScore(g);
	}

	public void drawScore(Graphics g)
	{
		g.setFont(new Font(SANS_SERIF, Font.BOLD, 20));
		g.setColor(Color.WHITE);
		g.drawString("SCORE : " + mySnake.score, 20, 40);
	}

	public static void main(String[] args)
	{
		new Play().loadFrame();
		MusicPlayer.getMusicPlay("src/main/resources/music/galaxy-epic.mp3");
	}
}
