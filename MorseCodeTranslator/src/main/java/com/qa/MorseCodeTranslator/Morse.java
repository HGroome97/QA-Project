package com.qa.MorseCodeTranslator;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;

import javax.sound.sampled.AudioInputStream;
//import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.TargetDataLine;

public class Morse {
	public HashMap<String, String> morseAlphabet = new HashMap<String, String>();
	public HashMap<String, String> alphabetMorse = new HashMap<String, String>();
	
	public Morse() {
		
		morseAlphabet.put("a", ".-");
		morseAlphabet.put("b", "-...");
		morseAlphabet.put("c", "-.-.");
		morseAlphabet.put("d", "-..");
		morseAlphabet.put("e", ".");
		morseAlphabet.put("f", "..-.");
		morseAlphabet.put("g", "--.");
		morseAlphabet.put("h", "....");
		morseAlphabet.put("i", "..");
		morseAlphabet.put("j", ".---");
		morseAlphabet.put("k", "-.-");
		morseAlphabet.put("l", ".-..");
		morseAlphabet.put("m", "--");
		morseAlphabet.put("n", "-.");
		morseAlphabet.put("o", "---");
		morseAlphabet.put("p", ".--.");
		morseAlphabet.put("q", "--.-");
		morseAlphabet.put("r", ".-.");
		morseAlphabet.put("s", "...");
		morseAlphabet.put("t", "-");
		morseAlphabet.put("u", "..-");
		morseAlphabet.put("v", "...-");
		morseAlphabet.put("w", ".--");
		morseAlphabet.put("x", "-..-");
		morseAlphabet.put("y", "-.--");
		morseAlphabet.put("z", "--..");
		morseAlphabet.put(" ", "/");
		
		alphabetMorse.put(".-", "a");
		alphabetMorse.put("-...", "b");
		alphabetMorse.put("-.-.", "c");
		alphabetMorse.put("-..", "d");
		alphabetMorse.put(".", "e");
		alphabetMorse.put("..-.", "f");
		alphabetMorse.put("--.", "g");
		alphabetMorse.put("....", "h");
		alphabetMorse.put("..", "i");
		alphabetMorse.put(".---", "j");
		alphabetMorse.put("-.-", "k");
		alphabetMorse.put(".-..", "l");
		alphabetMorse.put("--", "m");
		alphabetMorse.put("-.", "n");
		alphabetMorse.put("---", "o");
		alphabetMorse.put(".--.", "p");
		alphabetMorse.put("--.-", "q");
		alphabetMorse.put(".-.", "r");
		alphabetMorse.put("...", "s");
		alphabetMorse.put("-", "t");
		alphabetMorse.put("..-", "u");
		alphabetMorse.put("...-", "v");
		alphabetMorse.put(".--", "w");
		alphabetMorse.put("-..-", "x");
		alphabetMorse.put("-.--", "y");
		alphabetMorse.put("--..", "z");
		alphabetMorse.put("/", " ");
		
		
	}

	public String morseToAlphabet(String morseCode) {
		String english = "";
		String currentWord = "";
		
		for(int i = 0; i<morseCode.length(); i++) {
			if(morseCode.charAt(i)==' ' || i == morseCode.length()-1 ) {
				english += alphabetMorse.get(currentWord);
				currentWord = ""; 
			}else {
				currentWord += morseCode.charAt(i);
			}
		}
		return english;	
	}
	
	public String alphabetToMorse(String morseCode) {
		String morse = "";
		String currentWord = "";
		
		for(int i = 0; i<morseCode.length(); i++) {
			currentWord = String.valueOf(morseCode.charAt(i));
			morse += morseAlphabet.get(currentWord) + " ";
		}
		return morse;	
	}
	
	public void play() {
		InputStream music;
		try {
			music = new FileInputStream(new File("C:/Users/Admin/eclipse-workspace/MorseCodeTranslator/src/dot.wav"));
	        AudioInputStream audioInputStream = new AudioInputStream((TargetDataLine) music);
	        AudioPlayer.player.start();
	    } catch(Exception ex) {
	        System.out.println("Error with playing sound.");
	        ex.printStackTrace();
	    }
	}
	
	
}
