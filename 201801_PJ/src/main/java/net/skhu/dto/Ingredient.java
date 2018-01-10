package net.skhu.dto;
import lombok.Data;

@Data
public class Ingredient {
	String recipe_id;
	String irdnt_sn; //재료순번
	String irdnt_nm; //재료명
	String irdnt_cpcty; //재료용량
	String irdnt_ty_nm; //재료타입명
}
