package fan.company.springbootrestdatainternetmagazine.repository;


import fan.company.springbootrestdatainternetmagazine.entity.Category;
import fan.company.springbootrestdatainternetmagazine.projection.CustomB2BClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "B2BClient", collectionResourceRel = "list", excerptProjection = CustomB2BClient.class)
public interface B2BClientRepository extends JpaRepository<Category, Long> {
}
