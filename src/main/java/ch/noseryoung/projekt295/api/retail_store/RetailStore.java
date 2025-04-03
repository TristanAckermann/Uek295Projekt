package ch.noseryoung.projekt295.api.retail_store;

import ch.noseryoung.projekt295.api.review.Review;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;
@Getter
@Setter
@Entity
@Table(name = "retail_store")

public class RetailStore {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false, unique = true)
    private UUID storeId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String area;
    @Column(nullable = false)
    private String openingHours;
    @OneToMany
    @JoinTable(
            name = "retail_store_reviews",
            joinColumns = @JoinColumn(name = "store_id"),
            inverseJoinColumns = @JoinColumn(name = "review_id")
    )




    private Set<Review> reviews;


}