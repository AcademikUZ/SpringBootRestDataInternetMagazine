package fan.company.springbootrestdatainternetmagazine.repository;

import fan.company.springbootrestdatainternetmagazine.entity.Currency;
import fan.company.springbootrestdatainternetmagazine.projection.CustomCurrency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "currency", collectionResourceRel = "list", excerptProjection = CustomCurrency.class)
public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}
