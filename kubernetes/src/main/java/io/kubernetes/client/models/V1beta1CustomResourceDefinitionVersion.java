/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.11.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1beta1CustomResourceDefinitionVersion
 */

public class V1beta1CustomResourceDefinitionVersion {
  @SerializedName("name")
  private String name = null;

  @SerializedName("served")
  private Boolean served = null;

  @SerializedName("storage")
  private Boolean storage = null;

  public V1beta1CustomResourceDefinitionVersion name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name is the version name, e.g. “v1”, “v2beta1”, etc.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name is the version name, e.g. “v1”, “v2beta1”, etc.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1beta1CustomResourceDefinitionVersion served(Boolean served) {
    this.served = served;
    return this;
  }

   /**
   * Served is a flag enabling/disabling this version from being served via REST APIs
   * @return served
  **/
  @ApiModelProperty(required = true, value = "Served is a flag enabling/disabling this version from being served via REST APIs")
  public Boolean isServed() {
    return served;
  }

  public void setServed(Boolean served) {
    this.served = served;
  }

  public V1beta1CustomResourceDefinitionVersion storage(Boolean storage) {
    this.storage = storage;
    return this;
  }

   /**
   * Storage flags the version as storage version. There must be exactly one flagged as storage version.
   * @return storage
  **/
  @ApiModelProperty(required = true, value = "Storage flags the version as storage version. There must be exactly one flagged as storage version.")
  public Boolean isStorage() {
    return storage;
  }

  public void setStorage(Boolean storage) {
    this.storage = storage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1CustomResourceDefinitionVersion v1beta1CustomResourceDefinitionVersion = (V1beta1CustomResourceDefinitionVersion) o;
    return Objects.equals(this.name, v1beta1CustomResourceDefinitionVersion.name) &&
        Objects.equals(this.served, v1beta1CustomResourceDefinitionVersion.served) &&
        Objects.equals(this.storage, v1beta1CustomResourceDefinitionVersion.storage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, served, storage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CustomResourceDefinitionVersion {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    served: ").append(toIndentedString(served)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
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

