package com.cardapio.cardapio.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

  @CrossOrigin(origins = "*", allowedHeaders = "*")
  @GetMapping
  public List<FoodResponseDTO> getAll() {
    List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
    return foodList;
  }

  @CrossOrigin(origins = "*", allowedHeaders = "*")
  @GetMapping("/{id}")
  public ResponseEntity<FoodResponseDTO> getById(@PathVariable("id") long id) {
    try {
      Optional<Food> foodData = repository.findById(id);
      if (foodData.isPresent()) {
        FoodResponseDTO food = new FoodResponseDTO(foodData.get());
        return new ResponseEntity<>(food, HttpStatus.OK);
      } else {
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
      }

    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @CrossOrigin(origins = "*", allowedHeaders = "*")
  @PostMapping
  public ResponseEntity<HttpStatus> saveFood(@RequestBody FoodRequestDTO data) {
    try {
      Food foodData = new Food(data);
      repository.save(foodData);
      return new ResponseEntity<>(HttpStatus.CREATED);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

  }

  @CrossOrigin(origins = "*", allowedHeaders = "*")
  @DeleteMapping("/{id}")
  public ResponseEntity<HttpStatus> deleteFood(@PathVariable("id") long id) {
    try {
      repository.deleteById(id);
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }
}
