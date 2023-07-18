package com.part04.day28.code.two;

import com.part04.day28.code.one.Assert;
import com.part04.day28.code.one.Text;
import org.junit.Test;

/**
 * @author aserendipper
 * @date 2023/7/18
 * @desc
 */
public class TextTest {
    
    @Test
    public void testToNumber() {
        Text text = new Text("123");
        Assert.assertEquals(123, text.toNumber());
    }
    
    @Test
    public void testToNumber_nullOrEmpty() {
        Text text = new Text(null);
        Assert.assertNull(text.toNumber());
        
        text = new Text("");
        Assert.assertNull(text.toNumber());
    }
    
    @Test
    public void testToNumber_containsLeadingAndTrailingSpaces() {
        Text text = new Text("123 ");
        Assert.assertEquals(123, text.toNumber());

        text = new Text(" 123");
        Assert.assertEquals(123, text.toNumber());
        
        text = new Text(" 123 ");
        Assert.assertEquals(123, text.toNumber());
    }
    
    @Test
    public void testToNumber_containsMultiLeadingAndTrailingSpaces() {
        Text text = new Text("123  ");
        Assert.assertEquals(123, text.toNumber());
        
        text = new Text("  123");
        Assert.assertEquals(123, text.toNumber());
        
        text = new Text("  123  ");
        Assert.assertEquals(123, text.toNumber());
    }
    
    @Test
    public void testToNumber_containsInvalidCharaters() {
        Text text = new Text("123a4");
        Assert.assertNull(text.toNumber());
        
        text = new Text("123 4");
        Assert.assertNull(text.toNumber());
    }
}
