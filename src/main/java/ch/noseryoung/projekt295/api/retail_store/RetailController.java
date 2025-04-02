
package ch.noseryoung.projekt295.api.retail_store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/retailstores")


public class RetailController {

    @Autowired
    private RetailService service;

    @PostMapping
    public ResponseEntity<RetailStore> createRetailStore(@RequestBody RetailStore retailStore) {
        return ResponseEntity.status(201).body(service.createRetailStore(retailStore));
    }

    @GetMapping
    public ResponseEntity<List<RetailStore>> getAllRetailStores() {
        return ResponseEntity.ok(service.getAllRetailStores());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RetailStore> getRetailStoreById(@PathVariable UUID id) {
        Optional<RetailStore> store = service.getRetailStoreById(id);
        return store.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<RetailStore> updateRetailStore(@PathVariable UUID id, @RequestBody RetailStore retailStore) {
        Optional<RetailStore> existingStore = service.getRetailStoreById(id);
        if (existingStore.isPresent()) {
            retailStore.setStoreId(id);
            return ResponseEntity.ok(service.updateRetailStore(retailStore));
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping
    public ResponseEntity<Void> deleteRetailStore(@PathVariable UUID id) {
        Optional<RetailStore> existingStore = service.getRetailStoreById(id);
        if (existingStore.isPresent()) {
            service.deleteRetailStore(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
