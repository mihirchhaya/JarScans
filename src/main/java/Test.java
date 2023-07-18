import org.mybatis.cdi.Transactional;

public class Test {
    public static void main(){
    
    }
    
   @Transactional
   public void saveTest(){
       System.out.println ("Save information");
   }
}
