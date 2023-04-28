// update the class
class MyException extends Throwable{
    protected String message;
    public MyException(String message){
        super(message);
        this.message = super.getMessage();
    }
}
class Main {
    public static void main(String[] args) {
        MyException myException = new MyException("This is a custom exception");
        System.out.println(myException.getMessage());
        Class<?> superClass = myException.getClass().getSuperclass();
        System.out.println(superClass.equals(Throwable.class));
    }
}
