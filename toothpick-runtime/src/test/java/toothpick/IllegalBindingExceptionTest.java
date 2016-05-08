package toothpick;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class IllegalBindingExceptionTest {

  @Test
  public void testConstructor_shouldCreateEmptyMessage_whenNotPassedAMessage() throws Exception {
    //GIVEN

    //WHEN
    IllegalBindingException exception = new IllegalBindingException();

    //THEN
    assertThat(exception.getMessage(), is(""));
  }

  @Test
  public void testConstructor_shouldCreateMessage_whenPassedAMessage() throws Exception {
    //GIVEN

    //WHEN
    IllegalBindingException exception = new IllegalBindingException("Foo");

    //THEN
    assertThat(exception.getMessage(), is("Foo"));
  }

  @Test
  public void testConstructor_shouldCreateCause_whenPassedACause() throws Exception {
    //GIVEN
    Exception cause = new Exception();

    //WHEN
    IllegalBindingException exception = new IllegalBindingException(cause);

    //THEN
    assertThat(exception.getMessage(), is(""));
    assertThat(exception.getCause(), is(cause));
  }

  @Test
  public void testConstructor_shouldCreateMessageAndCause_whenPassedAMessageAndCause() throws Exception {
    //GIVEN
    Exception cause = new Exception();

    //WHEN
    IllegalBindingException exception = new IllegalBindingException("Foo", cause);

    //THEN
    assertThat(exception.getMessage(), is("Foo"));
    assertThat(exception.getCause(), is(cause));
  }
}