package com.example.romannumerals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RomanNumeralsConvertorTest {

	private RomanNumeralsConvertor convertor = new RomanNumeralsConvertor();
	
	@Test
	public void testConvert_i_1() {
		assertEquals(1, convertor.convert("i"));
	}
	
	@Test
	public void testConvert_ii_2() {
		assertEquals(2, convertor.convert("ii"));
	}
	
	@Test
	public void testConvert_iii_3() {
		assertEquals(3, convertor.convert("iii"));
	}
	
	@Test
	public void testConvert_iv_4() {
		assertEquals(4, convertor.convert("iv"));
	}
	
	@Test
	public void testConvert_v_5() {
		assertEquals(5, convertor.convert("v"));
	}
	
	@Test
	public void testConvert_vi_6() {
		assertEquals(6, convertor.convert("vi"));
	}
	
	@Test
	public void testConvert_vii_7() {
		assertEquals(7, convertor.convert("vii"));
	}
	
	@Test
	public void testConvert_viii_8() {
		assertEquals(8, convertor.convert("viii"));
	}
	
	@Test
	public void testConvert_ix_9() {
		assertEquals(9, convertor.convert("ix"));
	}
	
	@Test
	public void testConvert_x_10() {
		assertEquals(10, convertor.convert("x"));
	}
	
	@Test
	public void testConvert_xi_11() {
		assertEquals(11, convertor.convert("xi"));
	}
	
	@Test
	public void testConvert_xi_12() {
		assertEquals(12, convertor.convert("xii"));
	}
	
	@Test
	public void testConvert_xiv_14() {
		assertEquals(14, convertor.convert("xiv"));
	}
	
	@Test
	public void testConvert_xvi_16() {
		assertEquals(16, convertor.convert("xvi"));
	}
	
	@Test
	public void testConvert_xix_19() {
		assertEquals(19, convertor.convert("xix"));
	}
	
	@Test
	public void testConvert_xx_20() {
		assertEquals(20, convertor.convert("xx"));
	}
	
	@Test
	public void testConvert_xxxix_39() {
		assertEquals(39, convertor.convert("xxxix"));
	}
	
	@Test
	public void testConvert_xl_40() {
		assertEquals(40, convertor.convert("xl"));
	}
	
	@Test
	public void testConvert_xli_41() {
		assertEquals(41, convertor.convert("xli"));
	}
	
	@Test
	public void testConvert_l_50() {
		assertEquals(50, convertor.convert("l"));
	}
	
	@Test
	public void testConvert_lxxxviii_88() {
		assertEquals(88, convertor.convert("lxxxviii"));
	}
}
