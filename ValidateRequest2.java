//Method Utama
private void ValidateRequest2(CustomerInquiryRequest request, int customerFieldLength, int productFieldLength)
{
	//1. Check both parameters are not null and not empty strings
	CheckCustomerInquiryNotNullOrEmpty (request);
	//2. Check both parameters aren't populated
	CheckCustomerInquiryNullOrEmpty (request);
	//3. check CustomerID for field length and pad the parameter
	CheckCustomerIDValid(request, customerFieldLength);
	//4. Check ProductNumber for field length and pad the parameter
	CheckProductNumberValid(request, productFieldLength);
}

// Method baru untuk mengecek apakah string input null atau string kosong
private void CheckCustomerInquiryNotNullOrEmpty(CustomerInquiryRequest request){
	// Check both parameters are not null and empty string
	if(!string.IsNullOrEmpty(request.CustomerProduct.ProductNumber) && !string.IsNullOrEmpty(request.Customer.CustomerID))
	{
		// Both were populated
		throw new BusinessException(HandleErrors.InvalidBothParameterMessage);
	}
}

// Method baru untuk untuk menguji parameter
private void CheckCustomerInquiryNullOrEmpty (CustomerInquiryRequest request)
{
	if(string.isNullOrEmpty(request.Customer.CustomerID) && string.isNullOrEmpty(request.CustomerProduct.ProductNumber))
	{
		// Both are null or empty string 
		throw new BusinessException(HandleErrors.CustomerEmptyMessage);
	}
}

// Method baru untuk menguji CustomerID
private void CheckCustomerIDValid(CustomerInquiryRequest request, int customerIDFieldLength)
{
	if(string.IsNullOrEmpty(request.Customer.CustomerID))
	{
		// Check Customer ID length
		if(request.Customer.CustomerID.Length > customerIDFieldLength)
		{
			throw new BusinessException(HandleErrors.CustomerInvalidLengthMessage);
		}
		// Pad the left of the customer id
		request.Customer.CustomerID = request.Customer.CustomerID.PadLeft(customerIDFieldLength,Convert.ToChar("0", CultureInfo.CurrentCulture));		
	}
}

// Method baru untuk mengecek ProductNumber
private void CheckProductNumberValid(CustomerInquiryRequest request, int productFieldLength)
{
	if(string.IsNullOrEmpty(request.CustomerProduct.ProductNumber))
	{
		// Check Product Length
		if(request.CustomerProduct.ProductNumber.Length > productFieldLength)
		{
			throw new BusinessException(HandleErrors.ProductInvalidLengthMessage);
		}
		// Pad theb left of the product number 
		request.CustomerProduct.ProductNumber = request.CustomerProduct.ProductNumber.PadLeft(productFieldLength, Convert.ToChar("0", CultureInfo.CurrentCulture));
	}
}

