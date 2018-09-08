package spring.dao;


import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import spring.model.CyUser;

@Repository
public interface CyUserDao {

	@Select("SELECT * FROM cy_user cu WHERE cu.id = #{id}")
	CyUser getUserById(Long id);

}
