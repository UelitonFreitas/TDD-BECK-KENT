/**
 * Created by Ueliton on 06/09/2015.
 */
public class Par {

    private String de;
    private String para;

    public Par(String de, String para) {
        this.de = de;
        this.para = para;
    }

    @Override
    public boolean equals(Object object){
        Par par = (Par) object;
        return this.de.equals(par.de) && this.para.equals(par.para);
    }

    @Override
    public int hashCode(){
        return 0;
    }
}
