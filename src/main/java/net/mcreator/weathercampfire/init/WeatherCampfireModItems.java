/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.weathercampfire.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.weathercampfire.item.ThunderstormHerbsItem;
import net.mcreator.weathercampfire.item.SunHerbsItem;
import net.mcreator.weathercampfire.item.RainHerbsItem;
import net.mcreator.weathercampfire.item.HerbsItem;
import net.mcreator.weathercampfire.WeatherCampfireMod;

public class WeatherCampfireModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(WeatherCampfireMod.MODID);
	public static final DeferredItem<Item> WEATHER_CAMPFIRE;
	public static final DeferredItem<Item> HERBS;
	public static final DeferredItem<Item> RAIN_HERBS;
	public static final DeferredItem<Item> SUN_HERBS;
	public static final DeferredItem<Item> THUNDERSTORM_HERBS;
	static {
		WEATHER_CAMPFIRE = block(WeatherCampfireModBlocks.WEATHER_CAMPFIRE);
		HERBS = REGISTRY.register("herbs", HerbsItem::new);
		RAIN_HERBS = REGISTRY.register("rain_herbs", RainHerbsItem::new);
		SUN_HERBS = REGISTRY.register("sun_herbs", SunHerbsItem::new);
		THUNDERSTORM_HERBS = REGISTRY.register("thunderstorm_herbs", ThunderstormHerbsItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}