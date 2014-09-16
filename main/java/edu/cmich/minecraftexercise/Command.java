package edu.cmich.minecraftexercise;

import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
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
	public int getRequiredPermissionLevel()
	{
		return 0;
	}

	@Override
	public boolean canCommandSenderUseCommand(ICommandSender sender) {
		return sender instanceof EntityPlayer;		
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args) {
		String playerName = sender.getCommandSenderName();
		System.out.println(playerName + " wants to check in");
	}
}
