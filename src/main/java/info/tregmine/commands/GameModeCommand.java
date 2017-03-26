package info.tregmine.commands;

import static org.bukkit.ChatColor.YELLOW;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;

import info.tregmine.Tregmine;
import info.tregmine.api.TregminePlayer;

public class GameModeCommand extends AbstractCommand {
	private GameMode mode;

	public GameModeCommand(Tregmine tregmine, String name, GameMode mode) {
		super(tregmine, name);
		this.mode = mode;
	}

	@Override
	public boolean handlePlayer(TregminePlayer player, String[] args) {
		if (player.getWorld().getName().equalsIgnoreCase("vanilla") || player.isInVanillaWorld()) {
			player.setFireTicks(30);
			player.sendStringMessage(ChatColor.RED + "You cannot use that command in this world!");
			return true;
		}
		if(this.mode != null) {
			if (!player.getRank().getPermittedGamemodes().contains(this.mode)) {
				player.sendStringMessage(ChatColor.RED + "You don't have the permissions to switch to " + this.mode.name().toLowerCase() + "!");
				return true;
			}
			player.setGameMode(mode);
			player.sendStringMessage(YELLOW + "You are now in " + mode.toString().toLowerCase() + " mode. ");

			if (player.getRank().canFly()) {
				player.setAllowFlight(true);
			}
		}else{
			//Generic Mode!
			if(args.length != 1){
				player.sendStringMessage(ChatColor.RED + "You must specify a gamemode to switch to!");
				return true;
			}
			GameMode switchTo = GameMode.valueOf(args[0].toUpperCase());
			if(switchTo == null){
				player.sendStringMessage(ChatColor.RED + "The specified gamemode does not exist!");
				return true;
			}
			if (!player.getRank().getPermittedGamemodes().contains(switchTo)) {
				player.sendStringMessage(ChatColor.RED + "You don't have the permissions to switch to " + switchTo.name().toLowerCase() + "!");
				return true;
			}
			player.setGameMode(switchTo);
			player.sendStringMessage(YELLOW + "You are now in " + switchTo.toString().toLowerCase() + " mode. ");

			if (player.getRank().canFly()) {
				player.setAllowFlight(true);
			}
		}

		return true;
	}
}