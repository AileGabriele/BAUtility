package com.battleasya.bautility;


import com.battleasya.bautility.command.broadcast.MODBR;
import com.battleasya.bautility.command.broadcast.ADMINBR;
import org.bukkit.plugin.java.JavaPlugin;

public class BAUtility extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Broadcast plugin enabled.");
        getCommand("modbr").setExecutor(new MODBR());
        getCommand("adminbr").setExecutor(new ADMINBR());
    }

}