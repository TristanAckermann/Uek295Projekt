package ch.noseryoung.projekt295.api.review;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository

public class ReviewService {
    private final ReviewRepository reviewReposetory;

    public ReviewService(ReviewRepository reviewReposetory) {
        this.reviewReposetory = reviewReposetory;
    }

    public Review createReview(Review review) {
        return reviewReposetory.save(review);
    }

    public Review getReviewById(UUID id) {
        return reviewReposetory.findById(id).orElse(null);
    }

    public List<Review> getAllReviews() {
        return reviewReposetory.findAll();
    }

    public void deleteReview(UUID id) {
        reviewReposetory.deleteById(id);
    }

    public Review updateReview(Review review) {
        if (!reviewReposetory.existsById(review.getReviev_id())) {
            throw new RuntimeException("Review mit ID " + review.getReviev_id() + " nicht gefunden.");
        }
        return reviewReposetory.save(review);
    }




}
