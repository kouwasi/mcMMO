/*
package com.gmail.nossr50.config.mods;


public class EntityConfigManager {
    //TODO: Commented out until modded servers appear again
    */
/*public EntityConfigManager(mcMMO plugin) {
        Pattern middlePattern = Pattern.compile("entities\\.(?:.+)\\.yml");
        Pattern startPattern = Pattern.compile("(?:.+)\\.entities\\.yml");
        File dataFolder = new File(mcMMO.getModDirectory());
        File vanilla = new File(dataFolder, "entities.default.yml");
        ModManager modManager = mcMMO.getModManager();

        if (!vanilla.exists()) {
            plugin.saveResource(vanilla.getParentFile().getName() + File.separator + "entities.default.yml", false);
        }

        for (String fileName : dataFolder.list()) {
            if (!middlePattern.matcher(fileName).matches() && !startPattern.matcher(fileName).matches()) {
                continue;
            }

            File file = new File(dataFolder, fileName);

            if (file.isDirectory()) {
                continue;
            }

            modManager.registerCustomEntities(new CustomEntityConfig(fileName));
        }
    }*//*

}
*/
