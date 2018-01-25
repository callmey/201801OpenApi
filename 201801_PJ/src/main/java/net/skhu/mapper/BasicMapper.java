package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import net.skhu.dto.Basic;
import net.skhu.model.Option;
import net.skhu.model.Pagination;
@Mapper
public interface BasicMapper {
	Basic findOne(int recipe_id);
    int count(Pagination pagination);
    List<Basic> findAll(Pagination pagination);

    Option[] searchBy= { new Option(0,"검색없음"), new Option(1,"메뉴이름"),
    						new Option(2,"칼로리"), new Option(3,"유형분류")};
    Option[] orderBy= { new Option(0,"메뉴번호"), new Option(1,"칼로리"),
						new Option(2,"유형이름오름차순")};




}
