package de.unbotheredstudios.moreutils.objects;

import de.unbotheredstudios.moreutils.MoreUtils;
import de.unbotheredstudios.moreutils.init.ItemInit;
import de.unbotheredstudios.moreutils.proxy.ClientProxy;
import de.unbotheredstudios.moreutils.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.DECORATIONS);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        MoreUtils.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
