package com.plaid.client.integration;

import static org.junit.Assert.*;

import com.plaid.client.model.Error;
import com.plaid.client.model.ProcessorStripeBankAccountTokenCreateRequest;
import com.plaid.client.model.ProcessorStripeBankAccountTokenCreateResponse;
import com.plaid.client.model.Products;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import retrofit2.Response;

public class ItemStripeTokenCreateTest extends AbstractItemIntegrationTest {

  @Override
  protected List<Products> setupItemProducts() {
    return Arrays.asList(Products.AUTH);
  }

  @Override
  protected String setupItemInstitutionId() {
    return TARTAN_BANK_INSTITUTION_ID;
  }

  @Test
  public void testError() throws Exception {
    ProcessorStripeBankAccountTokenCreateRequest request = new ProcessorStripeBankAccountTokenCreateRequest()
      .accessToken(getItemPublicTokenExchangeResponse().getAccessToken())
      .accountId("FooBarAccountId");

    Response<ProcessorStripeBankAccountTokenCreateResponse> response = client()
      .processorStripeBankAccountTokenCreate(request)
      .execute();
    // Just assert that some error was returned - due to the nature of the
    // integration and required configuration at the API key level, we don't
    // know the exact error code to expect.
    assertErrorResponse(
      response,
      Error.ErrorTypeEnum.INVALID_REQUEST,
      "INVALID_FIELD"
    );
  }
}
