package org.pruthvi_banking.banking.dto;


import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Getter
@Setter
public class BankResponse {

    private String responseCode;
    private String responseMessage;
    private AccountInfo accountInfo;


    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public AccountInfo getAccountInfo() {
        return accountInfo;
    }

    public void setAccountInfo(AccountInfo accountInfo) {
        this.accountInfo = accountInfo;
    }
}
