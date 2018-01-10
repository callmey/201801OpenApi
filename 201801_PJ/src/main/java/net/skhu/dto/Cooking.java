package net.skhu.dto;
import lombok.Data;

@Data
public class Cooking {
	String recipe_id;
	String cooking_no; //요리설명순서
	String cooking_dc; //요리설명
	String image_url; //과정이미지
}
