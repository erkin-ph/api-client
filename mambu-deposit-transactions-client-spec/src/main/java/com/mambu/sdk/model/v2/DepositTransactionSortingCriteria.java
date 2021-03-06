/*
 * deposits/transactions
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
 * The sorting criteria used for Deposit transactions client directed query
 */
@ApiModel(description = "The sorting criteria used for Deposit transactions client directed query")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-16T09:34:36.124Z")
public class DepositTransactionSortingCriteria {
    @SerializedName("field")
    private FieldEnum field = null;
    @SerializedName("order")
    private OrderEnum order = null;

    public DepositTransactionSortingCriteria field(FieldEnum field) {
        this.field = field;
        return this;
    }

    /**
     * Contains the field that can be used as sorting selection. Can be native (one from the provided list) or otherwise can specify a custom field using the format [customFieldSetId].[customFieldId].
     *
     * @return field
     **/
    @ApiModelProperty(required = true, value = "Contains the field that can be used as sorting selection. Can be native (one from the provided list) or otherwise can specify a custom field using the format [customFieldSetId].[customFieldId].")
    public FieldEnum getField() {
        return field;
    }

    public void setField(FieldEnum field) {
        this.field = field;
    }

    public DepositTransactionSortingCriteria order(OrderEnum order) {
        this.order = order;
        return this;
    }

    /**
     * The sorting order: ASC or DESC. The default order is DESC.
     *
     * @return order
     **/
    @ApiModelProperty(value = "The sorting order: ASC or DESC. The default order is DESC.")
    public OrderEnum getOrder() {
        return order;
    }

    public void setOrder(OrderEnum order) {
        this.order = order;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DepositTransactionSortingCriteria depositTransactionSortingCriteria = (DepositTransactionSortingCriteria) o;
        return Objects.equals(this.field, depositTransactionSortingCriteria.field) &&
                Objects.equals(this.order, depositTransactionSortingCriteria.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field, order);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DepositTransactionSortingCriteria {\n");

        sb.append("    field: ").append(toIndentedString(field)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
     * Contains the field that can be used as sorting selection. Can be native (one from the provided list) or otherwise can specify a custom field using the format [customFieldSetId].[customFieldId].
     */
    @JsonAdapter(FieldEnum.Adapter.class)
    public enum FieldEnum {
        ID("id"),

        EXTERNALID("externalId"),

        PARENTACCOUNTID("parentAccountId"),

        PRODUCTID("productId"),

        VALUEDATE("valueDate"),

        CREATIONDATE("creationDate"),

        AMOUNT("amount"),

        BRANCHID("branchId"),

        CENTREID("centreId"),

        TILLID("tillId"),

        FEES_NAME("fees.name"),

        TRANSACTIONDETAILS_TRANSACTIONCHANNELID("transactionDetails.transactionChannelId"),

        TAXES_TAXRATE("taxes.taxRate"),

        TERMS_INTERESTSETTINGS_INTERESTRATE("terms.interestSettings.interestRate"),

        TERMS_OVERDRAFTINTERESTSETTINGS_INTERESTRATE("terms.overdraftInterestSettings.interestRate"),

        TERMS_OVERDRAFTSETTINGS_OVERDRAFTLIMIT("terms.overdraftSettings.overdraftLimit"),

        AFFECTEDAMOUNTS_INTERESTAMOUNT("affectedAmounts.interestAmount"),

        AFFECTEDAMOUNTS_FEESAMOUNT("affectedAmounts.feesAmount"),

        ACCOUNTBALANCES_TOTALBALANCE("accountBalances.totalBalance");

        private String value;

        FieldEnum(String value) {
            this.value = value;
        }

        public static FieldEnum fromValue(String text) {
            for (FieldEnum b : FieldEnum.values()) {
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

        public static class Adapter extends TypeAdapter<FieldEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final FieldEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public FieldEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return FieldEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * The sorting order: ASC or DESC. The default order is DESC.
     */
    @JsonAdapter(OrderEnum.Adapter.class)
    public enum OrderEnum {
        ASC("ASC"),

        DESC("DESC");

        private String value;

        OrderEnum(String value) {
            this.value = value;
        }

        public static OrderEnum fromValue(String text) {
            for (OrderEnum b : OrderEnum.values()) {
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

        public static class Adapter extends TypeAdapter<OrderEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final OrderEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public OrderEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return OrderEnum.fromValue(String.valueOf(value));
            }
        }
    }

}

