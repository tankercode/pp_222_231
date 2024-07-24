package web.repositories;

import org.springframework.stereotype.Repository;
import web.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UsersRepository extends JpaRepository<User, Integer>{
}
