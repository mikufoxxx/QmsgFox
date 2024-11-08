package cc.techox.mc.qmsgFox;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class PmsgListener implements Listener {
    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent playerChatEvent){
        String playerChatMessage = playerChatEvent.getMessage();
        String playerName = playerChatEvent.getPlayer().getName();
        System.out.println(playerName + "说: " + playerChatMessage);
    }

}
