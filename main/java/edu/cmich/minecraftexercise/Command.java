package edu.cmich.minecraftexercise;

import java.util.List;

import edu.cmich.minecraftexercise.util.Log;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;

public class Command extends CommandBase {

	@Override
	public String getCommandName() {
		return "checkin";
	}

	@Override
	public String getCommandUsage(ICommandSender p_71518_1_) {
		return "/checkin";
	}

	@Override
	public boolean canCommandSenderUseCommand(ICommandSender sender) {
		return sender instanceof EntityPlayer;		
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args) {
		String playerName = sender.getCommandSenderName();
		Log.info(playerName + " wants to check in");
		int buffTime = Network.lookUp(playerName);
		Log.info("Adding speed buff to " + playerName + " for " + buffTime);
		addBuff((EntityPlayer) sender, buffTime);
	}

	private void addBuff(EntityPlayer sender, int buffTime) {
		//id, duration, amplifier
		//Later do something like if duration > 1000 duration -1000 and ++amplifier
		//duration is in ticks 1/20 of a second
		sender.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, buffTime, 0));
	}
}
