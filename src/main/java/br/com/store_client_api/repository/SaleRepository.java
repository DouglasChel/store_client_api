package br.com.store_client_api.repository;
import br.com.store_client_api.model.Sales;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends MongoRepository<Sales, String> {

}
