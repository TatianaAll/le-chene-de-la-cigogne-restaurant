package com.tatiana.allery.backend.resto.entity;

//booleanUtils avec la dépendance apache commons
import org.apache.commons.lang3.BooleanUtils;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "dishes")
public class Dish {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "description")
  private String description;

  @Column(name = "price")
  private float price;

  @Column(name = "image")
  private String image;

  @Column(name = "is_available")
  private Boolean isAvailable;

  @ManyToOne
  @JoinColumn(name = "category_id", nullable = true)
  private Category category;

  public boolean getAvailable() {
    return BooleanUtils.isTrue(this.isAvailable);
  }

}
