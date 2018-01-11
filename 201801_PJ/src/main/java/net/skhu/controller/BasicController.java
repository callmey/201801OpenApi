package net.skhu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.support.ErrorPageFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.skhu.mapper.BasicMapper;
import net.skhu.mapper.CookingMapper;
import net.skhu.model.Pagination;
import net.skhu.service.BasicService;
import net.skhu.service.CookingService;

@Controller
@RequestMapping("basic")
public class BasicController {
	@Autowired BasicService basicService;
	@Autowired CookingService cookingService;
    @Autowired BasicMapper basicMapper;
    @Autowired CookingMapper cookingMapper;

	    @RequestMapping("list")
	    public String list(Pagination pagination, Model model) {
	        model.addAttribute("list", basicService.findAll(pagination));
	        return "basic/list";
	    }

	    @RequestMapping("view")
	    public String view(@RequestParam("recipe_id") int recipe_id, Pagination pagination, Model model) {
	        model.addAttribute("basic", basicService.findOne(recipe_id));
	        return "basic/view";
	    }

	    /*@RequestMapping(value="edit", method=RequestMethod.GET)
	    public String edit(@RequestParam("recipe_id") String recipe_id, Pagination pagination, Model model) {
	        model.addAttribute("basic", basicMapper.findOne(pagination.getRd()));
	        model.addAttribute("cookingModel", cookingService.findOne(recipe_id));
	        return "basic/edit";
	    }

	    @Transactional
	    @RequestMapping(value="edit", method=RequestMethod.POST)
	    public String edit(@Valid Cooking c, BindingResult bindingResult,
	            Pagination pagination, Model model) {
	        if (bindingResult.hasErrors()) {
	            model.addAttribute("cooking", cookingMapper.findOne(pagination.getRd()));
	            return "article/edit";
	        }
	        cookingService.update(c);
	        return "redirect:view?id=" + a.getId() + "&" + pagination.getQueryString();
	    }

	    @RequestMapping(value="create", method=RequestMethod.GET)
	    public String create(Pagination pagination, Model model) {
	        model.addAttribute("basic", basicMapper.findOne(pagination.getRd()));
	        model.addAttribute("cooking", new Cooking());
	        return "basic/edit";
	    }

	    @Transactional
	    @RequestMapping(value="create", method=RequestMethod.POST)
	    public String create(@Valid BasicModel b, BindingResult bindingResult,
	            Pagination pagination, Model model) {
	        if (bindingResult.hasErrors()) {
	            model.addAttribute("basic", basicMapper.findOne(pagination.getRd()));
	            return "article/edit";
	        }
	        int id = basicService.insertArticle(a, pagination.getRd(), 1);
	        return "redirect:view?id=" + id + "&" + pagination.getQueryString();
	    }

	    @RequestMapping(value="delete", method=RequestMethod.GET)
	    public String delete(@RequestParam("recpie_id") String recipe_id, Pagination pagination, Model model) {
	        basicService.delete(recipe_id);
	        return "redirect:list?" + pagination.getQueryString();
	    }*/
	    @Bean
	    public ErrorPageFilter errorPageFilter() {
	        return new ErrorPageFilter();
	    }

	    @Bean
	    public FilterRegistrationBean disableSpringBootErrorFilter(ErrorPageFilter filter) {
	        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
	        filterRegistrationBean.setFilter(filter);
	        filterRegistrationBean.setEnabled(false);
	        return filterRegistrationBean;
	    }
	}
