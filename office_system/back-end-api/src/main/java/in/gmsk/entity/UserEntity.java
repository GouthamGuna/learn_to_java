package in.gmsk.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record UserEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        int id,
        String userName,
        String secret
) { }
