package com.part04.day28.code.one;

/**
 * @author aserendipper
 * @date 2023/7/18
 * @desc
 */
public class TextTest {
    public void testToNumber() {
        Text text = new Text("123");
        Assert.assertEquals(123, text.toNumber());
    }
    
    public void testToNumber_nullOrEmpty() {
        Text text = new Text(null);
        Assert.assertNull(text.toNumber());
        
        text = new Text("");
        Assert.assertNull(text.toNumber());
    }
    
    public void testToNumber_containsLeadingAndTrailingSpaces() {
        Text text = new Text("123 ");
        Assert.assertEquals(123, text.toNumber());

        text = new Text(" 123");
        Assert.assertEquals(123, text.toNumber());
        
        text = new Text(" 123 ");
        Assert.assertEquals(123, text.toNumber());
    }
    
    public void testToNumber_containsMultiLeadingAndTrailingSpaces() {
        Text text = new Text("123  ");
        Assert.assertEquals(123, text.toNumber());
        
        text = new Text("  123");
        Assert.assertEquals(123, text.toNumber());
        
        text = new Text("  123  ");
        Assert.assertEquals(123, text.toNumber());
    }
    
    public void testToNumber_containsInvalidCharaters() {
        Text text = new Text("123a4");
        Assert.assertNull(text.toNumber());
        
        text = new Text("123 4");
        Assert.assertNull(text.toNumber());
    }
}
