package dk.finelab.product.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import dk.finelab.product.api.model.CatalogPageItem;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * CatalogPage
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-12T12:26:12.844058+02:00[Europe/Copenhagen]")
public class CatalogPage {

  @JsonProperty("items")
  @Valid
  private List<CatalogPageItem> items = null;

  public CatalogPage items(List<CatalogPageItem> items) {
    this.items = items;
    return this;
  }

  public CatalogPage addItemsItem(CatalogPageItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  */
  @Valid 
  public List<CatalogPageItem> getItems() {
    return items;
  }

  public void setItems(List<CatalogPageItem> items) {
    this.items = items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogPage catalogPage = (CatalogPage) o;
    return Objects.equals(this.items, catalogPage.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogPage {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

