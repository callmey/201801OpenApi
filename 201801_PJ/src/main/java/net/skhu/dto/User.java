package net.skhu.dto;
import lombok.Data;

@Data
public class User {

	int id;
	String LoginId;
	String password;
	String name;
	String email;
	boolean enabled;
	String userType;
}
