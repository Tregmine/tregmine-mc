package info.tregmine.commands;

import info.tregmine.Tregmine;
import info.tregmine.api.GenericPlayer;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;

import static org.bukkit.ChatColor.YELLOW;

public class GameModeCommand extends AbstractCommand {
    private GameMode mode;

    public GameModeCommand(Tregmine tregmine, String name, GameMode mode) {
        super(tregmine, name, Tregmine.PermissionDefinitions.DONATOR_REQUIRED, true);
        this.mode = mode;
    }

    @Override
    public boolean handlePlayer(GenericPlayer player, String[] args) {
        if (this.mode != null) {
            if (!player.getRank().getPermittedGamemodes().contains(this.mode)) {
                error(player, "You don't have the permissions to switch to " + this.mode.name().toLowerCase() + "!");
                return true;
            }
            player.setGameMode(mode);
            player.sendMessage(YELLOW + "You are now in " + mode.toString().toLowerCase() + " mode. ");

            if (player.getRank().canFly()) {
                player.setAllowFlight(true);
            }
        } else {
            //Generic Mode!
            if (args.length != 1) {
                String modes = "";
                for (GameMode m : GameMode.values()) {
                    ChatColor color =
                            player.getRank().getPermittedGamemodes().contains(m) ? ChatColor.GREEN : ChatColor.RED;
                    modes += m.name().toLowerCase() + " ";
                }
                player.sendMessage(ChatColor.AQUA + "Gamemodes available: " + modes);
                return true;
            }
            GameMode switchTo;
            try {
                switchTo = GameMode.valueOf(args[0].toUpperCase());
            } catch (IllegalArgumentException e) {
                error(player, "The specified gamemode does not exist!");
                return true;
            }
            if (!player.getRank().getPermittedGamemodes().contains(switchTo)) {
                error(player, "You don't have the permissions to switch to " + switchTo.name().toLowerCase() + "!");
                return true;
            }
            player.setGameMode(switchTo);
            player.sendMessage(YELLOW + "You are now in " + switchTo.toString().toLowerCase() + " mode. ");

            if (player.getRank().canFly()) {
                player.setAllowFlight(true);
            }
        }

        return true;
    }
}
