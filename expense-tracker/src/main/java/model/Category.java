package model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="categories")
@Getter @Setter@NoArgsConstructor@AllArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false,unique = false)
    private String name;
}
