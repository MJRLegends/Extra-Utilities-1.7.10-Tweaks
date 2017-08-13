package com.mjr.extraUtilitiesTweaks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = Constants.modID, name = Constants.modName, version = Constants.modVersion, dependencies = "required-after:ExtraUtilities; ")
public class ExtraUtilitiesTweaks {

	@Instance(Constants.modID)
	public static ExtraUtilitiesTweaks instance;
	public static Logger logger = LogManager.getLogger();

	@EventHandler
	@SideOnly(Side.CLIENT)
	public void preInit(FMLPreInitializationEvent event) {
		FMLCommonHandler.instance().bus().register(new EventHandlerClient());
	}
}