/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.weathercampfire.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.weathercampfire.WeatherCampfireMod;

@EventBusSubscriber
public class WeatherCampfireModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WeatherCampfireMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(WeatherCampfireModBlocks.WEATHER_CAMPFIRE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(WeatherCampfireModItems.HERBS.get());
			tabData.accept(WeatherCampfireModItems.RAIN_HERBS.get());
			tabData.accept(WeatherCampfireModItems.SUN_HERBS.get());
			tabData.accept(WeatherCampfireModItems.THUNDERSTORM_HERBS.get());
		}
	}
}