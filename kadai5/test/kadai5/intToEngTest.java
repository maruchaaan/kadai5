package kadai5;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;




public class intToEngTest {

	@Test
	public void translateEngで0と入力してzeroが出力される() {
		intToEng iTE = new intToEng();
		String expected = "zero";
		String actual = iTE.translateEng(0);
		assertThat(actual, is(expected));
		}

		@Test
	public void translateEngで12と入力してtwentyが出力される() {
		intToEng iTE = new intToEng();
		String expected = "twelve";
		String actual = iTE.translateEng(12);
		assertThat(actual, is(expected));
		}
		@Test
		public void translateEngで35と入力してthirtyfiveが出力される() {
			intToEng iTE = new intToEng();
			String expected = "thirty five";
			String actual = iTE.translateEng(35);
			assertThat(actual, is(expected));
			}
			
		@Test
		public void translateEngで100と入力してonehundredが出力される() {
			intToEng iTE = new intToEng();
			String expected = "one hundred ";
			String actual = iTE.translateEng(100);
			assertThat(actual, is(expected));
			}
		
		@Test
		public void translateEngで311と入力してthreehundredelevenが出力される() {
			intToEng iTE = new intToEng();
			String expected = "three hundred eleven";
			String actual = iTE.translateEng(311);
			assertThat(actual, is(expected));
			}
		@Test
		public void translateEngで1257と入力してthreehundredelevenが出力される() {
			intToEng iTE = new intToEng();
			String expected = "one thousand two hundred fifty seven";
			String actual = iTE.translateEng(1257);
			assertThat(actual, is(expected));
			}
		
		@Test
		public void translateEngで10000と入力してtenthousandが出力される() {
			intToEng iTE = new intToEng();
			String expected = "ten thousand ";
			String actual = iTE.translateEng(10000);
			assertThat(actual, is(expected));
			}
	}


