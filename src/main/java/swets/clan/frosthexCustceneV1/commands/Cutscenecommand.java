package swets.clan.frosthexCustceneV1.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import swets.clan.frosthexCustceneV1.Cutscene;

public class Cutscenecommand implements CommandExecutor{

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String [] args) {
        if (!(sender instanceof Player)){
            sender.sendMessage("Only players can run this command");
            return true;
        }

        Player player = (Player) sender;

        if (args[1].equalsIgnoreCase("create")){
            Cutscene thing = new Cutscene(args[2]);
        }
        return true;
    }
}
