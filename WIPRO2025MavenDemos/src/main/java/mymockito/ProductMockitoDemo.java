package mymockito;
/*
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
*/
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

//@RunWith(MockitoJUnitRunner.class)//enable mockito
public class ProductMockitoDemo {

    @InjectMocks
    ProductService123 productService;//class 
    
    @Mock
    ProductRepository123 productRepository;//interface
    
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this); // Initializes @Mock and @InjectMocks
    }
    @Test
    public void testGetProductName() 
    {
        // Arrange
        Product123 mockProduct = new Product123(101, "Laptop", 75000);
        when(productRepository.findProductById(101)).thenReturn(mockProduct);
        
        // Act
        String name = productService.getProductName(101);
        
     // Assert
        verify(productRepository, times(1)).findProductById(101); // Mockito verify
        assert name.equals("Laptop");


    }
    


}
