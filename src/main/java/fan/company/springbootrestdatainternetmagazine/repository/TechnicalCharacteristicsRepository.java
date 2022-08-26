package fan.company.springbootrestdatainternetmagazine.repository;

import fan.company.springbootrestdatainternetmagazine.entity.Users;
import fan.company.springbootrestdatainternetmagazine.projection.CustomTechnicalCharacteristics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "technicalcharacteristics", collectionResourceRel = "list", excerptProjection = CustomTechnicalCharacteristics.class)
public interface TechnicalCharacteristicsRepository extends JpaRepository<Users, Long> {
}
