/*
    Raw Netherite
    Contributor(s): MCLegoMan
    Github: https://github.com/MCLegoMan/rawnetherite
    Licence: LGPL-3.0-or-later
*/

package com.mclegoman.rawnetherite.common.registry;

import com.mclegoman.rawnetherite.common.block.Blocks;
import com.mclegoman.rawnetherite.common.item.ItemGroups;
import com.mclegoman.rawnetherite.common.item.Items;
import com.mclegoman.rawnetherite.common.loot.LootTables;

public class Registries {
	public static void init() {
		Blocks.init();
		Items.init();
		LootTables.init();
		ItemGroups.init();
	}
}
