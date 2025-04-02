
package ch.noseryoung.projekt295.api.retail_store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface RetailRepository extends JpaRepository<RetailStore, UUID> {
}
