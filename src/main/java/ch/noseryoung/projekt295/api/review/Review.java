package ch.noseryoung.projekt295.api.review;
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
    @Column(name = "reviev_id")
    UUID reviev_id;
    @Column(name = "numstars")
    int num_stars;
    @Column(name = "comment")
    String comment;
    @Column(name = "is_verified")
    boolean is_verified;

}
