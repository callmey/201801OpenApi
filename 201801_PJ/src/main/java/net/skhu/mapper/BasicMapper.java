package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import net.skhu.dto.Basic;
import net.skhu.model.Pagination;

@Mapper
public interface BasicMapper {

	 	Basic findOne(String recipe_id);
	    List<Basic> findAll(Pagination pagination);
	    int count(Pagination pagination);
	    Basic findTopByRecipeIdOrderByNoDesc(String recipe_id);
	    void delete(String recipe_id);
	    //void update(@Param("id") String recipe_id, @Param("sumry") String sumry);
	    void insert(Basic basic);

}
