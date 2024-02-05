package com.easybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name="Customer",
        description = "Schema to hold Customer and Account information"
)
public class CustomerDto {
    @Schema(
            description = "Name of the customer",example = "Majohnc"
    )
    @NotEmpty(message = "Name can not be a null or empty")
    @Size(min=5,max = 30,message = "The length of customer name should be betwween 5 and 30")
    private String name;

    @Schema(
            description = "Email of the customer",example = "majohnc@easyBank.com"
    )
    @NotEmpty(message = "Email can not be a null or empty")
    @Email(message = "Email adress should be a valid value")
    private String email;

    @Schema(
            description = "Mobile Number of the customer",example = "9854744789"
    )
    @Pattern(regexp="(^$|[0-9]{10})",message = "AccountNumber must be 10 digits")
    private String mobileNumber;

    @Schema(
            description = "Account details of the customer"
    )
    private AccountsDto accountsDto;
}
