package main.gusev.java23.task2;

public enum Directions {
    UP("Вверх", 2191, new int[]{0, 1}),
    DOWN("Вниз", 2193, new int[]{0, -1}),
    LEFT("Влево", 2190, new int[]{-1, 0}),
    RIGHT("Вправо", 2192, new int[]{1, 0});
    private String russianName;
    private int symbolCode;
    private int[] direction;
    Directions(String name, int symbolCode, int[] direction){
        this.russianName = name;
        this.symbolCode = symbolCode;
        this.direction = direction;
    }
    public String getRussianName(){
        return this.russianName;
    }
    public void setRussianName(String russianName){
        this.russianName = russianName;
    }
    public int getSymbolCode(){
        return this.symbolCode;
    }
    public void setSymbolCode(int symbolCode){
        this.symbolCode = symbolCode;
    }
    public int[] getDirection(){
        return this.direction;
    }
    public void setDirection(int[] direction){
        this.direction = direction;
    }
}
