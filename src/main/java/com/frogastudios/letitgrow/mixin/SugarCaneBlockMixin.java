package com.frogastudios.letitgrow.mixin;
import net.minecraft.block.CactusBlock;
import net.minecraft.block.SugarCaneBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;


@Mixin(SugarCaneBlock.class)
public class SugarCaneBlockMixin
{
    @ModifyConstant(method = "randomTick", constant = @Constant(intValue = 3))
    private static int modifyHeightLimit(int i) {
        // Use coordinates in tag to determine the position of the chunk
        return 256;
    }
}