package com.easybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name="Account",
        description = "Schema to hold Account information"
)
public class AccountsDto {
    @Schema(
            description = "Account Number of Easy Bank account"
    )
    @NotEmpty(message = "Name can not be a null or empty")
    private Long accountNumber;

    @Schema(
            description = "Account type of Easy Bank account",example = "Savings"
    )
    @NotEmpty(message = "Account Type can not be a null or empty")
    private String accountType;

    @Schema(
            description ="Easy Bank branch address",example = "123 street New York"
    )
    @Pattern(regexp="(^$|[0-9]{10})",message = "AccountNumber must be 10 digits")
    private String branchAddress;
}
