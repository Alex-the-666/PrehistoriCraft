package net.andrewplayz.prehistoricraft.server.entity.hostile;

import net.andrewplayz.prehistoricraft.server.entity.EntityPrehistoric;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.world.World;

public class EntityTroodon extends EntityPrehistoric{
    public EntityTroodon(World worldIn){
        super(worldIn);
        this.tasks.addTask(1, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(2, new EntityAISwimming(this));
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(30.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.24D);
        this.setSize(1.2F, 1.5F);
    }

    @Override
    public boolean canDespawn()
    {
        return false;
    }
}