public class Bank {
    public static void main(String[] args) {
        try {
            Client Tanya = new Client("Tanya", -56);
            if (Tanya.age < 0) {
                throw new Exception("Oops");
            }
        }
        catch (Exception e){
            System.out.println("Возраст не может быть меньше 0");
            }
        System.out.println();
        }
    }
