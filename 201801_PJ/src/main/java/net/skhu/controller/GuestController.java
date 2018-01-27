package net.skhu.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.skhu.dto.Basic;
import net.skhu.dto.User;
import net.skhu.mapper.BasicMapper;
import net.skhu.mapper.CookingMapper;
import net.skhu.mapper.IngredientMapper;
import net.skhu.mapper.UserMapper;
import net.skhu.model.Option;
import net.skhu.model.Pagination;
import net.skhu.model.UserRegistrationModel;

@Controller
@RequestMapping("guest")
public class GuestController {
	@Autowired
	BasicMapper basicMapper;
	@Autowired
	IngredientMapper ingredientMapper;
	@Autowired
	CookingMapper cookingMapper;
	@Autowired
	UserMapper userMapper;


	@RequestMapping(value = "dynamicSQL2")
	public String dynamicSQL2(Pagination pagination, Model model) {
		int count = basicMapper.count(pagination);
		pagination.setRecordCount(count);

		List<Basic> list = basicMapper.findAll(pagination);
		model.addAttribute("list", list);

		Option[] orderBy = basicMapper.orderBy;
		Option[] searchBy = basicMapper.searchBy;

		model.addAttribute("orderBy", orderBy);
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

	@RequestMapping(value = "register", method = RequestMethod.GET)
	public String register(UserRegistrationModel user, Model model) {

		return "guest/register";
	}

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String register(@Valid UserRegistrationModel userModel, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "guest/register";
		}
		User user = userModel.toUser();

		user.setEnabled(true);
		user.setUserType("회원");
		userMapper.save(user);
		return "redirect:/guest/success";
	}

	@RequestMapping("success")
	public String success() {
		return "guest/success";
	}
}
