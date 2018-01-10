package net.skhu.mapper;

import java.util.List;

import net.skhu.dto.Cooking;
import net.skhu.model.Pagination;

public interface CookingMapper {

	Cooking findOne(String recipe_id);
	List<Cooking> findAll(Pagination pagination);
	int count(Pagination pagination);
    void delete(String recipe_id);
    //void update(@Param("id") String recipe_id, @Param("sumry") String sumry);
    //void insert(Cooking cooking);

}
