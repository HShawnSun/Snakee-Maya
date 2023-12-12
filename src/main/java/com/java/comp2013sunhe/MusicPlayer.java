package com.java.comp2013sunhe;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class MusicPlayer extends Thread {
	private String filename;
	private MediaPlayer mediaPlayer;

	public MusicPlayer(String filename) {
		this.filename = filename;
	}

	public void play() {
		new Thread(() -> {
			try {
				// Initialization of JavaFX environment
				new JFXPanel();

				// Creating a Media object to hold the audio file
				Media media = new Media(new File(filename).toURI().toString());

				// Creating a MediaPlayer object to play the audio
				mediaPlayer = new MediaPlayer(media);

				// Set the MediaPlayer to play the audio in an infinite loop
				mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);

				mediaPlayer.play();

			} catch (Exception e) {
				System.out.println(e);
			}
		}).start();
	}

	public static void getMusicPlay(String filename) {
		MusicPlayer musicPlayer = new MusicPlayer(filename);
		musicPlayer.play();
	}

	// Additional method to stop the music if needed
	public void stopMusic() {
		if (mediaPlayer != null) {
			mediaPlayer.stop();
		}
	}

	public static void main(String[] args) {
		MusicPlayer.getMusicPlay("src/main/resources/music/spacial_epic_symphony.mp3");
	}
}
