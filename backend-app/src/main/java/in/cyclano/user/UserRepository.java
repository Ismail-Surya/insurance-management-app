package in.cyclano.user;

import java.util.List;
import java.util.Optional;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

	private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public UserRepository (NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}
	
	public Optional <User> findByUsername (String username) {
		String sql = "SELECT id, username, password_hash, enabled FROM ima_users WHERE username = :username";
		var userList = namedParameterJdbcTemplate.query(sql,
				new MapSqlParameterSource().addValue("username", username),
				(myRs, rowNum) -> {
					User u = new User();
					u.setId(myRs.getInt("id"));
					u.setUsername(myRs.getString("username"));
					u.setPasswordHash(myRs.getString("password_hash"));
					u.setEnabled(myRs.getBoolean("enabled"));
					return u;
				});
		
		if (userList.isEmpty()) {
			return Optional.empty();
		}
		
		User user = userList.get(0);
		user.setRoles(findRolesByUserId(user.getId()));
		return Optional.of(user);
	}

	private List<Role> findRolesByUserId(Integer userId) {
		
		String sql = "SELECT r.id, r.name FROM ima_roles_for_users rfu JOIN\r\n"
				+ "    ima_roles r ON r.id = rfu.role_id\r\n"
				+ "    WHERE rfu.user_id = :userId";
		
		List <Role> theRoles = namedParameterJdbcTemplate.query(sql,
				new MapSqlParameterSource().addValue("userId", userId),
				BeanPropertyRowMapper.newInstance(Role.class));
		
		return theRoles;
	}
	
}
