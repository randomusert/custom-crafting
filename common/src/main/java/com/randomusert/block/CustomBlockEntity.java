package com.randomusert.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class CustomBlockEntity extends BlockEntity {
    public CustomBlockEntity(BlockPos pos, BlockState state) {
        super(Machines.MACHINE1.get(), pos, state);
    }
}
