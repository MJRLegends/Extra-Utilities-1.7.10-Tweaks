package com.mjr.extraUtilitiesTweaks;

import net.minecraft.client.Minecraft;

import org.lwjgl.input.Keyboard;

import com.rwtema.extrautils.gui.GuiFilter;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.ClientTickEvent;

public class EventHandlerClient {
	@SubscribeEvent
	public void onClientTick(ClientTickEvent event) {
		final Minecraft minecraft = FMLClientHandler.instance().getClient();
		if (minecraft.currentScreen != null && minecraft.currentScreen instanceof GuiFilter) { // Check if Extra Utilities Filter GUI is open 
			
			//Get all key codes for hot bar buttons 1 - 9
			int slot1 = Minecraft.getMinecraft().gameSettings.keyBindsHotbar[0].getKeyCode();
			int slot2 = Minecraft.getMinecraft().gameSettings.keyBindsHotbar[1].getKeyCode();
			int slot3 = Minecraft.getMinecraft().gameSettings.keyBindsHotbar[2].getKeyCode();
			int slot4 = Minecraft.getMinecraft().gameSettings.keyBindsHotbar[3].getKeyCode();
			int slot5 = Minecraft.getMinecraft().gameSettings.keyBindsHotbar[4].getKeyCode();
			int slot6 = Minecraft.getMinecraft().gameSettings.keyBindsHotbar[5].getKeyCode();
			int slot7 = Minecraft.getMinecraft().gameSettings.keyBindsHotbar[6].getKeyCode();
			int slot8 = Minecraft.getMinecraft().gameSettings.keyBindsHotbar[7].getKeyCode();
			int slot9 = Minecraft.getMinecraft().gameSettings.keyBindsHotbar[8].getKeyCode();

			//Check if one of the number 1 - 9 keys are pressed
			if (Keyboard.isKeyDown(slot1) || Keyboard.isKeyDown(slot2) || Keyboard.isKeyDown(slot3) || Keyboard.isKeyDown(slot4) || Keyboard.isKeyDown(slot5) 
					|| Keyboard.isKeyDown(slot6) || Keyboard.isKeyDown(slot7) || Keyboard.isKeyDown(slot8) || Keyboard.isKeyDown(slot9)){
				Minecraft.getMinecraft().thePlayer.closeScreen(); // Force close GUI
			}
		}
	}
}
