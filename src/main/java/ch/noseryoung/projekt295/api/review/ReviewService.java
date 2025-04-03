package ch.noseryoung.projekt295.api.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ReviewService {

    @Autowired
    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public Review createReview(Review review) {
        return reviewRepository.save(review);
    }

    public Review getReviewById(UUID id) {
        return reviewRepository.findById(id).orElse(null);
    }

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public void deleteReview(UUID id) {
        reviewRepository.deleteById(id);
    }

    public Review updateReview(Review review) {
        if (!reviewRepository.existsById(review.getReviewId())) {
            throw new RuntimeException("Review mit ID " + review.getReviewId() + " nicht gefunden.");
        }
        return reviewRepository.save(review);
    }
}
