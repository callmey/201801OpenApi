package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import net.skhu.dto.Cooking;
import net.skhu.model.Pagination;

@Mapper
public interface CookingMapper {

	Cooking findOne(int recipe_id);
	List<Cooking> findAll(Pagination pagination);
	int count(Pagination pagination);
    void delete(int recipe_id);
    //void update(@Param("id") String recipe_id, @Param("sumry") String sumry);
    //void insert(Cooking cooking);

}
