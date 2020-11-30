package usantatecla;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ClosedMaxTest extends MaxTest {

  @Override
  protected SubInterval createMax() {
    return new ClosedMax(this.point.getEquals());
  }

  @Test
  @Override
  public void givenMinWhenIsWithinWithEqualsValue(){
    assertTrue(this.subInterval.isWithin(this.point.getEquals()));
  }
  
}
