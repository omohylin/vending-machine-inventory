package ua.mohylin.vending.machine.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {

  @Id private int id;

  private int size;

  private String name;
}