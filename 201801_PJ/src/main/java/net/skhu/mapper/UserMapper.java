package net.skhu.mapper;
import org.apache.ibatis.annotations.Mapper;

import net.skhu.dto.User;
@Mapper
public interface UserMapper {


	User findOneByLoginId(String loginId);
	void save ( User user );


}
