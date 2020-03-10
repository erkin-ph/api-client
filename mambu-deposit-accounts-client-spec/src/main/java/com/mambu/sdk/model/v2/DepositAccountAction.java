/*
 * deposits
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v2
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.mambu.sdk.model.v2;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.Objects;

/**
 * Allows specifying the action details for a deposit account
 */
@ApiModel(description = "Allows specifying the action details for a deposit account")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-17T14:24:31.447Z")
public class DepositAccountAction {
    @SerializedName("action")
    private ActionEnum action = null;
    @SerializedName("notes")
    private String notes = null;

    public DepositAccountAction action(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * The action type to be applied
     *
     * @return action
     **/
    @ApiModelProperty(required = true, value = "The action type to be applied")
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public DepositAccountAction notes(String notes) {
        this.notes = notes;
        return this;
    }

    /**
     * The notes related to the action performed
     *
     * @return notes
     **/
    @ApiModelProperty(value = "The notes related to the action performed")
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DepositAccountAction depositAccountAction = (DepositAccountAction) o;
        return Objects.equals(this.action, depositAccountAction.action) &&
                Objects.equals(this.notes, depositAccountAction.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, notes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DepositAccountAction {\n");

        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

    /**
     * The action type to be applied
     */
    @JsonAdapter(ActionEnum.Adapter.class)
    public enum ActionEnum {
        APPROVE("APPROVE"),

        UNDO_APPROVE("UNDO_APPROVE"),

        LOCK("LOCK"),

        UNLOCK("UNLOCK");

        private String value;

        ActionEnum(String value) {
            this.value = value;
        }

        public static ActionEnum fromValue(String text) {
            for (ActionEnum b : ActionEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<ActionEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ActionEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ActionEnum.fromValue(String.valueOf(value));
            }
        }
    }

}
