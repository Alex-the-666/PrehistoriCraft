package net.andrewplayz.prehistoricraft.server.block.blocks;

import net.andrewplayz.prehistoricraft.server.creativetab.PhCCreativeTabHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockChronositeBlock extends Block {
    public BlockChronositeBlock(Material material) {
        super(material);

        this.setHardness(5.0f);
        this.setResistance(30.0f);
        this.setCreativeTab(PhCCreativeTabHandler.prehistoricraftTab);
    }
}
