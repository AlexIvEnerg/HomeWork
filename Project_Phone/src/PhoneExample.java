public class PhoneExample {
    public static void main(String[] args) throws Exception {
        Phone phone1 = new Phone(223,34,40);
        Phone phone2 = new Phone(367,44,50);
        Phone phone3 = new Phone(586,54,45);        
        output(phone1,phone2,phone3);
        System.out.println();
        phone1.receiveCall("Elton");
        System.out.println(phone1.getNumber());
        phone2.receiveCall("John");
        System.out.println(phone2.getNumber());
        phone3.receiveCall("Bill");
        System.out.println(phone3.getNumber());

        phone1.receiveCall("Bill",322);
        phone2.receiveCall("John",763);
        phone3.receiveCall("Elton",685);
        sendMessage(322);

    }
    public static void sendMessage(int... numbForSMS) {
        for (int numb : numbForSMS) {
            System.out.print(numb + " ");
        }    
    }
    public static void output(Phone... phones) {
        System.out.println(" ");
        for (Phone phoneN : phones) {
            System.out.print(phoneN.getNumber()+" ");
            System.out.print(phoneN.getModel()+" ");
            System.out.println(phoneN.getWeight());
        }
    }
}
