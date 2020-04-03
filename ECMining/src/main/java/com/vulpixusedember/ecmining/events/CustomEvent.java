package com.vulpixusedember.ecmining.events;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;

public class CustomEvent 
{
	public void onMineEvent(BreakEvent event) 
	{
		EntityPlayer miner = event.getPlayer();
		Block minedblock = event.getState().getBlock();
		
		if(miner.getHeldItemMainhand().getItem() != Items.STONE_PICKAXE) 
		{
			if(minedblock.equals(Blocks.IRON_ORE)) 
			{
				event.setCanceled(true);
				return;
			}
		}
	}
}
