package com.backbase.peachtree.mambu.config;

import com.backbase.peachtree.util.InternalTokenClaimsUtil;
import com.mambu.sdk.api.ApiClient;
import com.mambu.sdk.api.Configuration;
import com.mambu.sdk.api.v2.ClientsApi;
import com.mambu.sdk.api.v2.DepositAccountsApi;
import com.mambu.sdk.api.v2.DepositTransactionsApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Arrays;

import static com.backbase.peachtree.util.PeachtreeConstants.BASE_PATH;
import static com.backbase.peachtree.util.PeachtreeConstants.HEADER_AUTH_NAME;

/**
 * @author William Suane
 */
@Slf4j
@Component
public class MambuApiClientConfiguration {

    public static void setBasicTokenToConfiguration(ApiClient... apiClient) {
        Arrays.stream(apiClient).forEach(client -> client.addDefaultHeader(HEADER_AUTH_NAME, InternalTokenClaimsUtil.getCoreToken()));
    }

    private ApiClient apiClientConfiguredToBackbase() {
        log.info("Setting up configuration to access products from Mambu");
        Configuration.setDefaultApiClient(new ApiClient().setBasePath(BASE_PATH));
        Configuration.getDefaultApiClient().setReadTimeout(40000);
        Configuration.getDefaultApiClient().setWriteTimeout(40000);
        return Configuration.getDefaultApiClient();
    }

    @Bean
    public DepositAccountsApi depositAccountsApi() {
        return new DepositAccountsApi(apiClientConfiguredToBackbase());
    }

    @Bean
    public ClientsApi clientsApi() {
        return new ClientsApi(apiClientConfiguredToBackbase());
    }

    @Bean
    public DepositTransactionsApi depositTransactionsApi() {
        return new DepositTransactionsApi(apiClientConfiguredToBackbase());
    }

}
