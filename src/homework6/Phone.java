package homework6;

public class Phone {
    private int id;
    private String name;
    private String surname;
    private String fatherName;
    private long phoneNumber;
    private String address;
    private String creditCard;
    private long debit;
    private long credit;
    private double cityTime;
    private int internationalTime;
    private int internetTraffic;


    public Phone(int id, String name, String surname, String fatherName, long phoneNumber,
                 String address, String creditCard, long debit, long credit, double cityTime,
                 int internationalTime, int internetTraffic) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.fatherName = fatherName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.creditCard = creditCard;
        this.debit = debit;
        this.credit = credit;
        this.cityTime = cityTime;
        this.internationalTime = internationalTime;
        this.internetTraffic = internetTraffic;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFatherName() {
        return fatherName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public long getDebit() {
        return debit;
    }

    public long getCredit() {
        return credit;
    }

    public double getCityTime() {
        return cityTime;
    }

    public int getInternationalTime() {
        return internationalTime;
    }

    public int getInternetTraffic() {
        return internetTraffic;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public void setDebit(long debit) {
        this.debit = debit;
    }

    public void setCredit(long credit) {
        this.credit = credit;
    }

    public void setCityTime(double cityTime) {
        this.cityTime = cityTime;
    }

    public void setInternationalTime(int internationalTime) {
        this.internationalTime = internationalTime;
    }

    public void setInternetTraffic(int internetTraffic) {
        this.internetTraffic = internetTraffic;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                ", creditCard=" + creditCard +
                ", debit=" + debit +
                ", credit=" + credit +
                ", cityTime=" + cityTime +
                ", internationalTime=" + internationalTime +
                ", internetTraffic=" + internetTraffic +
                '}';
    }
}
