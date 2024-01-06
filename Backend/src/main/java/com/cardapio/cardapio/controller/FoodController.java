package com.cardapio.cardapio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cardapio.cardapio.food.Food;
import com.cardapio.cardapio.food.FoodRepository;
import com.cardapio.cardapio.food.FoodRequestDTO;
import com.cardapio.cardapio.food.FoodResponseDTO;

@RestController
@RequestMapping("food")
public class FoodController {

  @Autowired
  private FoodRepository repository;

  @GetMapping
  public List<FoodResponseDTO> getAll() {
    List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
    return foodList;
  }

  @PostMapping
  public void saveFood(@RequestBody FoodRequestDTO data) {
    Food foodData = new Food(data);
    repository.save(foodData);
    return;
  }
}
