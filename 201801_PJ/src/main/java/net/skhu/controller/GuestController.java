package net.skhu.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.dto.Basic;
import net.skhu.mapper.BasicMapper;
import net.skhu.mapper.CookingMapper;
import net.skhu.mapper.IngredientMapper;
import net.skhu.model.Option;
import net.skhu.model.Pagination;
@Controller
@RequestMapping("guest")
public class GuestController {
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


		return "guest/dynamicSQL2";

	}

	@RequestMapping(value = "index")
    public String index() {
        return "guest/index";
    }
	@RequestMapping(value = "login")
    public String login() {
        return "guest/login";
    }

}
