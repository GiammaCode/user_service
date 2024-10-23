package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import org.openapitools.jackson.nullable.JsonNullable;
import io.swagger.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * User
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-23T14:46:00.241133645Z[GMT]")


public class User   {
  @JsonProperty("nome")

  private String nome = null;

  @JsonProperty("surname")

  private String surname = null;

  @JsonProperty("password")

  private String password = null;

  @JsonProperty("email")

  private String email = null;

  @JsonProperty("dateOfBirthday")

  private LocalDate dateOfBirthday = null;

  @JsonProperty("paymentMethod")

  private String paymentMethod = null;

  @JsonProperty("isActive")

  private Boolean isActive = null;


  public User nome(String nome) { 

    this.nome = nome;
    return this;
  }

  /**
   * Get nome
   * @return nome
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public String getNome() {  
    return nome;
  }



  public void setNome(String nome) { 

    this.nome = nome;
  }

  public User surname(String surname) { 

    this.surname = surname;
    return this;
  }

  /**
   * Get surname
   * @return surname
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public String getSurname() {  
    return surname;
  }



  public void setSurname(String surname) { 

    this.surname = surname;
  }

  public User password(String password) { 

    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public String getPassword() {  
    return password;
  }



  public void setPassword(String password) { 

    this.password = password;
  }

  public User email(String email) { 

    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public String getEmail() {  
    return email;
  }



  public void setEmail(String email) { 

    this.email = email;
  }

  public User dateOfBirthday(LocalDate dateOfBirthday) { 

    this.dateOfBirthday = dateOfBirthday;
    return this;
  }

  /**
   * Get dateOfBirthday
   * @return dateOfBirthday
   **/
  
  @Schema(required = true, description = "")
  
@Valid
  @NotNull
  public LocalDate getDateOfBirthday() {  
    return dateOfBirthday;
  }



  public void setDateOfBirthday(LocalDate dateOfBirthday) { 

    this.dateOfBirthday = dateOfBirthday;
  }

  public User paymentMethod(String paymentMethod) { 

    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * Get paymentMethod
   * @return paymentMethod
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public String getPaymentMethod() {  
    return paymentMethod;
  }



  public void setPaymentMethod(String paymentMethod) { 

    this.paymentMethod = paymentMethod;
  }

  public User isActive(Boolean isActive) { 

    this.isActive = isActive;
    return this;
  }

  /**
   * Get isActive
   * @return isActive
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public Boolean isIsActive() {  
    return isActive;
  }



  public void setIsActive(Boolean isActive) { 

    this.isActive = isActive;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.nome, user.nome) &&
        Objects.equals(this.surname, user.surname) &&
        Objects.equals(this.password, user.password) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.dateOfBirthday, user.dateOfBirthday) &&
        Objects.equals(this.paymentMethod, user.paymentMethod) &&
        Objects.equals(this.isActive, user.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, surname, password, email, dateOfBirthday, paymentMethod, isActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    dateOfBirthday: ").append(toIndentedString(dateOfBirthday)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
