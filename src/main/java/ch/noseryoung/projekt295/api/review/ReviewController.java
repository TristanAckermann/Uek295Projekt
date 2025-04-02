package ch.noseryoung.projekt295.api.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    @Autowired
    private ReviewRepository reviewRepository;

    @PutMapping("/update")
    public ResponseEntity<Review> updateReview(@RequestBody Review review) {
        return ResponseEntity.ok(reviewRepository.save(review));
    }









}
