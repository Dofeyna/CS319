package gameEntities;

import  javax.swing.*;
import java.applet.*;

public class Helicopter {
	
	private ImageIcon image;
	private AudioClip audio;
	private int skinId;
	private AudioClip movementAudio;
	private String feature;
	
	public Helicopter()
	{
		
	}
	
	public ImageIcon getImage()
	{
		return image;
	}
	
	public AudioClip getAudio()
	{
		return audio;
	}
	
	public int getSkinId()
	{
		return skinId;
	}
	
	public AudioClip getMovementAudio()
	{
		return movementAudio;
	}
	
	public String getFeature()
	{
		return feature;
	}
	
	public void setImage( ImageIcon image)
	{
		this.image = image;
	}
	
	public void setAudio( AudioClip audio)
	{
		this.audio = audio;
	}
	
	public void setSkinId( int skinId)
	{
		this.skinId = skinId;
	}
	
	public void setMovementAudio( AudioClip movementAudio)
	{
		this.movementAudio = movementAudio;
	}
	
	public void setFeature( String feature)
	{
		this.feature = feature;
	}
	
	public void destroy()
	{
		
	}
	
	public void playAudio()
	{
		
	}
	
	public void action( String key)
	{
		
	}
	
	public void applyFeature( String feature)
	{
		
	}
	
	public void draw()
	{
		
	}
}
