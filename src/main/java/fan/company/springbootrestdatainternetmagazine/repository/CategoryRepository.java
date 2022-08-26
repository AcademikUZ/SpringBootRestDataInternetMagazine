package fan.company.springbootrestdatainternetmagazine.repository;


import fan.company.springbootrestdatainternetmagazine.entity.Category;
import fan.company.springbootrestdatainternetmagazine.projection.CustomCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "category", collectionResourceRel = "list", excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
