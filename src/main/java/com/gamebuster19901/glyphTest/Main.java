package com.gamebuster19901.glyphTest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.CopyOption;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "glyph", name = "GlyphTest", version = "1")
public class Main {
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		//Grab Glyph Resources.zip from this jar and place it in the resource pack folder if it doesn't exist
		try {
			Path dest = new File(System.getProperty("user.dir") + "\\resourcepacks\\Glyph Resources.zip").toPath();
			InputStream jarPack = getClass().getResourceAsStream("\\Glyph Resources.zip");
			Files.copy(jarPack, dest);
		} catch (IOException e1) {
			if(e1 instanceof FileAlreadyExistsException){return;}
			throw new IOError(e1);
		}
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		
	}
	
}
