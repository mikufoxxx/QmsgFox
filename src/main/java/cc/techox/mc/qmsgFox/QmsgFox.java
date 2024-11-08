package cc.techox.mc.qmsgFox;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class QmsgFox extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        sayConsole("§6QmsgFox plugin startup");
        Bukkit.getPluginManager().registerEvents(new PmsgListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        sayConsole("§6QmsgFox plugin shutdown");
    }

    public void sayConsole(String consoleMsg) {
        ConsoleCommandSender consoleSender = Bukkit.getConsoleSender();
        consoleSender.sendMessage(consoleMsg);
    }
}
