package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import net.skhu.dto.Ingredient;
@Mapper
public interface IngredientMapper {

    List<Ingredient> findByRecipeId(int recipe_id);



}

