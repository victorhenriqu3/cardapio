package com.cardapio.cardapio.food;

public record FoodResponseDTO(Long id, String title, String image, String description, Double price) {
  public FoodResponseDTO(Food food) {
    this(food.getId(), food.getTitle(), food.getImage(), food.getDescription(), food.getPrice());
  }
}