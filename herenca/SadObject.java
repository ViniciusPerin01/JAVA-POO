/* 
*
 * @author Maycon de Moraes
 * @date 07/03/2017
 */
package herenca;

public class SadObject extends MoodyObject {
    public void cry(){
        System.out.println("buuuuuuaaaaabuuuuaaaa");
    }
    
    @Override
    protected String getMood(){
        return "triste";
    }
 
}
