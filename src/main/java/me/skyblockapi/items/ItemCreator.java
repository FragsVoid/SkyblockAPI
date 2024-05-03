package me.skyblockapi.items;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

import static me.skyblockapi.message.MessageManager.hexTranslator;

public class ItemCreator {

    public static ItemStack createItem(Material material) {

        return new ItemStack(material);
    }

    public static ItemStack createItem(Material material, int amount) {

        return new ItemStack(material, amount);
    }

    public static ItemStack createItem(Material material, int amount, String name) {
        if (amount == 0) {
            amount = 1;
        }
        ItemStack itemStack = new ItemStack(material, amount);
        ItemMeta meta = itemStack.getItemMeta();
        meta.displayName(Component.text(hexTranslator(name)));
        itemStack.setItemMeta(meta);

        return itemStack;
    }

    public static ItemStack createItem(Material material, int amount, String name, ArrayList<String> lore) {
        if (amount == 0) {
            amount = 1;
        }
        ItemStack itemStack = new ItemStack(material, amount);
        ItemMeta meta = itemStack.getItemMeta();
        if (name != null) {
            meta.displayName(Component.text(hexTranslator(name)));
        }

        ArrayList<Component> finaLore = new ArrayList<>();
        for (String line : lore) {
            finaLore.add(Component.text(hexTranslator(line)));
        }
        meta.lore(finaLore);

        itemStack.setItemMeta(meta);

        return itemStack;
    }

    public static void addFlags(ItemStack item, ItemFlag flags) {
        item.addItemFlags(flags);
    }

    public static void addFlags(ItemStack item, ArrayList<ItemFlag> flags) {

        for (ItemFlag flag : flags) {
            item.addItemFlags(flag);
        }
    }
}
