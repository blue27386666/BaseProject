package com.github.blue27386666;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JohnsonTest {
    @Test
    public void getType() throws Exception {
        // Arrange
        Johnson triangle = new Johnson(5, 10, 5);

        // Act
        String result = triangle.getType();

        // Assert
        Assert.assertEquals("不是三角形", result);

    }

}
