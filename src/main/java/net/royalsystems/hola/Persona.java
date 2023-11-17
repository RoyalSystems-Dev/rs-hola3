package net.royalsystems.hola;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("personaMast")
public class Persona {

  @Id
  @Column("Persona")
  private Long id;

  @Column("NombreCompleto")
  private String nombreCompleto;

  public Long getId() {
    return id;
  }

  public String getNombreCompleto() {
    return nombreCompleto;
  }

}
