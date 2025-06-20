package swets.clan.frosthexCustceneV1;

import org.bukkit.plugin.java.JavaPlugin;
import swets.clan.frosthexCustceneV1.commands.Cutscenecommand;

public final class FrosthexCustceneV1 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("Cutscenecommand").setExecutor(new Cutscenecommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
