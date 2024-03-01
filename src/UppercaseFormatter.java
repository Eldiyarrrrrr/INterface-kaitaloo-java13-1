public class UppercaseFormatter implements MessageFormatter{
    @Override
    public void messageFormate(String message) {
        System.out.println(message.toUpperCase());
    }
}
