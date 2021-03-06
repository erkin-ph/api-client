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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Interest rate settings for deposit accounts
 */
@ApiModel(description = "Interest rate settings for deposit accounts")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-17T14:24:31.447Z")
public class DepositAccountInterestRateSettings {
    @SerializedName("encodedKey")
    private String encodedKey = null;

    @SerializedName("interestRate")
    private BigDecimal interestRate = null;
    @SerializedName("interestChargeFrequency")
    private InterestChargeFrequencyEnum interestChargeFrequency = null;
    @SerializedName("interestChargeFrequencyCount")
    private Integer interestChargeFrequencyCount = null;
    @SerializedName("interestRateTiers")
    private List<DepositAccountInterestRateTier> interestRateTiers = null;
    @SerializedName("interestRateTerms")
    private InterestRateTermsEnum interestRateTerms = null;

    /**
     * The encoded for this set of interest settings, auto generated, unique
     *
     * @return encodedKey
     **/
    @ApiModelProperty(value = "The encoded for this set of interest settings, auto generated, unique")
    public String getEncodedKey() {
        return encodedKey;
    }

    public DepositAccountInterestRateSettings interestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
        return this;
    }

    /**
     * The interest rate for the deposit account
     *
     * @return interestRate
     **/
    @ApiModelProperty(value = "The interest rate for the deposit account")
    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public DepositAccountInterestRateSettings interestChargeFrequency(InterestChargeFrequencyEnum interestChargeFrequency) {
        this.interestChargeFrequency = interestChargeFrequency;
        return this;
    }

    /**
     * The interest change frequency. Holds the possible values for how often is interest charged on loan or deposit accounts
     *
     * @return interestChargeFrequency
     **/
    @ApiModelProperty(value = "The interest change frequency. Holds the possible values for how often is interest charged on loan or deposit accounts")
    public InterestChargeFrequencyEnum getInterestChargeFrequency() {
        return interestChargeFrequency;
    }

    public void setInterestChargeFrequency(InterestChargeFrequencyEnum interestChargeFrequency) {
        this.interestChargeFrequency = interestChargeFrequency;
    }

    public DepositAccountInterestRateSettings interestChargeFrequencyCount(Integer interestChargeFrequencyCount) {
        this.interestChargeFrequencyCount = interestChargeFrequencyCount;
        return this;
    }

    /**
     * The count of units to apply over the interval (e.g. [x] weeks)
     *
     * @return interestChargeFrequencyCount
     **/
    @ApiModelProperty(value = "The count of units to apply over the interval (e.g. [x] weeks)")
    public Integer getInterestChargeFrequencyCount() {
        return interestChargeFrequencyCount;
    }

    public void setInterestChargeFrequencyCount(Integer interestChargeFrequencyCount) {
        this.interestChargeFrequencyCount = interestChargeFrequencyCount;
    }

    public DepositAccountInterestRateSettings interestRateTiers(List<DepositAccountInterestRateTier> interestRateTiers) {
        this.interestRateTiers = interestRateTiers;
        return this;
    }

    public DepositAccountInterestRateSettings addInterestRateTiersItem(DepositAccountInterestRateTier interestRateTiersItem) {
        if (this.interestRateTiers == null) {
            this.interestRateTiers = new ArrayList<DepositAccountInterestRateTier>();
        }
        this.interestRateTiers.add(interestRateTiersItem);
        return this;
    }

    /**
     * The list of interest rate tiers. An interest rate tier holds the values to define how the interest is computed
     *
     * @return interestRateTiers
     **/
    @ApiModelProperty(value = "The list of interest rate tiers. An interest rate tier holds the values to define how the interest is computed")
    public List<DepositAccountInterestRateTier> getInterestRateTiers() {
        return interestRateTiers;
    }

    public void setInterestRateTiers(List<DepositAccountInterestRateTier> interestRateTiers) {
        this.interestRateTiers = interestRateTiers;
    }

    public DepositAccountInterestRateSettings interestRateTerms(InterestRateTermsEnum interestRateTerms) {
        this.interestRateTerms = interestRateTerms;
        return this;
    }

    /**
     * How is the interest rate determined when being accrued for an account
     *
     * @return interestRateTerms
     **/
    @ApiModelProperty(value = "How is the interest rate determined when being accrued for an account")
    public InterestRateTermsEnum getInterestRateTerms() {
        return interestRateTerms;
    }

    public void setInterestRateTerms(InterestRateTermsEnum interestRateTerms) {
        this.interestRateTerms = interestRateTerms;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DepositAccountInterestRateSettings depositAccountInterestRateSettings = (DepositAccountInterestRateSettings) o;
        return Objects.equals(this.encodedKey, depositAccountInterestRateSettings.encodedKey) &&
                Objects.equals(this.interestRate, depositAccountInterestRateSettings.interestRate) &&
                Objects.equals(this.interestChargeFrequency, depositAccountInterestRateSettings.interestChargeFrequency) &&
                Objects.equals(this.interestChargeFrequencyCount, depositAccountInterestRateSettings.interestChargeFrequencyCount) &&
                Objects.equals(this.interestRateTiers, depositAccountInterestRateSettings.interestRateTiers) &&
                Objects.equals(this.interestRateTerms, depositAccountInterestRateSettings.interestRateTerms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(encodedKey, interestRate, interestChargeFrequency, interestChargeFrequencyCount, interestRateTiers, interestRateTerms);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DepositAccountInterestRateSettings {\n");

        sb.append("    encodedKey: ").append(toIndentedString(encodedKey)).append("\n");
        sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
        sb.append("    interestChargeFrequency: ").append(toIndentedString(interestChargeFrequency)).append("\n");
        sb.append("    interestChargeFrequencyCount: ").append(toIndentedString(interestChargeFrequencyCount)).append("\n");
        sb.append("    interestRateTiers: ").append(toIndentedString(interestRateTiers)).append("\n");
        sb.append("    interestRateTerms: ").append(toIndentedString(interestRateTerms)).append("\n");
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
     * The interest change frequency. Holds the possible values for how often is interest charged on loan or deposit accounts
     */
    @JsonAdapter(InterestChargeFrequencyEnum.Adapter.class)
    public enum InterestChargeFrequencyEnum {
        ANNUALIZED("ANNUALIZED"),

        EVERY_MONTH("EVERY_MONTH"),

        EVERY_FOUR_WEEKS("EVERY_FOUR_WEEKS"),

        EVERY_WEEK("EVERY_WEEK"),

        EVERY_DAY("EVERY_DAY"),

        EVERY_X_DAYS("EVERY_X_DAYS");

        private String value;

        InterestChargeFrequencyEnum(String value) {
            this.value = value;
        }

        public static InterestChargeFrequencyEnum fromValue(String text) {
            for (InterestChargeFrequencyEnum b : InterestChargeFrequencyEnum.values()) {
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

        public static class Adapter extends TypeAdapter<InterestChargeFrequencyEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final InterestChargeFrequencyEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public InterestChargeFrequencyEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return InterestChargeFrequencyEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * How is the interest rate determined when being accrued for an account
     */
    @JsonAdapter(InterestRateTermsEnum.Adapter.class)
    public enum InterestRateTermsEnum {
        FIXED("FIXED"),

        TIERED("TIERED"),

        TIERED_PERIOD("TIERED_PERIOD");

        private String value;

        InterestRateTermsEnum(String value) {
            this.value = value;
        }

        public static InterestRateTermsEnum fromValue(String text) {
            for (InterestRateTermsEnum b : InterestRateTermsEnum.values()) {
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

        public static class Adapter extends TypeAdapter<InterestRateTermsEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final InterestRateTermsEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public InterestRateTermsEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return InterestRateTermsEnum.fromValue(String.valueOf(value));
            }
        }
    }

}

