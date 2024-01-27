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
}
