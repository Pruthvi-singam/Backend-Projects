package model;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name="users")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column( unique = true ,nullable = false)
    private String username;

    @Column( unique = true,nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;
}
