package com.tatiana.allery.backend.resto.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tatiana.allery.backend.resto.entity.Dish;
import com.tatiana.allery.backend.resto.exception.NotFoundException;
import com.tatiana.allery.backend.resto.repository.DishRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DishServices {
  private DishRepository dishRepository;

  public Dish createDish(Dish newDish) {
    return dishRepository.save(newDish);
  }

  public Dish getDishById(Long dishId) {
    return dishRepository.findById(dishId)
        .orElseThrow(() -> new NotFoundException("Le plat recherché n'existe pas"));
  }

  public List<Dish> getAllDishes() {
    return dishRepository.findAll();
  }

  public Dish updateDish(Long dishId, Dish updatedDish) {
    Dish dishToUpdate = dishRepository.findById(dishId) 
      .orElseThrow(() -> new NotFoundException("Impossible de modifier un plat inexistant"));
    
      dishToUpdate.setName(updatedDish.getName());
      dishToUpdate.setDescription(updatedDish.getDescription());
      dishToUpdate.setPrice(updatedDish.getPrice());

      return dishRepository.save(dishToUpdate);
  }

  public void deleteDish(Long dishId) {
    Dish dishToDelete = dishRepository.findById(dishId)
      .orElseThrow(() -> new NotFoundException("le plat à supprimé n'existe pas"));

      dishRepository.delete(dishToDelete);
  };
  
}