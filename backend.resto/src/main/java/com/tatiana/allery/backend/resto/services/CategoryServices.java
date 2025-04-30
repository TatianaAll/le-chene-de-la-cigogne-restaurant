package com.tatiana.allery.backend.resto.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tatiana.allery.backend.resto.entity.Category;
import com.tatiana.allery.backend.resto.exception.NotFoundException;
import com.tatiana.allery.backend.resto.repository.CategoryRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CategoryServices {
  private CategoryRepository categoryRepository;

  public Category createCategory(Category newCategory) {
    return categoryRepository.save(newCategory);
  };

  public Category getCategoryById(Long category_id) {
    return categoryRepository.findById(category_id)
        .orElseThrow(() -> new NotFoundException("La catégorie demandée n'existe pas"));
  };

  public List<Category> getAllCategories() {
    return categoryRepository.findAll();
  };

  public Category updateCategory(Long category_id, Category categoryUpdated) {
    Category categoryToUpdate = categoryRepository.findById(category_id)
        .orElseThrow(() -> new NotFoundException("Impossible de trouver la category à modifier"));
    categoryToUpdate.setName(categoryUpdated.getName());

    return categoryRepository.save(categoryToUpdate);
  }

  public void deleteCategory(Long category_id) {
    Category categoryToDelete = categoryRepository.findById(category_id)
    .orElseThrow(() -> new NotFoundException("Impossible de trouver la catégorie à supprimer"));
    categoryRepository.delete(categoryToDelete);
  }
}
