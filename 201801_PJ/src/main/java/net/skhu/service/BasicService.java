package net.skhu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.skhu.dto.Basic;
import net.skhu.mapper.BasicMapper;
import net.skhu.model.Pagination;

@Service
public class BasicService {

    @Autowired BasicMapper basicMapper;

    public Basic findOne(String recipe_id) {
        return basicMapper.findOne(recipe_id);
    }

    public List<Basic> findAll(Pagination pagination) {
        int count = basicMapper.count(pagination);
        pagination.setRecordCount(count);
        return basicMapper.findAll(pagination);
    }

    /*public int insertBasic(BasicModel b, int recipe_id) {
    	Basic last = basicMapper.findTopByrecipeIdOrderByNoDesc(recipe_id);
        int no = (last == null) ? 1 : last.get() + 1;

        Basic basic = new basic();
        basic.setBoardId(boardId);
        basic.setUserId(userId);
        basic.setWriteTime(new Date());
        basic.setNo(no);
        basic.setTitle(a.getTitle());
        basic.setBody(a.getBody());
        basicMapper.insert(basic);
        return article.getRecipe_id();
    }*/

    public void delete(String recipe_id) {
        basicMapper.delete(recipe_id);
    }
}

