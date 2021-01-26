/**
 * 
 */
package guru.springframework.spring5webapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author EVOFORGE\tjtrabu
 *
 */
@Entity
public class Publisher {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  private String addressLocal;
  private String city;
  private String state;
  private String zip;

  public Publisher(String name, String addressLocal, String city, String state,
      String zip) {
    this.name = name;
    this.addressLocal = addressLocal;
    this.city = city;
    this.state = state;
    this.zip = zip;
  }

  public Publisher() {

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getAddressLocal() {
    return addressLocal;
  }

  public void setAddressLocal(String addressLocal) {
    this.addressLocal = addressLocal;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Publisher other = (Publisher) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Publisher{id=" + id + ", name=" + name + ", addressLocal="
        + addressLocal + ", city=" + city + ", state=" + state + ", zip=" + zip
        + "}";
  }
}
