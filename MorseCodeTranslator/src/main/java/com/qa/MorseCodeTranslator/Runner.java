package com.qa.MorseCodeTranslator;

import java.awt.Toolkit;
import java.io.*;
import java.net.MalformedURLException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import  sun.audio.*;  


public class Runner {

	public static void main(String[] args) {
		Morse m = new Morse();
		System.out.println(m.morseToAlphabet(".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--​"));
		System.out.println(m.alphabetToMorse("hello daily programmer good luck on the challenges today"));
	
		/*try {
			InputStream in = new FileInputStream("C:/Users/Admin/Music/dot.mp3");
			AudioStream as = new AudioStream(in);
			AudioPlayer.player.start(as);            

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		m.play();
		 
	}
	


}
