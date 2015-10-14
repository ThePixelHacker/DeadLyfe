package inet.pixel.deadlyfe.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import inet.pixel.deadlyfe.DeadLyfe;

public class PlayerJoin implements Listener{
	
	private DeadLyfe dl;
	
	public PlayerJoin(DeadLyfe ld) {
		this.dl = ld;
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e){
		if(!dl.hasPlayerStatData(e.getPlayer())){
			dl.createPlayerStatData(e.getPlayer());
		}
	}

}
