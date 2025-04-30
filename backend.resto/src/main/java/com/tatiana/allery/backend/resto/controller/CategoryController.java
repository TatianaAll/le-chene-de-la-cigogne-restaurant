package com.tatiana.allery.backend.resto.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tatiana.allery.backend.resto.entity.Category;
import com.tatiana.allery.backend.resto.services.CategoryServices;

import lombok.NoArgsConstructor;

@RestController
@NoArgsConstructor
@RequestMapping("/categories")
public class CategoryController {
  private CategoryServices categoryServices;
  
  @PostMapping("/create")
  public ResponseEntity<Category> createCategory(@RequestBody Category newCategory) {
    Category savedCategory = categoryServices.createCategory(newCategory);
    return new ResponseEntity<>(savedCategory, HttpStatus.CREATED);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Category> getCategoryById(@PathVariable("id") Long categoryId) {
    Category categoryFound = categoryServices.getCategoryById(categoryId);
    return ResponseEntity.ok(categoryFound);
  }

  @GetMapping("/all")
  public ResponseEntity<List<Category>> getAllCategories() {
    List<Category> allCategories = categoryServices.getAllCategories();
    return ResponseEntity.ok(allCategories);
  }

  @PutMapping("/{id}/update")
  public ResponseEntity<Category> updateCategory(@PathVariable("id") Long category_id, @RequestBody Category updatedCategory) {
    Category categoryToUpdate = categoryServices.updateCategory(category_id, updatedCategory);
    return ResponseEntity.ok(categoryToUpdate);
  }

  @DeleteMapping("{id}/delete")
  public ResponseEntity<String> deleteCategory(@PathVariable("id") Long category_id) {
    categoryServices.deleteCategory(category_id);
    return ResponseEntity.ok("Catégorie supprimée avec succès"); 
  }
}