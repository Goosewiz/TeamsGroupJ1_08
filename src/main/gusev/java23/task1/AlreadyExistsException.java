package main.gusev.java23.task1;

public class AlreadyExistsException extends  Exception{
    private String value;
    private int position;
    public AlreadyExistsException(String value, int position){
        super("Значение " + value + " уже было на позиции " + position);
        this.value = value;
        this.position = position;
    }
    public String getValue(){
        return this.value;
    }
    public void setValue(String value){
        this.value = value;
    }
    public int getPosition(){
        return this.position;
    }
    public void setPosition(int position){
        this.position = position;
    }
}
