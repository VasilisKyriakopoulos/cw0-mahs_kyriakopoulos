public class word {
    private String text;
    private int num;
    public word(String word){
        this.text = word;
        this.num = 1;
    }
    public String getWord(){
        return this.text;
    }
    public int getNum(){
        return this.num;
    }
    public int incNum(){
        return this.num++;
    }
    public String toString(){
        return this.text + this.num ;
    }   
}
