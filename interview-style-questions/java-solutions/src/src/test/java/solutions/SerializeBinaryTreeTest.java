package solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SerializeBinaryTreeTest {

    @Test
    public void testSerializeAndDeserialize(){

        SerializeBinaryTree test = new SerializeBinaryTree();
        assertEquals("1 2 3 null null 4 5 null null null null ", test.serialize(test.deserialize("1 2 3 null null 4 5")));
    }
}