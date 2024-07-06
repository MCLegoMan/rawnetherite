/*
    Raw Netherite
    Contributor(s): MCLegoMan
    Github: https://github.com/MCLegoMan/rawnetherite
    Licence: LGPL-3.0-or-later
*/

package com.mclegoman.rawnetherite.common;

import com.mclegoman.rawnetherite.common.registry.Registries;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class RawNetherite implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
	    Registries.init();
    }
}
