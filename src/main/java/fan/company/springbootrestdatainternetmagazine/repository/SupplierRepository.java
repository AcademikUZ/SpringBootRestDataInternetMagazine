package fan.company.springbootrestdatainternetmagazine.repository;

import fan.company.springbootrestdatainternetmagazine.entity.Supplier;
import fan.company.springbootrestdatainternetmagazine.projection.CustomSupplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "supplier", collectionResourceRel = "list", excerptProjection = CustomSupplier.class)
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
