package main.gusev.java23.task1;

public class AlreadyExistsException extends  Exception{
    private String value;
    private int position;
    public AlreadyExistsException(String value, int position){
        super("Значение " + value + " уже было на позиции " + position);
        this.value = value;
        this.position = position;
    }
}
