package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import org.openapitools.jackson.nullable.JsonNullable;
import io.swagger.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Profile
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-23T14:46:00.241133645Z[GMT]")


public class Profile   {
  @JsonProperty("email")

  private String email = null;

  @JsonProperty("userName")

  private String userName = null;

  @JsonProperty("image")

  private String image = null;

  @JsonProperty("views")
  @Valid
  private List<Object> views = null;
  @JsonProperty("raccomanded")
  @Valid
  private List<Object> raccomanded = null;

  public Profile email(String email) { 

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

  public Profile userName(String userName) { 

    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
   **/
  
  @Schema(required = true, description = "")
  
  @NotNull
  public String getUserName() {  
    return userName;
  }



  public void setUserName(String userName) { 

    this.userName = userName;
  }

  public Profile image(String image) { 

    this.image = image;
    return this;
  }

  /**
   * Path to profile image
   * @return image
   **/
  
  @Schema(required = true, description = "Path to profile image")
  
  @NotNull
  public String getImage() {  
    return image;
  }



  public void setImage(String image) { 

    this.image = image;
  }

  public Profile views(List<Object> views) { 

    this.views = views;
    return this;
  }

  public Profile addViewsItem(Object viewsItem) {
    if (this.views == null) {
      this.views = new ArrayList<Object>();
    }
    this.views.add(viewsItem);
    return this;
  }

  /**
   * Get views
   * @return views
   **/
  
  @Schema(description = "")
  
  public List<Object> getViews() {  
    return views;
  }



  public void setViews(List<Object> views) { 
    this.views = views;
  }

  public Profile raccomanded(List<Object> raccomanded) { 

    this.raccomanded = raccomanded;
    return this;
  }

  public Profile addRaccomandedItem(Object raccomandedItem) {
    if (this.raccomanded == null) {
      this.raccomanded = new ArrayList<Object>();
    }
    this.raccomanded.add(raccomandedItem);
    return this;
  }

  /**
   * Get raccomanded
   * @return raccomanded
   **/
  
  @Schema(description = "")
  
  public List<Object> getRaccomanded() {  
    return raccomanded;
  }



  public void setRaccomanded(List<Object> raccomanded) { 
    this.raccomanded = raccomanded;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Profile profile = (Profile) o;
    return Objects.equals(this.email, profile.email) &&
        Objects.equals(this.userName, profile.userName) &&
        Objects.equals(this.image, profile.image) &&
        Objects.equals(this.views, profile.views) &&
        Objects.equals(this.raccomanded, profile.raccomanded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, userName, image, views, raccomanded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Profile {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    views: ").append(toIndentedString(views)).append("\n");
    sb.append("    raccomanded: ").append(toIndentedString(raccomanded)).append("\n");
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
