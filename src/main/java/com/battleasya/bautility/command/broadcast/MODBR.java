package com.battleasya.bautility.command.broadcast;

import com.battleasya.bautility.handler.Util;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class MODBR implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {

        if(!sender.hasPermission("staffbc.use")) {
            Util.msgPlayer(sender, "&8(&4&l!&8) &6Unknown Command.");
            return true;
        }

        if (args.length == 0) {
            Util.msgPlayer(sender, "&cSyntax: /modbr <message>");
            return true;
        }

        StringBuilder str = new StringBuilder();

        for (String arg : args) {
            str.append(arg).append(" ");
        }

        Util.broadcast("");
        Util.broadcast("&4&l[&a&l" + sender.getName() + "&4&l] &c" + str);
        Util.broadcast("");
        return true;

    }

}