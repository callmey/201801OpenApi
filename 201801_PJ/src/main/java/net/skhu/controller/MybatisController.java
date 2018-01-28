package net.skhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.skhu.dto.Basic;
import net.skhu.dto.Cooking;
import net.skhu.dto.Ingredient;
import net.skhu.mapper.BasicMapper;
import net.skhu.mapper.CookingMapper;
import net.skhu.mapper.IngredientMapper;
import net.skhu.model.Option;
import net.skhu.model.Pagination;
@Controller
@RequestMapping("mybatis")
public class MybatisController {

	@Autowired
	BasicMapper basicMapper;
	@Autowired
	IngredientMapper ingredientMapper;
	@Autowired
	CookingMapper cookingMapper;

	@RequestMapping(value = "dynamicSQL2")
	public String dynamicSQL2(Pagination pagination, Model model) {
		int count = basicMapper.count(pagination);
		pagination.setRecordCount(count);

		List<Basic> list = 	basicMapper.findAll(pagination);
		model.addAttribute("list", list);

		Option []orderBy = basicMapper.orderBy;
		Option [] searchBy = basicMapper.searchBy;

		model.addAttribute("orderBy",orderBy);
		model.addAttribute("searchBy", searchBy);


		return "mybatis/dynamicSQL2";

	}

	@RequestMapping(value="igr", method=RequestMethod.GET)
	public String igr (Model model, @RequestParam("recipe_id") int id) {
		List<Ingredient> ingredients = ingredientMapper.findByRecipeId(id);
		model.addAttribute("ingredients",ingredients);
		return "mybatis/igr";
	}


	@RequestMapping(value="slide",method=RequestMethod.GET)
	public String slide (/*Pagination slide,*/ Model model ,@RequestParam("recipe_id") int id ) {

		//int count = cookingMapper.count(slide);
		//slide.setRecordCount(count);

		List<Cooking> list = cookingMapper.findByRecipeId(/*slide,*/ id);
		model.addAttribute("list", list);

		return "mybatis/slide";
	}


}