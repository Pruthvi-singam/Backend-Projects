package model;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import  lombok.*;
import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
@Table(name="expenses")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Expense {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="category_id",nullable = false)
    private Category category;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;

    @Column(nullable=false)
    private BigDecimal amount;

    private String description;
    @Column(nullable=false)
    private LocalDate expenseDate;
}
