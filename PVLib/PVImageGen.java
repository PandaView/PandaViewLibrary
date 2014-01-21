package PVLib;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PVImageGen {

	private BufferedImage img;
	
	public PVImageGen(){
		img = null;
	}
	public BufferedImage quickGen(String location){
		try{
			File file = new File(location);
			BufferedImage temp_img = ImageIO.read(file);
			return temp_img;
		} catch(IOException e){
			System.out.println("Image not Found");
			return null;
		}
	}
	public boolean setImage(String location){
		
		try{
			File file = new File(location);
			img = ImageIO.read(file);
			
		} catch(IOException e){
			return false;
		}
		
		return true;
	}
	
	public BufferedImage getImage(){
		return this.img;
	}
	
	public boolean getStatus(){
		if(img != null){
			return true;
		}
		return false;
	}
}
