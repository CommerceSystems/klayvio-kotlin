/*
 * Klaviyo API
 * The Klaviyo REST API. Please visit https://developers.klaviyo.com for more details.
 *
 * OpenAPI spec version: 2024-07-15
 * Contact: developers@klaviyo.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets CatalogItemEnum
 */
@JsonAdapter(CatalogItemEnum.Adapter.class)
public enum CatalogItemEnum {
  @SerializedName("catalog-item")
  CATALOG_ITEM("catalog-item");

  private String value;

  CatalogItemEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CatalogItemEnum fromValue(String input) {
    for (CatalogItemEnum b : CatalogItemEnum.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CatalogItemEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogItemEnum enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public CatalogItemEnum read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return CatalogItemEnum.fromValue((String)(value));
    }
  }
}
