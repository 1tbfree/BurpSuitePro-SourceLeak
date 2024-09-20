/*    */ package org.brotli.dec;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ final class Prefix
/*    */ {
/* 19 */   static final int[] BLOCK_LENGTH_OFFSET = new int[] { 1, 5, 9, 13, 17, 25, 33, 41, 49, 65, 81, 97, 113, 145, 177, 209, 241, 305, 369, 497, 753, 1265, 2289, 4337, 8433, 16625 };
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 24 */   static final int[] BLOCK_LENGTH_N_BITS = new int[] { 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 8, 9, 10, 11, 12, 13, 24 };
/*    */ 
/*    */ 
/*    */   
/* 28 */   static final int[] INSERT_LENGTH_OFFSET = new int[] { 0, 1, 2, 3, 4, 5, 6, 8, 10, 14, 18, 26, 34, 50, 66, 98, 130, 194, 322, 578, 1090, 2114, 6210, 22594 };
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 33 */   static final int[] INSERT_LENGTH_N_BITS = new int[] { 0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 12, 14, 24 };
/*    */ 
/*    */ 
/*    */   
/* 37 */   static final int[] COPY_LENGTH_OFFSET = new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 18, 22, 30, 38, 54, 70, 102, 134, 198, 326, 582, 1094, 2118 };
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 42 */   static final int[] COPY_LENGTH_N_BITS = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 24 };
/*    */ 
/*    */ 
/*    */   
/* 46 */   static final int[] INSERT_RANGE_LUT = new int[] { 0, 0, 8, 8, 0, 16, 8, 16, 16 };
/*    */ 
/*    */ 
/*    */   
/* 50 */   static final int[] COPY_RANGE_LUT = new int[] { 0, 8, 0, 8, 16, 0, 16, 8, 16 };
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\brotli\dec\Prefix.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */