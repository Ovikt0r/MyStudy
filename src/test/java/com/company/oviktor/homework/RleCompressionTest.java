package com.company.oviktor.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RleCompressionTest {

        @Test
        public void encodeEmpty() {
            RleCompression rleC = new RleCompression();
            String actual = rleC.encode("");
            String expected = "";
            assertEquals(expected, actual);
        }

        @Test
        public void decodeEmpty() {
            RleCompression rleC = new RleCompression();
            String actual = rleC.decode("");
            String expected = "";
            assertEquals(expected, actual);
        }

        @Test
        public void encodeOneLetter() {
            RleCompression rleC = new RleCompression();
            String actual = rleC.encode("rMPfglkWaZx");
            String expected = "r1M1P1f1g1l1k1W1a1Z1x1";
            assertEquals(expected, actual);
        }

        @Test
        public void decodeOneLetter() {
            RleCompression rleC = new RleCompression();
            String actual = rleC.decode("m1B1t1L1P1f1W1y1");
            String expected = "mBtLPfWy";
            assertEquals(expected, actual);

        }

        @Test
        public void encodeNormal() {
            RleCompression rleC = new RleCompression();
            String actual = rleC.encode("ffffffffffHHHHkkNNNNaaaPPQQQss");
            String expected = "f10H4k2N4a3P2Q3s2";
            assertEquals(expected, actual);
        }

        @Test
        public void decodeNormal() {
            RleCompression rleC = new RleCompression();
            String actual = rleC.decode("g13t6N3p2K9v17");
            String expected = "gggggggggggggttttttNNNppKKKKKKKKKvvvvvvvvvvvvvvvvv";
            assertEquals(expected, actual);
        }

        @Test
        public void encodeNumbers() {
            RleCompression rleC = new RleCompression();
            String actual = rleC.encode("99998844444666333333333222222");
            String expected = "948245633926";
            assertEquals(expected, actual);

        }
    }