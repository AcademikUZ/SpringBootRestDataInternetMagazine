package fan.company.springbootrestdatainternetmagazine.repository;

import fan.company.springbootrestdatainternetmagazine.entity.Users;
import fan.company.springbootrestdatainternetmagazine.projection.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "users", collectionResourceRel = "list", excerptProjection = CustomUser.class)
public interface UsersRepository extends JpaRepository<Users, Long> {
    Users findTopByOrderByIdDesc();
}
