package swets.clan.frosthexCustceneV1.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import swets.clan.frosthexCustceneV1.cutscene;

public class Cutscenecommand implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can run this command");
            return true;
        }

        Player player = (Player) sender;

        if (args.length >= 3 && args[1].equalsIgnoreCase("create")) {
            cutscene thing = new cutscene(args[2]);
            player.sendMessage("Created cutscene: " + args[2]);
        } else {
            player.sendMessage("Usage: /<command> <something> create <cutsceneName>");
        }

        return true;
    }

}
