import a.package1.MaxProductTriplet;
import org.junit.Assert;
import org.junit.Test;

public class MaxProductTripletTest {
  @Test
  public  void maxProductTripletTest(){
     // given
      MaxProductTriplet m = new MaxProductTriplet();
       Integer[]arr = {-111,-110,-109,-996,-555,-234,-33,0,34,777,112,113,114};
      Integer expected = 429510060;

      Integer actual = m.find(arr);
      Assert.assertEquals(expected,actual);
  }
}
