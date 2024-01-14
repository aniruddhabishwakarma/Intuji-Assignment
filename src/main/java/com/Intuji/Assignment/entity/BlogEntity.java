package com.Intuji.Assignment.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.engine.internal.Cascade;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "Blogs")
@Data
public class BlogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String title;
    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    private Category category;
}
