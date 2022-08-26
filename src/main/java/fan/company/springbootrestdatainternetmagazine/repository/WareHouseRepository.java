package fan.company.springbootrestdatainternetmagazine.repository;

import fan.company.springbootrestdatainternetmagazine.entity.WareHouse;
import fan.company.springbootrestdatainternetmagazine.projection.CustomWareHouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse", collectionResourceRel = "list", excerptProjection = CustomWareHouse.class)
public interface WareHouseRepository extends JpaRepository<WareHouse, Long> {
}
