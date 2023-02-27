public abstract class BankProduct {
    private static int _productsNumber;

    private String _productCode;
    private String _customerIBAN;
    private String _customerTaxCode;
    private String _key;
    private String _description;

    protected BankProduct() { 
        _productsNumber ++;
        _key = String.format("BP%04d", _productsNumber);
    }

    protected BankProduct(String productCode, String customerIBAN, String customerTaxCode, String description) {
        this();
        _productCode = productCode;
        _customerIBAN = customerIBAN;
        _customerTaxCode = customerTaxCode;
        _description = description;
    }
    
    public String getKey() {
        return _key;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String value) {
        this._description = value;
    }

    public String getProductCode() {
        return _productCode;
    }

    public void setProductCode(String value) {
        _productCode = value;
    }

    public String getCustomerIBAN(){
        return _customerIBAN;
    }

    public void setCustomerIBAN(String value) {
        _customerIBAN = value;
    }

    public String getCustomerTaxCode(){
        return _customerTaxCode;
    }
    
    public void setCustomerTaxCode(String value) {
        _customerTaxCode = value;
    }
    
    public String toString() {
        return String.format("Key: %s, Product Code: %s, Customer IBAN: %s, Customer Tax Code: %s", 
            _key, _productCode, _customerIBAN, _customerTaxCode);
    }
}
