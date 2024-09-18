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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.EventsBulkCreateJobResourceObjectAttributesEventsbulkcreate;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * EventsBulkCreateJobResourceObjectAttributes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-18T16:09:09.130713678Z[GMT]")

public class EventsBulkCreateJobResourceObjectAttributes {
  @SerializedName("events-bulk-create")
  private EventsBulkCreateJobResourceObjectAttributesEventsbulkcreate eventsBulkCreate = null;

  public EventsBulkCreateJobResourceObjectAttributes eventsBulkCreate(EventsBulkCreateJobResourceObjectAttributesEventsbulkcreate eventsBulkCreate) {
    this.eventsBulkCreate = eventsBulkCreate;
    return this;
  }

   /**
   * Get eventsBulkCreate
   * @return eventsBulkCreate
  **/
  @Schema(required = true, description = "")
  public EventsBulkCreateJobResourceObjectAttributesEventsbulkcreate getEventsBulkCreate() {
    return eventsBulkCreate;
  }

  public void setEventsBulkCreate(EventsBulkCreateJobResourceObjectAttributesEventsbulkcreate eventsBulkCreate) {
    this.eventsBulkCreate = eventsBulkCreate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventsBulkCreateJobResourceObjectAttributes eventsBulkCreateJobResourceObjectAttributes = (EventsBulkCreateJobResourceObjectAttributes) o;
    return Objects.equals(this.eventsBulkCreate, eventsBulkCreateJobResourceObjectAttributes.eventsBulkCreate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventsBulkCreate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventsBulkCreateJobResourceObjectAttributes {\n");
    
    sb.append("    eventsBulkCreate: ").append(toIndentedString(eventsBulkCreate)).append("\n");
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
