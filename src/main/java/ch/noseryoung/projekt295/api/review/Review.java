package ch.noseryoung.projekt295.api.review;
import ch.noseryoung.projekt295.api.retail_store.RetailStore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "review")
public class Review {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
    @Column
    UUID reviewId;
    @Column
    int numStars;
    @Column
    String comment;
    @Column
    boolean isVerified;

    @ManyToOne
    private RetailStore retailStore;


}
