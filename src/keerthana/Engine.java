package keerthana;

public class Engine {



    private String name;
    private String type;


    public String getName(){

        return this.name;
    }

    /*public void setName(String name){
        this.name  = name;
    }*/


    public String getType(){
        return  this.type;
    }
    /*public void setType(String type){
        this.type  = type;
    }*/




    public Engine(String name, String type){
        this.name = name;
        this.type = type;

    }
}
