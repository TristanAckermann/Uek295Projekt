package ch.noseryoung.projekt295.api.retail_store;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/retailstore")
public class RetailController {

    @Autowired
    private RetailService service;


    @Operation(summary = "Create a new Retail Store")
    @PostMapping("")
    public ResponseEntity<RetailStore> createRetailStore(@RequestBody RetailStore retailStore) {
        return ResponseEntity.status(201).body(service.createRetailStore(retailStore));
    }

    @Operation(summary = "Get all Retail Stores")
    @GetMapping("")
    public ResponseEntity<List<RetailStore>> getAllRetailStores() {
        return ResponseEntity.ok(service.getAllRetailStores());
    }

    @Operation(summary = "Get a Retail Store by ID")
    @GetMapping("/{id}")
    public ResponseEntity<RetailStore> getRetailStoreById(@PathVariable UUID id) {
        Optional<RetailStore> store = service.getRetailStoreById(id);
        return store.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @Operation(summary = "Update a Retail Store")
    @PutMapping("")
    public ResponseEntity<RetailStore> updateRetailStore( @RequestBody RetailStore retailStore) {
        Optional<RetailStore> existingStore = service.getRetailStoreById(retailStore.getStoreId());
        if (existingStore.isPresent()) {
            return ResponseEntity.ok(service.updateRetailStore(retailStore));
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @Operation(summary = "Delete a Retail Store by ID")
    @DeleteMapping("/delite/{id}")
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