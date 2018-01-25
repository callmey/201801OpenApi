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

    public Basic findOne(int recipe_id) {
        return basicMapper.findOne(recipe_id);
    }

    public List<Basic> findAll(Pagination pagination) {
        int count = basicMapper.count(pagination);
        pagination.setRecordCount(count);
        return basicMapper.findAll(pagination);
    }

    /*public int insertBasic(@RequestBody Basic b, int recipe_id) {
    	Basic last = basicMapper.findTopByRecipeIdOrderByDesc(recipe_id);
        int no = (last == null) ? 1 : last.getRecipe_id() + 1;
        System.out.println(no);
        Basic basic = new Basic();
        basic.setRecipe_nm_ko(b.getRecipe_nm_ko());
        basic.setSumry(b.getSumry());
        basic.setNation_nm(b.getNation_nm());
        basic.setRecipe_id(no);
        basic.setTy_nm(b.getTy_nm());
        basic.setCalorie(b.getCalorie());
        basic.setImg_url(b.getImg_url());
        basicMapper.insert(basic);
        return basic.getRecipe_id();
    } */

    /*public void delete(int recipe_id) {
        basicMapper.delete(recipe_id);
    }*/
}

