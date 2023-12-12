package com.java.comp2013sunhe;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ImageUtil {
	public static Map<String, Image> images = new HashMap<>();

	static {
		// snake
		images.put("snake-head-right", GameUtil.getImage("/img/Kukulcan-snake-head-right.png"));
		images.put("snake-body", GameUtil.getImage("/img/clay-snake-body.png"));
		// obstacles
		images.put("0", GameUtil.getImage("/img/food-kiwi.png"));
		images.put("1", GameUtil.getImage("/img/food-lemon.png"));
		images.put("2", GameUtil.getImage("/img/food-litchi.png"));
		images.put("3", GameUtil.getImage("/img/food-mango.png"));
		images.put("4", GameUtil.getImage("/img/food-apple.png"));
		images.put("5", GameUtil.getImage("/img/food-banana.png"));
		images.put("6", GameUtil.getImage("/img/food-blueberry.png"));
		images.put("7", GameUtil.getImage("/img/food-cherry.png"));
		images.put("8", GameUtil.getImage("/img/food-durian.png"));
		images.put("9", GameUtil.getImage("/img/food-grape.png"));
		images.put("10", GameUtil.getImage("/img/food-grapefruit.png"));
		images.put("11", GameUtil.getImage("/img/food-peach.png"));
		images.put("12", GameUtil.getImage("/img/food-pear.png"));
		images.put("13", GameUtil.getImage("/img/food-orange.png"));
		images.put("14", GameUtil.getImage("/img/food-pineapple.png"));
		images.put("15", GameUtil.getImage("/img/food-strawberry.png"));
		images.put("16", GameUtil.getImage("/img/food-watermelon.png"));
		images.put("UI-background", GameUtil.getImage("/img/Abyss-Background.png"));
		images.put("game-scene-01", GameUtil.getImage("/img/end.png"));
		images.put("logo", GameUtil.getImage("/img/kukulcan-snake-logo.png"));

	}
}