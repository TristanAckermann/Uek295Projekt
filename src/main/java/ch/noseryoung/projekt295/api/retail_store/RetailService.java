package ch.noseryoung.projekt295.api.retail_store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class RetailService {

    @Autowired
    private RetailRepository repository;
    public List<RetailStore> getAllRetailStores() {
        return repository.findAll();
    }
    public Optional<RetailStore> getRetailStoreById(UUID id) {
        return repository.findById(id);
    }
    public RetailStore createRetailStore(RetailStore retailStore) {
        return repository.save(retailStore);
    }
    public RetailStore updateRetailStore(RetailStore retailStore) {
        if (!repository.existsById(retailStore.getStoreId())) {
            throw new RuntimeException("RetailStore mit ID " + retailStore.getStoreId() + " nicht gefunden.");
        }
        return repository.save(retailStore);
    }
    public void deleteRetailStore(UUID id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("RetailStore mit ID " + id + " nicht gefunden.");
        }
        repository.deleteById(id);
    }

}
