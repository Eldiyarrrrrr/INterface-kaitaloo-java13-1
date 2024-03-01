public class LowercaseFormetter implements MessageFormatter{
    @Override
    public void messageFormate(String message) {
        System.out.println(message.toLowerCase());
    }
}
