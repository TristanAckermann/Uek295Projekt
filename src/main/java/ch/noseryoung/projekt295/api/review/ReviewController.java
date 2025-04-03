package ch.noseryoung.projekt295.api.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PutMapping("/update")
    public ResponseEntity<Review> updateReview(@RequestBody Review review) {
        return ResponseEntity.ok(reviewService.updateReview(review));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteReview(@PathVariable UUID id) {
        reviewService.deleteReview(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Review> getReview(@PathVariable UUID id) {
        return ResponseEntity.ok(reviewService.getReviewById(id));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Review>> getAllReviews() {
        return ResponseEntity.ok(reviewService.getAllReviews());
    }

    @PostMapping("/create")
    public ResponseEntity<Review> createReview(@RequestBody Review review) {
        return ResponseEntity.ok(reviewService.createReview(review));
    }
}