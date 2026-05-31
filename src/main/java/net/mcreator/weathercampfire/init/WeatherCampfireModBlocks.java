/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.weathercampfire.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.weathercampfire.block.WeatherCampfireBlock;
import net.mcreator.weathercampfire.WeatherCampfireMod;

public class WeatherCampfireModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(WeatherCampfireMod.MODID);
	public static final DeferredBlock<Block> WEATHER_CAMPFIRE;
	static {
		WEATHER_CAMPFIRE = REGISTRY.register("weather_campfire", WeatherCampfireBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}