package swets.clan.frosthexCustceneV1.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Cutscenecommand implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String [] args) {
        if (!(sender instanceof Player)){
            sender.sendMessage("Only players can run this command");
            return true;
        }

        Player player = (Player) sender;

        if (args[1] == "create"){
            thing = cutscene();
        }
        return true;
    }
}
