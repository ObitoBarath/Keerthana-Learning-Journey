package management.Hospital;

public class Ward {
    private Integer wardNumber;
    private Doctor doc;
    private Patient pat;
    public Ward(Integer wardNumber, Doctor doc, Patient pat){
        this.wardNumber=wardNumber;
        this.doc=doc;
        this.pat=pat;

    }
    public Integer getWard(){
        return this.wardNumber;
    }
    public Doctor getDoc(){
        return this.doc;
    }
    public Patient getPat(){
        return this.pat;
    }


}
