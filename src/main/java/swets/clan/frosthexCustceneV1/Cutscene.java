package swets.clan.frosthexCustceneV1;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class Cutscene {
    private String name;
    private List<Location> cutscenePath = new ArrayList<>();
    private Location endPosition;
    private int waitDuration = 5;

    public Cutscene(String name){
        this.name = name;
    }
    public List<Location> getPoses(){
        return cutscenePath;
    }

    public void addPosition(Location position){
        cutscenePath.add(position);
    }

    public void playCutscene(Player player){
        player.setGameMode(GameMode.SPECTATOR);

        //temporary solution 20/06/25
        for (Location point : cutscenePath){
            player.teleport(point);
            try {
                Thread.sleep(waitDuration * 1000); // assuming seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }// tekad was here
        //hi tekad
    }

    private void setEndPosition(Location end){
        endPosition = end;
    }
}