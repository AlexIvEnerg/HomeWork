public class PhoneExample {
    public static void main(String[] args) throws Exception {
        Phone phone1 = new Phone(223,34,40);
        Phone phone2 = new Phone(367,44,50);
        Phone phone3 = new Phone(586,54,45);

        System.out.println(phone1.getNumber() +" "+ phone2.getModel() +" "+ phone3.getWeight());

    }
}
