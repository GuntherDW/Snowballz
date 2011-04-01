package com.nohupgaming.minecraft.util;

import com.nohupgaming.minecraft.Snowballz;
import org.bukkit.entity.Player;

/**
 * @author GuntherDW
 */
public class SnowballzUtil {
    public SnowballzUtil()
    {
    }

    public static boolean hasPermission(Snowballz p, Player pl, String path)
    {
        if(p.getPermissionHandler() != null && pl != null)
            return p.getPermissionHandler().has(pl, path);
        else
            return true;
    }
}
