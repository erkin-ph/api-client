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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * The details of the card acceptor (merchant) in a transaction hold.
 */
@ApiModel(description = "The details of the card acceptor (merchant) in a transaction hold.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-17T14:24:31.447Z")
public class CardAcceptor {
    @SerializedName("mcc")
    private Integer mcc = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("city")
    private String city = null;

    @SerializedName("state")
    private String state = null;

    @SerializedName("zip")
    private String zip = null;

    @SerializedName("country")
    private String country = null;

    public CardAcceptor mcc(Integer mcc) {
        this.mcc = mcc;
        return this;
    }

    /**
     * The Merchant Category Code of the card acceptor.
     *
     * @return mcc
     **/
    @ApiModelProperty(value = "The Merchant Category Code of the card acceptor.")
    public Integer getMcc() {
        return mcc;
    }

    public void setMcc(Integer mcc) {
        this.mcc = mcc;
    }

    public CardAcceptor name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the card acceptor.
     *
     * @return name
     **/
    @ApiModelProperty(value = "The name of the card acceptor.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CardAcceptor city(String city) {
        this.city = city;
        return this;
    }

    /**
     * The city in which the card acceptor has the business.
     *
     * @return city
     **/
    @ApiModelProperty(value = "The city in which the card acceptor has the business.")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public CardAcceptor state(String state) {
        this.state = state;
        return this;
    }

    /**
     * The state in which the card acceptor has the business.
     *
     * @return state
     **/
    @ApiModelProperty(value = "The state in which the card acceptor has the business.")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public CardAcceptor zip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * The ZIP code of the location in which the card acceptor has the business.
     *
     * @return zip
     **/
    @ApiModelProperty(value = "The ZIP code of the location in which the card acceptor has the business.")
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public CardAcceptor country(String country) {
        this.country = country;
        return this;
    }

    /**
     * The country in which the card acceptor has the business.
     *
     * @return country
     **/
    @ApiModelProperty(value = "The country in which the card acceptor has the business.")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CardAcceptor cardAcceptor = (CardAcceptor) o;
        return Objects.equals(this.mcc, cardAcceptor.mcc) &&
                Objects.equals(this.name, cardAcceptor.name) &&
                Objects.equals(this.city, cardAcceptor.city) &&
                Objects.equals(this.state, cardAcceptor.state) &&
                Objects.equals(this.zip, cardAcceptor.zip) &&
                Objects.equals(this.country, cardAcceptor.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mcc, name, city, state, zip, country);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CardAcceptor {\n");

        sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

