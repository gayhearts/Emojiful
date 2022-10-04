package com.hrznstudio.emojiful.datapack;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;

public class EmojiRecipe implements Recipe<Container> {

    private final ResourceLocation recipeName;
    private final String category;
    private final String name;
    private final String url;

    public EmojiRecipe(ResourceLocation recipeName, String category, String name, String url) {
        this.recipeName = recipeName;
        this.category = category;
        this.name = name;
        this.url = url;
    }

    @Override
    public boolean matches(Container inv, Level worldIn) {
        return false;
    }

    @Override
    public ItemStack assemble(Container inv) {
        return ItemStack.EMPTY;
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return false;
    }

    @Override
    public ItemStack getResultItem() {
        return ItemStack.EMPTY;
    }

    @Override
    public ResourceLocation getId() {
        return recipeName;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Emojiful.EMOJI_RECIPE_SERIALIZER.get();
    }

    @Override
    public RecipeType<?> getType() {
        return Emojiful.EMOJI_RECIPE_TYPE.get();
    }

    public ResourceLocation getRecipeName() {
        return recipeName;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
