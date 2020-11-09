public class AccountOwner {
    private String salutation;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private long phoneNumber;
    private MailingAddress mailingAddress;

    public AccountOwner(String salutation, String firstName, String lastName, String emailAddress, long phoneNumber, MailingAddress mailingAddress) {
        this.salutation = salutation;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.mailingAddress = mailingAddress;
    }
    public java.lang.String getName(int format) {
if (format == 3) {
    return lastName + ", " + firstName;
} else if (format == 2) {
    return salutation + ". " + lastName;
} else {
    return firstName + " " + lastName;
}
    }

    public java.lang.String getFormattedPhoneNumber() {
        String input = String.valueOf(phoneNumber);
        String number = input.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
        return input;
    }

    public java.lang.String validateSalutation(java.lang.String salutation) {
       if (salutation.length() < 1 || salutation == null) {
           return null;
       } else {
           return salutation;
       }
    }

    public java.lang.String validateEmailAddress(java.lang.String emailAddress) {
        if (!(emailAddress.length() < 7) || !(emailAddress.length() > 254) || !(emailAddress.contains("@")) || !(emailAddress.contains(".")) || !(emailAddress.charAt(0) == '@') || !(emailAddress.charAt(emailAddress.length() - 1) == '@') || !(emailAddress.charAt(0) == '.') || !(emailAddress.charAt(emailAddress.length() - 1) == '.') || (emailAddress.indexOf(".") < emailAddress.indexOf("@") - 1) || (emailAddress.length() - 1 - emailAddress.lastIndexOf(".") != 3)){ return null;
        } else {
            return emailAddress;
        }
    }
    public long validatePhoneNumber(long phoneNumber) {
       String phone = String.valueOf(phoneNumber);
        if (phone.length() == 10) {
            return phoneNumber;
        } else {
            return 0L;
        }
    }
    public java.lang.String getSalutation(){
        if (this.salutation != null) {
            return this.salutation;
        } else {
            return null;
        }
    }

    public java.lang.String getFirstName(){
        if (this.firstName != null) {
            return this.firstName;
        } else {
            return null;
        }
    }
    public java.lang.String getLastName(){
        if (this.lastName != null) {
            return this.lastName;
        } else {
            return null;
        }
    }

    public java.lang.String getEmailAddress() {
        if(this.emailAddress != null) {
            return this.emailAddress;
        } else {
            return null;
        }
    }

    public long getPhoneNumber() {
        this.phoneNumber = phoneNumber;
        return phoneNumber;
    }
    public MailingAddress getMailingAddress() {
        return mailingAddress;
    }

    public void setFirstName(java.lang.String firstName) {
this.firstName = firstName;
    }
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setMailingAddress(MailingAddress mailingAddress) {
        this.mailingAddress = mailingAddress;
    }
    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }
}
