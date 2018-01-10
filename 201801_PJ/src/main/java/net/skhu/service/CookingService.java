package net.skhu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.skhu.dto.Cooking;
import net.skhu.mapper.CookingMapper;
import net.skhu.model.Pagination;

@Service
public class CookingService {
	@Autowired CookingMapper cookingMapper;

    public Cooking findOne(String recipe_id) {
        return cookingMapper.findOne(recipe_id);
    }

    public List<Cooking> findAll(Pagination pagination) {
        int count = cookingMapper.count(pagination);
        pagination.setRecordCount(count);
        return cookingMapper.findAll(pagination);
    }

    public void delete(String recipe_id) {
        cookingMapper.delete(recipe_id);
    }
}
