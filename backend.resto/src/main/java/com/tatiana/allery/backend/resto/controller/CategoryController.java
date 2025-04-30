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

import com.tatiana.allery.backend.resto.entity.Dish;
import com.tatiana.allery.backend.resto.services.DishServices;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/plats")
public class CategoryController {
  private DishServices dishServices;

  // Build REST API for dish addition
  @PostMapping("/create")
  public ResponseEntity<Dish> createDish(@RequestBody Dish newDish) {
    Dish savedDish = dishServices.createDish(newDish);
    return new ResponseEntity<>(savedDish, HttpStatus.CREATED);
  }

  //Dish research by id
  @GetMapping("/{id}")
  public ResponseEntity<Dish> getDish(@PathVariable("id") Long dishId) {
    Dish dishFound = dishServices.getDishById(dishId);
      return ResponseEntity.ok(dishFound);
  }

  //dish all research
  @GetMapping("/all")
  public ResponseEntity<List<Dish>> getAllDishes() {
    var allDishesDto = dishServices.getAllDishes();
    return ResponseEntity.ok(allDishesDto);
  }
  
  //update dish
  @PutMapping("/{id}/update")
  public ResponseEntity<Dish> updateDish(@PathVariable("id") Long dishId, @RequestBody Dish updatedDish) {
    Dish dishToUpdate = dishServices.updateDish(dishId, updatedDish);
    return ResponseEntity.ok(dishToUpdate);
  }

  //delete dish
  @DeleteMapping("{id}/delete")
  public ResponseEntity<String> deleteDish(@PathVariable("id") Long dishId) {
    dishServices.deleteDish(dishId);
    return ResponseEntity.ok("Plat supprimé avec succès"); 
  }
}
