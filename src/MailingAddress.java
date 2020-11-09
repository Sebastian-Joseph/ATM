public class MailingAddress {
    String primaryStreet;
    String secondaryStreet;
    String city;
    String state;
    String postalCode;

    public MailingAddress(java.lang.String primaryStreet, java.lang.String secondaryStreet, java.lang.String city, java.lang.String state, java.lang.String postalCode) {
        this.primaryStreet = primaryStreet;
        this.secondaryStreet = secondaryStreet;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    public String getPrimaryStreet() {
        if(this.primaryStreet == null) {
            return null;
        } else {
            return this.primaryStreet;
        }
    }
    public String getSecondaryStreet() {
        if (this.secondaryStreet == null) {
            return null;
        } else {
            return this.secondaryStreet;
        }
    }
    public String getPostalCode() {
        if (this.postalCode == null) {
            return null;
        } else {
            return this.postalCode;
        }
    }
    public String getState() {
        if (this.state == null) {
            return null;
        } else {
           return this.state;
        }
    }
    public String getCity() {
        if (this.city == null) {
            return null;
        } else {
            return this.city;
        }
    }
    public void setPrimaryStreet(String primaryStreet) {
        this.primaryStreet = primaryStreet;
    }
    public void setSecondaryStreet(String secondaryStreet) {
        this.secondaryStreet = secondaryStreet;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String validateCity(String city) {
        if (city != null && city.length() > 0) {
            return city;
        } else {
            return null;
        }
    }
    public String validateStreet(String street) {
        if (street != null && street.length() > 0) {
            return street;
        } else {
            return null;
        }
    }
    public String validatePostalCode(String postalCode){
        if (postalCode != null && postalCode.length() == 5){
            boolean notValid = true;
            for(int i=0; i<=5; i++){
                if(notValid && Character.isDigit(postalCode.charAt(i))){}
                else notValid = false;
            }
            if (notValid){
                return postalCode;
            } else return null;
        } else return null;
    }

    public String getFormattedAddress() {
        String formatt = primaryStreet + "\n";
        if (secondaryStreet != null) {
            formatt+= secondaryStreet + "\n";
        }
        formatt += city + ", ";
        formatt += state + " ";
        formatt += postalCode;
        return formatt;
    }


}
