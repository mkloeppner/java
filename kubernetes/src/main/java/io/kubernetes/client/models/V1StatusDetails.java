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
import io.kubernetes.client.models.V1StatusCause;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * StatusDetails is a set of additional properties that MAY be set by the server to provide additional information about a response. The Reason field of a Status object defines what attributes will be set. Clients must ignore fields that do not match the defined type of each attribute, and should assume that any attribute may be empty, invalid, or under defined.
 */
@ApiModel(description = "StatusDetails is a set of additional properties that MAY be set by the server to provide additional information about a response. The Reason field of a Status object defines what attributes will be set. Clients must ignore fields that do not match the defined type of each attribute, and should assume that any attribute may be empty, invalid, or under defined.")

public class V1StatusDetails {
  @SerializedName("causes")
  private List<V1StatusCause> causes = null;

  @SerializedName("group")
  private String group = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("retryAfterSeconds")
  private Integer retryAfterSeconds = null;

  @SerializedName("uid")
  private String uid = null;

  public V1StatusDetails causes(List<V1StatusCause> causes) {
    this.causes = causes;
    return this;
  }

  public V1StatusDetails addCausesItem(V1StatusCause causesItem) {
    if (this.causes == null) {
      this.causes = new ArrayList<V1StatusCause>();
    }
    this.causes.add(causesItem);
    return this;
  }

   /**
   * The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide detailed causes.
   * @return causes
  **/
  @ApiModelProperty(value = "The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide detailed causes.")
  public List<V1StatusCause> getCauses() {
    return causes;
  }

  public void setCauses(List<V1StatusCause> causes) {
    this.causes = causes;
  }

  public V1StatusDetails group(String group) {
    this.group = group;
    return this;
  }

   /**
   * The group attribute of the resource associated with the status StatusReason.
   * @return group
  **/
  @ApiModelProperty(value = "The group attribute of the resource associated with the status StatusReason.")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public V1StatusDetails kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * The kind attribute of the resource associated with the status StatusReason. On some operations may differ from the requested resource Kind. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(value = "The kind attribute of the resource associated with the status StatusReason. On some operations may differ from the requested resource Kind. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1StatusDetails name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name attribute of the resource associated with the status StatusReason (when there is a single name which can be described).
   * @return name
  **/
  @ApiModelProperty(value = "The name attribute of the resource associated with the status StatusReason (when there is a single name which can be described).")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1StatusDetails retryAfterSeconds(Integer retryAfterSeconds) {
    this.retryAfterSeconds = retryAfterSeconds;
    return this;
  }

   /**
   * If specified, the time in seconds before the operation should be retried. Some errors may indicate the client must take an alternate action - for those errors this field may indicate how long to wait before taking the alternate action.
   * @return retryAfterSeconds
  **/
  @ApiModelProperty(value = "If specified, the time in seconds before the operation should be retried. Some errors may indicate the client must take an alternate action - for those errors this field may indicate how long to wait before taking the alternate action.")
  public Integer getRetryAfterSeconds() {
    return retryAfterSeconds;
  }

  public void setRetryAfterSeconds(Integer retryAfterSeconds) {
    this.retryAfterSeconds = retryAfterSeconds;
  }

  public V1StatusDetails uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * UID of the resource. (when there is a single resource which can be described). More info: http://kubernetes.io/docs/user-guide/identifiers#uids
   * @return uid
  **/
  @ApiModelProperty(value = "UID of the resource. (when there is a single resource which can be described). More info: http://kubernetes.io/docs/user-guide/identifiers#uids")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1StatusDetails v1StatusDetails = (V1StatusDetails) o;
    return Objects.equals(this.causes, v1StatusDetails.causes) &&
        Objects.equals(this.group, v1StatusDetails.group) &&
        Objects.equals(this.kind, v1StatusDetails.kind) &&
        Objects.equals(this.name, v1StatusDetails.name) &&
        Objects.equals(this.retryAfterSeconds, v1StatusDetails.retryAfterSeconds) &&
        Objects.equals(this.uid, v1StatusDetails.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(causes, group, kind, name, retryAfterSeconds, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1StatusDetails {\n");
    
    sb.append("    causes: ").append(toIndentedString(causes)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    retryAfterSeconds: ").append(toIndentedString(retryAfterSeconds)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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

